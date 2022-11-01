package JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        DruidDataSource bean = applicationContext.getBean("dataSource", DruidDataSource.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "select* from department where number=114";
        // RowMapperTest query = (RowMapperTest)jdbcTemplate.queryForObject(sql, new MyRowMapper());
        // query.toString();
        //实现查询，new BeanPropertyRowMapper<>(RowMapperTest.class)，是让查询的返回值以自定义的RowMapperTest对象返回
        RowMapperTest test = (RowMapperTest) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(RowMapperTest.class));
        System.out.println(test);
        List<Object[]> myList = new LinkedList<>();
        Object[] obj1 = {"156", "新加入", "cqupt"};
        myList.add(obj1);
        String sql1 = "insert department values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql1, myList);
        Arrays.toString(ints);
    }
}
