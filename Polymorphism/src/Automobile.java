
public class Automobile {
	
	private static int VehicleImmmatriculationNumberCount = 3_124_520;
	private int VehicleImmatriculationNumber;
	
	public int getVehicleImmatriculationNumber() {
		return VehicleImmatriculationNumber;
	}
	
	public Automobile() {
		VehicleImmatriculationNumber = VehicleImmmatriculationNumberCount++;
	}
}
