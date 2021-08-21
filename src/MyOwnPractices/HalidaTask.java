package MyOwnPractices;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HalidaTask {

    public static void main(String[] args) {

        HalidaTask halida = new HalidaTask();
        halida.experiment();

    }

    public List<Map<String, Integer>> experiment(){

        List<Map<String, Integer>> myMap = new LinkedList<>();
        Map<String, Integer> yourMap = new HashMap<>();
        yourMap.put("Halida", 18);
        yourMap.put("Aygun", 19);
        yourMap.put("Mariam", 20);
        myMap.add(yourMap);
        System.out.println(myMap);

        return myMap;

    }
}
