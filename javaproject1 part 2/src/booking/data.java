package booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class data {
	static HashMap<Integer,bus> data1=new HashMap<>();
	public static void getdata()  throws ClassNotFoundException, SQLException {
		String jdbcURL="jdbc:mysql://localhost:3306/mydb1";
		String dbname="root";
		String dbpassword="Password@12";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(jdbcURL,dbname,dbpassword);
		Statement stmt=con.createStatement();
		
		
		
	
		
		
		String q="select * from busroute";
		ResultSet rs=stmt.executeQuery(q);

		while(rs.next()) {
			int routeid =rs.getInt("routeid");
			String from1=rs.getString("from1");
			String To1=rs.getString("To1");
			int ReaminingSeats =rs.getInt("ReaminingSeats");
			int cost =rs.getInt("cost");
			data1.put(routeid,new bus(routeid,from1,To1,ReaminingSeats,cost));
			
			
			
			
		}
	
		
		con.close();
		
	}
	public static void putdata(int buyid,int tickets) throws ClassNotFoundException, SQLException {
		String jdbcURL="jdbc:mysql://localhost:3306/mydb1";
		String dbname="root";
		String dbpassword="Password@12";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(jdbcURL,dbname,dbpassword);
		

		String q="UPDATE busroute SET ReaminingSeats=? WHERE routeid=?" ;
		PreparedStatement pstmt = con.prepareStatement(q);
		for(Entry<Integer, bus> e :data1.entrySet()) {
			bus a=e.getValue();
			if(a.routeid==buyid) {
				pstmt.setInt(1,a.ReaminingSeats-tickets);
				pstmt.setInt(2,a.routeid);
				
				
			}
			pstmt.executeUpdate();
			
			
		}
		
		
	}
}
