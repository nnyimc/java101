
public class CarDealership {
	
	private static InventoryManager manager = new InventoryManager();
	
	public static void main (String[] args) {
		Car c = new Car();
		manager.addAutomobile(c);
		manager.addFeaturedAuto(c);
		
		Truck t = new Truck();
		manager.addAutomobile(t);
		
		Motorcycle m = new Motorcycle();
		manager.addAutomobile(m);
		
		Scooter s = new Scooter();
		manager.addAutomobile(s);
	}
}
