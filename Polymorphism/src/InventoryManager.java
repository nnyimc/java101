
public class InventoryManager {
	
	private Automobile featuredAutomobile;
	
	public void addFeaturedAuto( Automobile featuredAutomobile) {
		this.featuredAutomobile = featuredAutomobile;
	}
	
	
	
	public void addAutomobile(Automobile a) {
		System.out.println( "Adding Automobile #" + a.getVehicleImmatriculationNumber());
	}

}

