package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public class test {
	public static vo.test getConnection() {
		vo.test t = new vo.test();
		String sql = "select * from `mydb.test`";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1004");
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				t.setId(rs.getString("id"));
				t.setPwd(rs.getString("pwd"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return t;
		}
	}
}
