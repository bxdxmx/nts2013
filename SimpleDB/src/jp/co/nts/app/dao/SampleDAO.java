package jp.co.nts.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SampleDAO {

	public SampleDAO() {
	}

	public List<String> getSampleDatas() throws SQLException {
		ArrayList<String> list = new ArrayList<>();

		try (Connection connection = DriverManager.getConnection(
				"jdbc:h2:file:sample_db", "sa", null);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select NAME from PERSON")) {

			while (resultSet.next()) {
				String str = resultSet.getString(1);
				list.add(str);
			}

			return list;
		}
	}

}
