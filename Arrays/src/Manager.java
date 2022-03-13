
public class Manager extends Employee {
	
	private String department;
	
	public Manager(String department) {
		super();
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return department + " " +getName() + " " + getDateOfBirth() + " " + getSalary();
	}

}
