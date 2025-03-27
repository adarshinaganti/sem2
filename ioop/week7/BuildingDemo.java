package week7;

class Building {
	private double sqft;
	private int stories;
	
	public Building() {
		this.sqft = 0;
		this.stories = 0;
	}
	
	public Building(double sqft, int stories) {
		this.sqft = sqft;
		this.stories = stories;
	}
	
	public double get_sqft() {
		return sqft;
	}
	
	public int get_stories() {
		return stories;
	}
	
	public void set_sqft(double sqft) {
		this.sqft = sqft;
	}
	
	public void set_stories(int stories) {
		this.stories = stories;
	}
	
	public void display() {
		System.out.println("Building Details:");
        System.out.println("Square Footage: " + sqft);
        System.out.println("Number of Stories: " + stories);
	}
}

class House extends Building {
	private int bedrooms;
	private int baths;
	
	public House() {
		super();
		this.bedrooms = 0;
		this.baths = 0;
	}
	
	public House(double sqft, int stories, int bedrooms, int baths) {
		super(sqft, stories);
		this.bedrooms = bedrooms;
		this.baths = baths;
	}
	
	public int get_bedrooms() {
        return bedrooms;
    }

    public int get_baths() {
        return baths;
    }
    
    public void set_bedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void set_baths(int baths) {
        this.baths = baths;
    }
    
    @Override
    public void display() {
    	super.display();
    	System.out.println();
    	System.out.println("House details: ");
    	System.out.println("Number of bedrooms: " + bedrooms);
    	System.out.println("Number of baths: " + baths);
    }
}

class School extends Building {
	private int classrooms;
	private String gradeLevel;
	
	public School() {
		super();
		this.classrooms = 0;
		this.gradeLevel = "";
	}
	
	public School(double sqft, int stories, int classrooms, String gradeLevel) {
		super(sqft, stories);
		this.classrooms = classrooms;
		this.gradeLevel = gradeLevel;
	}
	
	public int get_classrooms() {
        return classrooms;
    }

    public String get_gradeLevel() {
        return gradeLevel;
    }
    
    public void set_classrooms(int classrooms) {
        this.classrooms = classrooms;
    }

    public void set_gradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    @Override
    public void display() {
    	super.display();
    	System.out.println();
    	System.out.println("School details: ");
    	System.out.println("Number of classrooms: " + classrooms);
    	System.out.println("Grade level: " + gradeLevel);
    }
}

public class BuildingDemo {
	public static void main(String[] args) {
		Building genericBuilding = new Building(5000, 3);
		House house = new House(8000, 2, 3, 2);
		School school = new School(10000, 4, 10, "High");
		
		// Polymorphism
		Building[] buildings = new Building[3];
		buildings[0] = genericBuilding;
		buildings[1] = house;
		buildings[2] = school;
		
		for (Building building : buildings) {
			building.display();
			System.out.println();
		}
	}
}