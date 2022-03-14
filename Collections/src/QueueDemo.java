import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueDemo {
	public static void main (String... args) {
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);
		queue.offer("Spring in Practice");
		queue.offer("Spring in Action");
		queue.offer("Javascript for Dummies");
		queue.offer("Test-Driven");
		queue.offer("Becoming Agile");
		queue.offer("SOA in Practice");
		System.out.println(queue);
		
		queue.offer("TDD by Example");
		String borrowedBook = queue.poll();
		System.out.println(borrowedBook);
		String lostBook = queue.peek();
		System.out.println(lostBook);
		
		PriorityBlockingQueue<String> otherQueue = new PriorityBlockingQueue<String>(3);
		otherQueue.add(borrowedBook);
		otherQueue.addAll(queue);
		System.out.println(otherQueue);
		
	}
}
