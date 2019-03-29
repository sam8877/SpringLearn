package spring.aop.staticproxy;

public class Main {
	public static void main(String[] args) {
		//IEmployeeService target = new EmployeeServiceImpl();
		IEmployeeService service = new EmployeeServiceProxy(new EmployeeServiceImpl());
		service.save();
	}
}
