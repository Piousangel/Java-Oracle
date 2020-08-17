package Day0813;

import java.sql.*;
import java.util.*;

public class EmpNo {

	public static void main(String[] args) {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@nullmaster.iptime.org:1521:orcl";
			String user = "class01", pw = "class01";
			
			Connection conn = DriverManager.getConnection(url, user, pw);
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("사원번호 입력 :");
			
			int empno = scan.nextInt();
			String sql = "select * from emp where empno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				
			System.out.println("사원이름: "+ename);
			System.out.println("직무: "+ job);
			System.out.println("급여:" +mgr);
						
				
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
