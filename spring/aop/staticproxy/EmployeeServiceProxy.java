package spring.aop.staticproxy;

public class EmployeeServiceProxy implements IEmployeeService {
	private IEmployeeService target;
	
	public EmployeeServiceProxy(IEmployeeService target) {
		super();
		this.target = target;
	}
	
	@Override
	public void save() {
		target.save();
	}

}
