import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String... args ) {
		ArrayList<String> list = new ArrayList<String>(4);
		list.add("Hello");
		list.add("...");
		list.add("World");
		list.add("!");
		list.remove("!");
		System.out.println(list.size());
		System.out.println(list.contains("?"));
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
 