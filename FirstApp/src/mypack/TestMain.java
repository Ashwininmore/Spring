package mypack;
import org.springframework.context.*;
//import org.springframework.beans.factory.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Student s1=(Student) ctx.getBean("s1");
		s1.display();
}

}
