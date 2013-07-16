package jp.co.nts.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleV1 {
	public static void main(String[] args) {
		try (Connection connection =
				DriverManager.getConnection("jdbc:h2:file:sample_db", "sa", null);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select NAME from PERSON")) {
		
			while(resultSet.next()) {
				String str = resultSet.getString(1);
				System.out.println(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
