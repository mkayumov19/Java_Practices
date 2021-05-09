package JavaClasses.day_41_arraylist2;

import java.util.ArrayList;
import java.util.List;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Pittsburgh");
        cities.add("Moscow");
        cities.add("Paris");
        cities.add("London");
        //adding value to exact location in List, which pushes other values after that index further:
        cities.add(0,"Tashkent");

        System.out.println(cities);
        System.out.println("First city in list= " + cities.get(0));
        System.out.println("Fifth city in list = " + cities.get(4));
        //find last index using -1:
        System.out.println("Last city in list = " + cities.get(cities.size()-1));
        //print count of items:
        System.out.println("Size of list = " + cities.size());
        // for loop and print all values in same line
        for (int i = 0; i < cities.size(); i++){
            System.out.print(cities.get(i)+" | ");
        }
        System.out.println();
        for (String each : cities) {
            System.out.print(each + " | ");
        }
        System.out.println();
        //delete item from arraylist
        //1.remove using index. delete value at index 3
        cities.remove(4);
        //2.remove using object/value
        cities.remove("Moscow");
        System.out.println("After removing " + cities);

        //delete/remove all cities from list
        cities.clear();

        //make sure its clear
        //1. print / split it out
        System.out.println("1.Cities: " + cities);

        //2. using isEmpty
        if(cities.isEmpty()){
            System.out.println("2.List is empty");
        }

        //3.check size is = 0
        if (cities.size() == 0){
            System.out.println("3.List is empty");
        }

    }
}
