package MyOwnPractices.mixedPractices.Collections;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class QueuePractice {
    public static void main(String[] args) {

        /*
         add()      - Inserts the specified element into the queue. ...
         offer()    - Inserts the specified element into the queue. ...
         element()  - Returns the head of the queue. ...
         peek()     - Returns the head of the queue. ...
         remove()   - Returns and removes the head of the queue. ...
         poll()     - Returns and removes the head of the queue.
         */
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(queue);

        for (int i = 10; i <= 18; i++) {
            queue.offer(i);
        }
        System.out.println("adding with .offer = " + queue);

        // To remove the head of queue.     - remove
        int removedElem = queue.remove();
        System.out.println("remove head = " + removedElem);
        System.out.println(queue);

        //prints and removes head of queue      - print then remove
        int pollRemove = queue.poll();
        System.out.println("poll print/remove head = " + pollRemove);

        // To view the head of queue    - print head elem
        int viewHead = queue.peek();
        System.out.println("view head of queue = " + viewHead);

        // Rest all methods of collection
        // interface like size and contains
        // can be used with this
        // implementation.
        int size = queue.size();
        System.out.println("Size of queue = " + size);
//===============================================================================================
        Queue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of
        // the PriorityQueue
        System.out.println("pq.peek = " + pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println("pq.poll = " + pQueue.poll());

        // Printing the top element again
        System.out.println("pq.peek = " + pQueue.peek());

//===============================================================================================
        Queue<String> str = new PriorityQueue<>();
        str.addAll(Arrays.asList("Aygun", "Aghabe", "Abigail", "Fikret"));
        System.out.println(str);
        String words = "Max, Mariam, Halida, Subida";
        words.split(",");
        str.offer(words);
        System.out.println(str);

        Queue<Integer> nums = new PriorityQueue<>();
        nums.offer(1);
        nums.add(2);
        nums.addAll(Arrays.asList(3,4,5,6));
        System.out.println(nums);

        Iterator iter = nums.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
//===============================================================================================

//         Creating empty priority
//         blocking queue
        Queue<Integer> pbq = new PriorityBlockingQueue<Integer>();

        // Adding items to the pbq
        // using add()
        pbq.add(10);
        pbq.add(20);
        pbq.add(15);

        // Printing the top element of
        // the PriorityBlockingQueue
        System.out.println(pbq.peek());

        // Printing the top element and
        // removing it from the
        // PriorityBlockingQueue
        System.out.println(pbq.poll());

        // Printing the top element again
        System.out.println(pbq.peek());

    }
}
