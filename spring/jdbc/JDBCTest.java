package spring.jdbc;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTest {
	
	private ApplicationContext ctx = null;
	private DataSource dataSource = null;
	private JdbcTemplate jdbcTemplate = null;
	
	
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		System.out.println(dataSource.getConnection());
		System.out.println(jdbcTemplate);
		
		((AbstractApplicationContext) ctx).close();
		
	}
	
	
	private void testupdate() {
		
	}
}
