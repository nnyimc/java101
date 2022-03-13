
public class Secretary extends Employee {

	@Override
	public String toString() {
		return getName() + " " + getDateOfBirth() + " " + getSalary();
	}

}
