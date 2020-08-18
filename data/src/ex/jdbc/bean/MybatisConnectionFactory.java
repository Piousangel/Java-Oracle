package ex.jdbc.bean;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.*;

public class MybatisConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		
		
		try {
			
			Reader reader = Resources.getResourceAsReader("ex/jdbc/myclass/mybatis_config.xml");
			
			if(sqlSessionFactory== null) {
				
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
