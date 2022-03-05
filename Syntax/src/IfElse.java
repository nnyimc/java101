
public class IfElse {
	public static void main(String[] args) {
		boolean inMinneapolis, inSaintPaul;
		inMinneapolis = false;
		inSaintPaul = false;
		
		if (inMinneapolis) {
			System.out.println("Hello from Minneapolis!");
		} else if (inSaintPaul) {
			System.out.println("Hello from Saint Paul !");
		} else {
			System.out.println("Hello from Paris!");
		}
	}
}
