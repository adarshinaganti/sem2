class Employee {
    private String eName;
    private float salary;
    private Department[] departments;
    private int departmentCount;

    class Department {
        private String departmentName;
        private String location;

        public Department(String departmentName, String location) {
            this.departmentName = departmentName;
            this.location = location;
        }

        public void displayDepartment() {
            System.out.println("Department: " + departmentName + ", Location: " + location);
        }
    }

    public Employee(String eName, float salary, int maxDepartments) {
        this.eName = eName;
        this.salary = salary;
        this.departments = new Department[maxDepartments];
        this.departmentCount = 0;
    }

    public void addDepartment(String departmentName, String location) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = new Department(departmentName, location);
            departmentCount++;
        }
		else {
            System.out.println("Cannot add more departments. Maximum limit reached.");
        }
    }

    public void display() {
        System.out.println("Employee Name: " + eName);
        System.out.println("Salary: " + salary);
        System.out.println("Departments:");
        for (int i = 0; i < departmentCount; i++) {
            departments[i].displayDepartment();
        }
    }
}

public class Program20 {
    public static void main(String[] args) {
        Employee employee = new Employee("abc", 75000f, 3);

        employee.addDepartment("HR", "New York");
        employee.addDepartment("IT", "San Francisco");
        employee.addDepartment("Finance", "Chicago");

        employee.display();
    }
}