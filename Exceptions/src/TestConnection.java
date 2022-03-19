import java.net.MalformedURLException;
import java.net.URL;

public class TestConnection {
	public static void main(String...args) {
		openHttpConnection();
	}

	private static void openHttpConnection() {
		try {
			URL site = new URL("http://www.google.co.jp");
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
