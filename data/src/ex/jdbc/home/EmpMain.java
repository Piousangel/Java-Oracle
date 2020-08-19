package ex.jdbc.home;

import org.apache.ibatis.session.SqlSession;

import ex.jdbc.bean.EmpDTO;
import ex.jdbc.bean.MybatisConnectionFactory;
import java.util.*;

public class EmpMain {

	public static void main(String[] args) {
		
		SqlSession sql = MybatisConnectionFactory.getSqlSession();
		
		List all = sql.selectList("emp.empALL");
		
		
		for(int i = 0;i <= all.size(); i++) {
			EmpDTO dto =(EmpDTO)all.get(i);
			System.out.println(dto.getEmpno() + " - " + dto.getEname()+" - "+ dto.getJob());
			System.out.println("-----------------");
			
		}
		

	}

}
