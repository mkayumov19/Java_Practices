package JavaBasics.day_41_arraylist2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
//      nums.add(100);  ----------------------------------> it doesnt work now  After (Arrays.asList)
//      nums.remove(0); ----------------------------------> it also doesnt work ... (Arrays.asList)

        //workAround:
        List<Integer> num1 = new ArrayList<>(Arrays.asList(23,45,12));
        System.out.println(num1);
        num1.add(56);
        num1.remove(1);
        num1.remove(0);                      // removes index at 0
        num1.remove(new Integer(56));        // removes element: 56
        System.out.println(num1);

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee","tea","monster","red bull",
                                                                        "coke","pepsi","mdew","kambucho","celsius","Milk"));
        int caffeineAmount = 0;
        for (String each : drinksWithCaffeine) {
            if (each.equalsIgnoreCase("Monster") || each.equalsIgnoreCase("red bull") ||
                    each.equalsIgnoreCase("celsius")) {
                caffeineAmount = 150;
            } else if (each.equalsIgnoreCase("coffee") || each.equalsIgnoreCase("tea") ||
                    each.equalsIgnoreCase("kambucho")) {
                caffeineAmount = 100;
            } else if (each.equalsIgnoreCase("pepsi") || each.equalsIgnoreCase("coke") ||
                    each.equalsIgnoreCase("mdew")) {
                caffeineAmount = 50;
            }
            System.out.println("Caffeine amount is = " + caffeineAmount + "in " + each);

        }
        for (String each : drinksWithCaffeine){
            switch (each) {
                case "monster":
                case "red bull":
                case "celsius":
                    caffeineAmount = 150;
                    System.out.println(each + " has " + caffeineAmount + " caffeine amount");
                    break;
                case "coffee":
                case "tea":
                case "kambucho":
                    caffeineAmount = 100;
                    System.out.println(each + " has " + caffeineAmount + " caffeine amount");
                    break;
                case "pepsi":
                case "coke":
                case "mdew":
                    caffeineAmount = 50;
                    System.out.println(each + " has " + caffeineAmount + " caffeine amount");
                    break;
                default:
                    System.out.println(each + " has no caffeine!");
            }
        }

        drinksWithCaffeine.forEach(drink -> System.out.println("drink = "+drink));     // SHORTER WAY of foreach loop...
        drinksWithCaffeine.forEach(each -> {
            System.out.println("-----------");
            System.out.println("each = " + each);
        });
    }
}
