package spring.beans.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
	public static void main(String[] args) throws SQLException {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");
		DataSource ds = (DataSource) ctx.getBean("datasource");
		System.out.println(ds.getConnection());
		((AbstractApplicationContext) ctx).close();
	}
}
