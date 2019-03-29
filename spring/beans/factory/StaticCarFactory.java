package spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法：直接用一个类的静态方法就可以返回bean实例
 * @author zj342
 *
 */

public class StaticCarFactory {

	private static Map<String, Car> cars= new HashMap<String, Car>();
	
	static {
		cars.put("audi", new Car("audi", 300000));
		cars.put("Ford", new Car("ford", 400000));
	}
	
	private static Car getCar(String name) {
		return cars.get(name);
	}
}
