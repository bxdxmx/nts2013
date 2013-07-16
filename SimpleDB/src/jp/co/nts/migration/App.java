package jp.co.nts.migration;

import com.googlecode.flyway.core.Flyway;

public class App {
	public static void main(String[] args) {
		// Create the Flyway instance
		Flyway flyway = new Flyway();
		
		// Point it to the database
		flyway.setDataSource("jdbc:h2:file:sample_db", "sa", null);
		
		// start the migration
		flyway.migrate();
	}
}
