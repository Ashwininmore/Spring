package mypack;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import
org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestMain {
public static void main(String[] args) {
	ApplicationContext ctx=new
	ClassPathXmlApplicationContext("applicationcontext.xml");
	StudentDao obj=(StudentDao)ctx.getBean("b1");
	Scanner sc=new Scanner(System.in);
	int ch;
	do
	{
		System.out.println("\n1]Add Record\n2]Update Record\n3]Delete Record\n4]Show All\n5]Exit");
		
		System.out.println("Enter u r choice");
		
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter rollno");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			sc.nextLine();
			String nm=sc.nextLine();
			System.out.println("Enter marks");
			int m=sc.nextInt();
			Student s1=new Student();
			s1.setRollno(id);
			s1.setStdname(nm);
			s1.setMarks(m);
			obj.saverec(s1);
			System.out.println("Record Inserted");
			break;
		case 2:
			System.out.println("Enter rollno");
			id=sc.nextInt();
			System.out.println("Enter Name");
			sc.nextLine();
			nm=sc.nextLine();
			System.out.println("Enter marks");
			m=sc.nextInt();
			s1=new Student();
			s1.setRollno(id);
			s1.setStdname(nm);
			s1.setMarks(m);
			obj.updateRec(s1);
			System.out.println("Record Updated");
			break;
		case 3:
			System.out.println("Enter rollno");
			id=sc.nextInt();
			s1=new Student();
			s1.setRollno(id);
			obj.deleteRec(s1);
			System.out.println("Record Deleted");
			break;
		case 4:
			obj.showAllRecords(); break;
		default:System.out.println("Exit success!!");
	}
		
	}while(ch!=5);
	
	}
}
