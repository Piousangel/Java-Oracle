package Day0813;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DBConnection {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@nullmaster.iptime.org:1521:orcl";
			String user = "class01", pw ="class01";
			
			Connection conn = DriverManager.getConnection(url,user,pw);
			
			PreparedStatement pst = conn.prepareStatement("select * from dept");
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno+ " - " + dname+" - "+ loc);
				
			}
			
			rs.close();
			pst.close();
			conn.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
