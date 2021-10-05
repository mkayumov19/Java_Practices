package myOwnPractices.Collections;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfFruit {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "peach", "apple", "banana", "apple", "peach"));
        System.out.println("getMostFrequentFruit(fruits) = " + getMostFrequentFruit(fruits));

//        List<String> fruit = new ArrayList<>(Arrays.asList("Apple, Banana, Pear, Apple, melon"));
//        for (String each : fruit) {
//            System.out.println("frequency = " + Collections.frequency(fruit, each));

//        }
//=============================================================================================================

        List<String> fruits2 = new ArrayList<>(Arrays.asList("apple", "peach", "apple", "banana", "apple", "peach"));
        Set<String> set = new TreeSet<>(fruits2);
        List<Integer> frequency = new ArrayList<>();
        set.forEach(e -> frequency.add(Collections.frequency(fruits2, e)));
        Collections.sort(frequency);
        List<String> most_Repetead = fruits2.stream().filter(e -> Collections.frequency(fruits2, e) == Collections.max(frequency)).collect(Collectors.toList());
        System.out.println(most_Repetead.get(0));

    }
//=============================================================================================================

        public static String getMostFrequentFruit(ArrayList<String> list){
            int numofFruitMax=0;

            for (String e:list ) {
                if (Collections.frequency(list,e)>numofFruitMax){
                    numofFruitMax=Collections.frequency(list,e);
                }
            }
                for (String e :list) {
                    if (Collections.frequency(list,e)==numofFruitMax){
                        return e;
                }

            }
                return "YOU HAVE MULTIPLE ITEMS WITH SAME VALUE";




    }
}
