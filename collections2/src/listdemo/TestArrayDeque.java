package listdemo;
import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque {
		public static void main(String[] args) {
			ArrayDeque<String> queue = new ArrayDeque<>();
			queue.addLast("first");
			queue.addLast("second");
			queue.addLast("third");
			queue.addLast("fourth");
			queue.addLast("fifth");
			Iterator<String> iter=queue.descendingIterator();
			System.out.println(queue);
			System.out.println(queue.size());
			
			
			while(iter.hasNext())
			{
				System.out.println((iter.next()));
			}
			
		}
}
