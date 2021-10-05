package JavaBasics.day_63_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.add("one");
        queue.add("two");

        System.out.println(queue);
        System.out.println(queue.element());            //if top element is empty, stops exec and shows Error
        System.out.println(queue.peek());               //if top element is empty, returns NULL, keeps exec.

//  ============================================================================================================

        Queue<String> arrQueue = new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
        queue.add("one");
        queue.add("one");

        System.out.println("arrQueue"+arrQueue);
        System.out.println("arrQueue"+arrQueue.element());
        System.out.println("arrQueue"+arrQueue.peek());

    }
}
