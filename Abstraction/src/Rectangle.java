
public class Rectangle extends Shape {
	private double height;
	private double width;
	
	public Rectangle (double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "rectangle";
	}
	
	@Override
	public double area() {
		return height * width;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a " + toString());
		
	}

}
