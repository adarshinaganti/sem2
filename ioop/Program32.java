// Student class

class Student {
	private int rollNo;
	private float marks;
	
	public int get_rollNo() {
		return rollNo;
	}
	
	public void put_rollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public float get_marks() {
		return marks;
	}
	
	public void put_marks(float marks) {
		this.marks = marks;
	}
}

interface Sports {
	void put_sportsScore(float sportsScore);
}

class Result extends Student implements Sports {
	private float sportsScore;
	
	@Override
	public void put_sportsScore(float sportsScore) {
		this.sportsScore = sportsScore;
	}
	
	public void display() {
		System.out.println("Roll number: " + get_rollNo());
		System.out.println("Marks: " + get_marks());
		System.out.println("Sports score: " + sportsScore);
	}
}

public class Program32 {
	public static void main(String[] args) {
		Result res = new Result();
		
		res.put_rollNo(101);
		res.put_marks(93.5f);
		
		res.put_sportsScore(92f);
		
		System.out.println("Student result:");
		res.display();
	}
}