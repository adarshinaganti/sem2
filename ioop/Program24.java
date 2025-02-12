import java.util.Scanner;

class Employee {
	private String firstName;
	private String lastName;
	private String email;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = generateEmail();
	}
	
	public String formatEmployeeName() {
        String formattedName = capitalize(firstName) + " " + capitalize(lastName);
        return formattedName;
    }
	
	private String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
	
	public String generateEmail() {
        String emailPrefix = firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase();
        return emailPrefix + "@example.com";
    }
	
	public String getEmail() {
        return email;
    }
	
	public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class Program24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();
        
        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("First Name: ");
            String firstName = sc.next();

            System.out.print("Last Name: ");
            String lastName = sc.next();

            employees[i] = new Employee(firstName, lastName);
        }

        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            System.out.println("Formatted Name: " + emp.formatEmployeeName());
            System.out.println("Email: " + emp.getEmail());
        }

        sc.close();
	}
}