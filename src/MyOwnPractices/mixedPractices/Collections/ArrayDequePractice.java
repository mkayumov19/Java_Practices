package MyOwnPractices.mixedPractices.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequePractice {

    public static void main(String[] args) {

        //Creating Deque and adding elements
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("Java");
        dq.add("Phyton");
        dq.add("C++");

        //Traversing elements
        for (String str : dq) {
            System.out.println(str);
        }
//=============================================================================================

            Deque<Integer> deq = new ArrayDeque<Integer>();
            deq.offer(1);
            deq.offer(2);
            deq.add(3);
            deq.offerFirst(4);
            System.out.println("After offerFirst Traversal...");
            for (int each : deq) {
                System.out.println(each);
            }

            // deq.poll();
            // deq.pollFirst();//it is same as poll()
            deq.pollLast();
            System.out.println("After pollLast() Traversal...");
            for(int temp:deq) {
                System.out.println(temp);
            }

//=============================================================================================

        Deque<String> deque = new LinkedList<String>();

        // We can add elements to the queue
        // in various ways

        // Add at the last
        deque.add("Element 1 (Tail)");

        // Add at the first
        deque.addFirst("Element 2 (Head)");

        // Add at the last
        deque.addLast("Element 3 (Tail)");

        // Add at the first
        deque.push("Element 4 (Head)");

        // Add at the last
        deque.offer("Element 5 (Tail)");

        // Add at the first
        deque.offerFirst("Element 6 (Head)");

        System.out.println(deque + "\n");

        // We can remove the first element
        // or the last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing first and last: " + deque);
    }
}

