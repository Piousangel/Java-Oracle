package test.jdbc.home;

import org.apache.ibatis.session.SqlSession;
import test.jdbc.bean.MybatisConnectionFactory;

public class BookMain {
	
	public static void main(String[] args ) {
		
		SqlSession sql = MybatisConnectionFactory.getSqlSession();
		
		int count = sql.selectOne("book.bookCount");
		System.out.println("전체 책 권수 : " + count);
		sql.close();
	}

}
