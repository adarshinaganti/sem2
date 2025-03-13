// Figure abstract class

abstract class Figure {
	protected int x;
	protected int y;
	
	public Figure(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double area();
}

class Rectangle extends Figure {
	public Rectangle(int l, int b) {
		super(l, b);
	}
	
	@Override
	public double area() {
		return (double) x * y;
	}
}

class Triangle extends Figure {
	public Triangle(int b, int h) {
		super(b, h);
	}
	
	@Override
	public double area() {
		return 0.5 * x * y;
	}
}

class Square extends Figure {
	public Square(int s) {
		super(s, s);
	}
	
	@Override
	public double area() {
		return (double) x * x;
	}
}

public class Program30 {
	public static void main(String[] args) {
		Figure rect = new Rectangle(10, 20);
		Figure triang = new Triangle(15, 25);
		Figure sq = new Square(12);
		
		// Polymorphism
		Figure[] figs = new Figure[3];
		figs[0] = rect;
		figs[1] = triang;
		figs[2] = sq;
		
		for (Figure fig : figs) {
			System.out.println("Shape: " + fig.getClass().getSimpleName());
			System.out.println("Area: " + fig.area());
			System.out.println();
		}
	}
}