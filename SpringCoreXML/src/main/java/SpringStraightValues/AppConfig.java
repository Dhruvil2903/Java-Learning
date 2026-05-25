package SpringStraightValues;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(destroyMethod = "close")
	public DataSource myDataSource() {
		BasicDataSource source = new BasicDataSource();

		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/user");
		source.setUsername("root");
		source.setPassword("Dhruvil9094");
		return source;

	}

	@Bean
	public UserDao userDao(DataSource dataSource) {
		UserDao userDao = new UserDao();
		userDao.setDataSource(dataSource);
		return userDao;
	}
}
