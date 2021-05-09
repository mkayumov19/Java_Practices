package MyOwnPractices.replitTasks;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(6);
        list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);list.add(10);
        list.remove(0);
        list.remove(0);

        System.out.println(list);
    }
}
