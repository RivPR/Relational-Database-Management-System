package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RequestDBDao implements RequestDao {
	private final String DRIVER_CLASS_NAME="com.mysql.jdbc.Driver";
	private final String URL="jdbc:mysql://localhost:3306/companydb";
	
	@Override
	public String executeQuery(String str) {
		String input = str;
		try{
			Class.forName(DRIVER_CLASS_NAME);
			
			Connection conn = DriverManager.getConnection(URL, "student", "student" );
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(input);
			while(rs.next()){
				
			}
			
			rs.close();
			statement.close();
			conn.close();	
		}catch(Exception e){
			System.err.println("The error was: " + e );
		}
		return input;
	}
	
	
}
