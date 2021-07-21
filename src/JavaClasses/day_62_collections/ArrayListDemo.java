package JavaClasses.day_62_collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        Collection<String> schools = new ArrayList<>();

        cities.add("McLean");  // add method from Collection or List interface
        cities.add("Vienna");
        cities.add("York");
        cities.add("New York");
        cities.add("New York");
        System.out.println("First city: " + cities.get(0));
        System.out.println("Fourth city: " + cities.get(3));
        System.out.println("Fifth city: " + cities.get(4));
        System.out.println("Count of cities: " + cities.size());


    }
}
