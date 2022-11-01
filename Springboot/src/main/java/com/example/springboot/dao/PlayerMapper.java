package com.example.springboot.dao;

import com.example.springboot.pojo.Department;
import com.example.springboot.pojo.Designer;
import com.example.springboot.pojo.Player;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayerMapper {
    List<Designer> getDesigner();

    int addDesigner(Designer designer);

    int deleteDesigner(int id);

    List<Player> getPlayer();

    List<Department> getDepartment(@Param("id") int id);

    //@Param是mybatis中的一个给形参取别名的注解，优先级高于形参名字，可以规范开发
    /* Department department(@Param("id") int id);*/
    Department department(int id);
}
