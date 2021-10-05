package JavaBasics.day_62_collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> friends = new LinkedList<>();
        List<Integer> scores = new LinkedList<>();          //polymorphic way
        scores.add(19);
        scores.add(42);
        scores.add(23);
        scores.add(42);
        System.out.println(scores);
        System.out.println("First score at index 0 = " + scores.get(0));
        System.out.println("First score at index 0 = " + scores.get(1));

        friends.add("Mahliya");
        friends.add("Abbas");
        friends.add("Nevzat");

        friends.addFirst("John");
        System.out.println(friends);
        System.out.println(friends.getLast());

        friends.add(2, "Mariia");
        System.out.println(friends);

        Collections.sort(friends);
        System.out.println(friends);
    }
}
