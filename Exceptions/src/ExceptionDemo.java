public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			withdraw(50, 60);
		} catch (OverdraftException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String string = "A char string";
			System.out.println("Before problem");
			char character = string.charAt(20);
			System.out.println("Ater problem");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("The provided string isn't that big!!");
		}
		
		
	}
	
	public static void withdraw(double balance, double amount) throws OverdraftException {
		if (balance - amount < 0) {
			throw new OverdraftException("Insufficient funds!");
		}
	}
}
