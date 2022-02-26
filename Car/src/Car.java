
public class Car {
	String color = "beige";
	String type;
	String brand;
	int serialNumber;
	
	//Initialized  in JVM
	static int carCount;
	
	//Initialization block - set up common values for different constructors
	{
		this.brand = "Celica";
		carCount++;
		this.serialNumber = carCount;
	}
	
	Car() {
		this.color = "black";
	}
	
	Car( String color ) {
		this();
		this.color = color;
	}
	
	static void resetCarCount() {
		carCount = 0;
	}
	
	void start() {
		System.out.println("Get started!");
	}
	
	void printDescription() {
		System.out.println("This is a #" + serialNumber + " " + this.color + " " + this.brand);
	}
	
	void customize( String brand ) {
		this.brand = brand;
	}
	
	public static void main(String[] args) {
		Car car1, car2, car3;
		car1 = new Car("blue");
		car1.customize("Alpine");
		car1.printDescription();
		
		car2 = new Car();
		car2.printDescription();
		
		car3 = new Car("red");
		car3.printDescription();
		Car.resetCarCount();
	} 
}
