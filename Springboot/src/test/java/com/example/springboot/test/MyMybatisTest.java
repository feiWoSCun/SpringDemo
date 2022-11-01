package com.example.springboot.test;

import com.example.springboot.Utils.MyBatisUtils;
import com.example.springboot.dao.PlayerMapper;
import com.example.springboot.pojo.Designer;
import com.example.springboot.pojo.Player;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

public class MyMybatisTest {
    @Test
    public void test(){
  /*      List<Designer> designer = MyBatisUtils.getSqlSessionFactory().getMapper(DesignerDao.class).getDesigner();
        for (Designer designer1 : designer) {
            System.out.println(designer1);
            System.out.println(designer1.getClass().getTypeParameters());
        }*/
        Designer luobin = new Designer(514, 7, "罗彬", new Date(), 9000);
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory();
        PlayerMapper mapper = sqlSession.getMapper(PlayerMapper.class);
        try {
            mapper.addDesigner(luobin);
        }
        finally{
            sqlSession.commit();
        }
    }
    @Test
    public void ChildSelect(){
        List<Player> player = MyBatisUtils.getSqlSessionFactory().getMapper(PlayerMapper.class).getPlayer();
        for (Player player1 : player) {
            System.out.println(player1);
        }
    }
    @Test
    public void selectPlayer(){
        List<Player> player = MyBatisUtils.getSqlSessionFactory().getMapper(PlayerMapper.class).getPlayer();
        for (Player player1 : player) {
            System.out.println(player1);
        }
    }
}
