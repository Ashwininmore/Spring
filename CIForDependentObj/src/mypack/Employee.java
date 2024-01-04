package mypack;

public class Employee {
	private int id, sal;
	private String name;
	Address addr;
	public Employee(int id, int sal, String name, Address addr) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
		this.addr = addr;
	}
	public void display() {
		System.out.println("Id="+id+"\nSalary="+sal+"\nName="+name+"\n"+addr);
	}
}
