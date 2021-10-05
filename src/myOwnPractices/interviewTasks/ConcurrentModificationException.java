package myOwnPractices.interviewTasks;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * The ConcurrentModificationException occurs when an object is tried to be modified concurrently when it is not permissible.
 * This exception usually comes when one is working with Java Collection classes. For Example - It is not permissible for a
 * thread to modify a Collection when some other thread is iterating over it. This is because the result of the iteration
 * becomes undefined with it. Some implementation of the Iterator class throws this exception, including all those
 * general-purpose implementations of Iterator which are provided by the JRE. Iterators which do this are called fail-fast
 * as they throw the exception quickly as soon as they encounter such situation rather than facing undetermined
 * behavior of the collection any time in the future.
 */

public class ConcurrentModificationException {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println("List Value:" + value);
            if (value.equals(3))
                list.remove(value);

        }

    }

}
