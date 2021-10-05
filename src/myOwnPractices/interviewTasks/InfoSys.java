package myOwnPractices.interviewTasks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class InfoSys {

    public static void main(String[] args) {

        String x = "40";
        String y = "60";

        int x1 = Integer.valueOf(x);
        int y1 = Integer.valueOf(y);

        System.out.println(x + y);
        System.out.println(Integer.parseInt(x)+Integer.parseInt(y));
        System.out.println(x1+y1);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "java");
        map1.put(1, "phyton");
        System.out.println(map1);



    }

}
