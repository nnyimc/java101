
public class Instructor extends Employee {
	
	private String[][] schedule;
	
	public Instructor(String firstName, String lastName, double salary) {
		super(firstName, firstName, salary);
	}
	
	public String[][] getSchedule() {
		return schedule;
	}
	
}
