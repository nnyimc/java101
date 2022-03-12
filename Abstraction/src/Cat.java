public class Cat implements Drawable {
	
	private String color;
	
	public Cat(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + " cat";
	}
	
	
	@Override
	public void draw() {
		System.out.println("Drawing a " + toString());
	}
	

}
