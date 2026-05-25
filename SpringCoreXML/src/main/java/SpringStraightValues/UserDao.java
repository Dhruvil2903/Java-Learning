package SpringStraightValues;

import javax.sql.DataSource;

public class UserDao {
	 private DataSource dataSource;

	    // Setter injection
	    public void setDataSource(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }

	    public void testConnection() throws Exception {
	        System.out.println("Got Connection: " + dataSource.getConnection());
	    }
}
