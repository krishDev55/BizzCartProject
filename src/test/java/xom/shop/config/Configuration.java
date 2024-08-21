package xom.shop.config;

import org.springframework.test.context.event.annotation.AfterTestClass;



public class Configuration {

	@AfterTestClass
	public void test1() {
		System.out.println("test 1 pass");
	}
}
