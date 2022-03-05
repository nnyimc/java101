
public class StringOperators {

	public static void main(String[] args) {
		String s1 = new String( "Hello World      ");
		String substring = s1.substring(4,12);
		System.out.println(s1);
		System.out.println(substring);
		
		String toUppercase = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(toUppercase);
		
		String concatenation = s1 + toUppercase;
		System.out.println(concatenation);
		System.out.println(s1);
	}

}
