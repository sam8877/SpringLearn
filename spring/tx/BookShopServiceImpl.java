package spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService {

	@Autowired
	private BookShopDao bookShopDao;
	
	//添加事务注解
	//1.指定事务的传播行为,即当前的事务方法被另外一个事务方法调用时如何使用事务,
	//默认取值为 REQUIRED, 即调用方法的事务
	//可设置为REQUIRED_NEW
	//区别,REQUIRED_NEW可完成任务中的一部分
	//2.使用isolation指定事务的隔离级别, 最常用的取值为READ_COMMITTED(读已提交)
	//3.默认Spring的声明式事务对所有运行时事务进行回滚,也可以通过对应属性进行设置
	//通常情况下默认值即可(noRollbackFor= {UserAccountException.class})
	//4.readonly 指定事务是否为只读,表示这个事务之读取数据但是不更新数据,这样可以帮助数据库引擎优化事务,
	//若真的是一个只读取数据库值的方法,应设置为readonly=true
	//5.使用timeout指定强制强制回滚事务之前事务可以占用的时间,占用时间过长则强制回滚
	@Transactional(propagation=Propagation.REQUIRED, 
			isolation=Isolation.READ_COMMITTED,
			readOnly=false,
			timeout=3)
	@Override
	public void purchase(String username, String isbn) {
		//1.获取书的单价
		int price = bookShopDao.findBookPriceByIsbn(isbn);
		//2.更新书的库存
		bookShopDao.updateBookStock(isbn);
		//3.更新用户余额
		bookShopDao.updateUserAccount(username, price);
	}

}
