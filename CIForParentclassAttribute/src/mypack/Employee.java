package mypack;

public class Employee extends Person{
	int id, sal;
	String companyname;
	public Employee(String name, String addr, int id, int sal, String companyname) {
		super(name, addr);
		this.id = id;
		this.sal = sal;
		this.companyname = companyname;
	}
	public void display() {
		System.out.println("Id="+id+"\nName="+name+"\nAddress="+addr+"\nSalary="+sal+"\nCompany Name="+companyname);
	}
}
