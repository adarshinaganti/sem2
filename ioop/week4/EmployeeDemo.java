package week4;

class Employee {
	private String name;
	private int ID;
	private float salary;

	public Employee() {
		this.name = "Unknown";
		this.ID = 0;
		this.salary = 0f;
	}

	public Employee(String name, int ID, float salary) {
		this.name = name;
		this.ID = ID;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + ID);
		System.out.println("Salary: $" + salary);
		System.out.println();
	}
}

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("abc", 50, 10000);
		Employee e3 = new Employee("def", 100, 20000);

		System.out.println("Employee Details:");
		e1.display();
		e2.display();
		e3.display();
	}
}