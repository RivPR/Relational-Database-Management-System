package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class RowDBDao {
	private final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/companydb";

	public ArrayList<ArrayList<String>> executeQuery(String str) {
		ArrayList<String> tinyRow = new ArrayList<>();
		String input = str;
		ArrayList<ArrayList<String>> aL = new ArrayList<>();
		try {
			Class.forName(DRIVER_CLASS_NAME);

			Connection conn = DriverManager.getConnection(URL, "student", "student");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(input);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();
			ArrayList<String> headerRow = new ArrayList<>();

			for (int i = 1; (i <= columns); i++) {
				headerRow.add((rsmd.getColumnName(i)));
			}
			
			aL.add(headerRow);

			while (rs.next()) {
				for (int i = 1; (i < columns); i++) {
					tinyRow.add(rs.getString(i));
				}
				aL.add(tinyRow);
			}

			rs.close();
			statement.close();
			conn.close();
		} catch (Exception e) {
			System.err.println("The error was: " + e);
		}

		return aL;
	}

}
