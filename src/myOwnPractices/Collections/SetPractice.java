package myOwnPractices.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        System.out.println("Unique = " + set.add("java"));
        System.out.println("Copy = " + set.add("java"));
        System.out.println("Contains = " + set.contains("java"));

        Set<String> set2 = new TreeSet<>();
        set2.isEmpty();
        System.out.println("isEmpty " + set2);


    }

}
