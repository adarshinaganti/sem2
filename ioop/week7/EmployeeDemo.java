package week7;

class Employee {
	private int eID;
	private String eName;
	private double baseSal;
	
	public Employee() {
		this.eID = 0;
		this.eName = "";
		this.baseSal = 0;
	}
	
	public Employee(int eID, String eName, double baseSal) {
		this.eID = eID;
		this.eName = eName;
		this.baseSal = baseSal;
	}
	
	public int get_eID() {
		return eID;
	}
	
	public String get_eName() {
		return eName;
	}
	
	public double get_baseSal() {
		return baseSal;
	}
	
	public double calcSal() {
		return baseSal;
	}
	
	public void display() {
		System.out.println("Employee Details:");
        System.out.println("Employee ID: " + eID);
        System.out.println("Name: " + eName);
        System.out.println("Base Salary: " + baseSal);
        System.out.println("Calculated Salary: " + calcSal());
	}
}

class PartTimeEmp extends Employee {
	private int hoursWorked;
	private static final double hourlyRate = 25.0;
	
	public PartTimeEmp(int eID, String eName, double baseSal, int hoursWorked) {
        super(eID, eName, baseSal);
        this.hoursWorked = hoursWorked;
    }
	
	public int get_HoursWorked() {
        return hoursWorked;
    }
	
	public static double get_HourlyRate() {
        return hourlyRate;
    }
	
	@Override
    public double calcSal() {
        return hoursWorked * hourlyRate;
    }
	
	@Override
	public void display() {
		super.display();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Calculated Salary (Part-Time): " + calcSal());
	}
}

class FullTimeEmp extends Employee {
	private double bonus;
	private double deductions;
	
	public FullTimeEmp(int eID, String eName, double baseSal, double bonus, double deductions) {
		super(eID, eName, baseSal);
		this.bonus = bonus;
		this.deductions = deductions;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public double getDeductions() {
		return deductions;
	}
	
	@Override
	public double calcSal() {
		return get_baseSal() + bonus - deductions;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Bonus: " + bonus);
        System.out.println("Deductions: " + deductions);
        System.out.println("Calculated salary: " + calcSal());
	}
}

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee genericEmployee = new Employee(1, "abc", 5000);
		PartTimeEmp partTimeEmployee = new PartTimeEmp(2, "def", 5000, 10);
		FullTimeEmp fullTimeEmployee = new FullTimeEmp(3, "ghi", 5000, 1000, 100);
		
		// Polymorphism
		Employee[] e = new Employee[3];
		e[0] = genericEmployee;
		e[1] = partTimeEmployee;
		e[2] = fullTimeEmployee;
		
		for (Employee emp : e) {
			emp.display();
			System.out.println();
		}
	}
}