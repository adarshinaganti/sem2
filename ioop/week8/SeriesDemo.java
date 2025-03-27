package week8;

interface Series {
	int getNext();
	void reset();
	void setStart(int start);
}

class ByTwos implements Series {
	int startValue, currentValue;
	
	ByTwos() {
		startValue = 0;
		currentValue = startValue;
	}
	
	@Override
	public int getNext() {
		currentValue += 2;
		return currentValue;
	}
	
	@Override
	public void reset() {
		currentValue = startValue;
	}
	
	@Override
	public void setStart(int start) {
		startValue = start;
		currentValue = startValue;
	}
}

public class Program31 {
	public static void main(String[] args) {
		Series series_ByTwos = new ByTwos();
		
		System.out.println("Starting from default value (zero):");
		for (int i = 0; i < 5; i++) {
			System.out.println("Next: " + series_ByTwos.getNext());
		}
		
		System.out.println("\nResetting:");
		series_ByTwos.reset();
		System.out.println("Next after reset: " + series_ByTwos.getNext());
		
		System.out.println("\nSetting start value to 10:");
		series_ByTwos.setStart(10);
		System.out.println("Next after setting start to 10: " + series_ByTwos.getNext());
		System.out.println("Next: " + series_ByTwos.getNext());
	}
}