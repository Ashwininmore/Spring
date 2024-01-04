package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ctxApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1=(Employee)ctxApplicationContext.getBean("e2");
		e1.display();

	}

}
