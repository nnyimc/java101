import java.net.MalformedURLException;
import java.net.URL;

public class TestConnectionAlt {
	public static void main(String[] args) {
		try {
			openHttpConnection("http://www.amazon.com");
		} catch (MalformedURLException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	private static void openHttpConnection(String url) throws MalformedURLException {
		URL site = new URL(url);
		
	}
}
