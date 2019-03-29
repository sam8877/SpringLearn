package spring.tx.xml;

import java.util.List;

public class CashierImpl implements Cashier {

	private BookShopService bookService;
	
	public void setBookService(BookShopService bookService) {
		this.bookService = bookService;
	}
	
	@Override
	public void checkout(String username, List<String> isbns) {
		for(String isbn : isbns) {
			bookService.purchase(username, isbn);
		}
	}

}
