package spring.tx.xml;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class SpringTransactionTest {

	
	public void testBookShopDaoFindPriceByIsbn() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		BookShopDao bookShopDao = ctx.getBean(BookShopDao.class);
		System.out.println(bookShopDao.findBookPriceByIsbn("1002"));
	}
	
	public void testBookShopDaoUpdateBookStock() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		BookShopDao bookShopDao = ctx.getBean(BookShopDao.class);
		bookShopDao.updateBookStock("1002");
	}
	
	public void testBookShopDaoUpdateUserAccount() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		BookShopDao bookShopDao = ctx.getBean(BookShopDao.class);
		bookShopDao.updateUserAccount("jack", 20);
	}
	
	public void testBookShopService() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		BookShopService bookShopService = ctx.getBean(BookShopService.class);
		bookShopService.purchase("jack", "1001");
	}
	
	public void testTransactionalPropagation() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		Cashier cashier = ctx.getBean(Cashier.class);
		cashier.checkout("jack", Arrays.asList("1001", "1002", "1003"));
	}

	public static void main(String[] args) {
		SpringTransactionTest springTransactionTest = new SpringTransactionTest();
		//springTransactionTest.testBookShopDaoFindPriceByIsbn();
		//springTransactionTest.testBookShopDaoUpdateUserAccount();
		//springTransactionTest.testBookShopDaoUpdateBookStock();
		//springTransactionTest.testBookShopService();
		springTransactionTest.testTransactionalPropagation();
	}
}
