package lesson51.problems;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadSafeQueue<T> {

    private Queue<T> queue = new LinkedList<T>();

    public void add (T element) {
        synchronized (this) {
            queue.add(element);
        }
    }

    public T poll () {
        synchronized (this) {
            return queue.poll();
        }
    }
}
