package spring.aop.staticproxy;

public class EmployeeServiceImpl implements IEmployeeService{

	@Override
	public void save() {
		System.out.println("save...");
	}

}
