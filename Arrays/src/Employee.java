public abstract class Employee extends Person {
	private double salary;
	public abstract String toString();
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
