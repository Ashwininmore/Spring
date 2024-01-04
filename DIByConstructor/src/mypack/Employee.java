package mypack;

public class Employee {
	private int empid, salary;
	private String empname;
	public Employee(int empid, int salary, String empname) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.empname = empname;
	}
	public void display() {
		System.out.println("emp Id="+empid+"\nEmp salary="+salary+"\nEmp name="+empname);
	}
}
