package spring.beans.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) ctx.getBean("person5");
		System.out.println(person);
		
		NewPerson newperson = (NewPerson) ctx.getBean("newperson");
		System.out.println(newperson);
		
		DataSource ds = (DataSource) ctx.getBean("datasource");
		System.out.println(ds.getProperties());
		System.out.println(ds);
		
		((AbstractApplicationContext) ctx).close();
		
		
	}
}
