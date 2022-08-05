package top.mhpsy.mybatis2.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils {
    public static SqlSession getSqlSession() {
        String resource = "mybatis-config.xml";
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            is = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }
}
