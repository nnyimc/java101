public class App {
	
	public static void main (String[] args) {
		Circle c1 = new Circle(5.25);
		c1.draw();
		
		Rectangle r1 = new Rectangle(12, 2.25);
		r1.draw();
		
		Cat cat1 = new Cat("red");
		cat1.draw();
		
		System.out.println( "areaDifference : " + (c1.area() - r1.area()) );
	}
}
