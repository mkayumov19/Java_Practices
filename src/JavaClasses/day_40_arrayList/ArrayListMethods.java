package JavaClasses.day_40_arrayList;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        System.out.println("Size = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to Mall");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to Mall");
        }
        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);
        System.out.println("Is shoes in my list? - " + shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        } else {
            System.out.println("Shoes is not in the list");
        }
        System.out.println("Buying shoes ... $80");
        shoppingList.remove("shoes");               // returns false if removed.
        System.out.println("Shoes removed from ShoppingList: " + shoppingList.remove("shoes"));
        System.out.println("List: " + shoppingList);
        shoppingList.clear();
        System.out.println("Shopping list is empty: " + shoppingList);

    }
}
