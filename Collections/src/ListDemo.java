import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> listDemo = new LinkedList<String>();
		listDemo.set(0, "Enterprise");
		listDemo.set(1, "Bird of Prey");
		listDemo.set(2, "Farragut");
		listDemo.remove(1);
	}
}
