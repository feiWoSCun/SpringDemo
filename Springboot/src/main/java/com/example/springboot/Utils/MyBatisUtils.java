package com.example.springboot.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


//这个工具类包括两件事，加载xml，实例化sqlSessionFactory
//2.返回sqlSession的实例
public class MyBatisUtils {
//静态代码块，类加载的时候加载进去配置文件，返回sqlSessionFactory
   private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            String resource = "Mybatis-config.xml";
            InputStream inputStream= Resources.getResourceAsStream(resource);
           sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public  static  SqlSession getSqlSessionFactory(){
       return sqlSessionFactory.openSession();
    }
}
