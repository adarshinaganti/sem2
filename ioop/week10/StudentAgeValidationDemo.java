class Student {
	private String name;
	private int age;
	
	public void registerStudent(String name, int age) {
		if (age < 18 || age > 60) {
			throw new IllegalArgumentException("Age must be between 18 and 60 for registration.");
		}
		this.name = name;
		this.age = age;
		System.out.println(""Student " + name + " registered successfully with age " + age + "."")
	}
	
	public String get_name() {
        return name;
    }

    public int get_age() {
        return age;
    }
}

public class StudentAgeValidationDemo {
	public static void main(String[] args) {
		Student student = new Student();
		
        try {
            student.registerStudent("Alice", 25);
        }
		catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            student.registerStudent("Bob", 16);
        }
		catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            student.registerStudent("Charlie", 65);
        }
		catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            student.registerStudent("David", 40);
        }
		catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
	}
}