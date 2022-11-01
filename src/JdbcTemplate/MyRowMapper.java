package JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
@Transactional
public class MyRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        RowMapperTest rowMapperTest = new RowMapperTest();
        rowMapperTest.setNumber(resultSet.getString("number"));
        rowMapperTest.setName(resultSet.getString("name"));
        rowMapperTest.setLocation(resultSet.getString("location"));
        return rowMapperTest;
    }
}
