package test.jdbc.bean;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MybatisConnectionFactory {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			
			Reader reader = Resources.getResourceAsReader("test/jdbc/myclass/mybatis_config.xml");
			if(sqlSessionFactory == null) {
				
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static SqlSession getSqlSession() {
		
		return sqlSessionFactory.openSession();
	}

}
