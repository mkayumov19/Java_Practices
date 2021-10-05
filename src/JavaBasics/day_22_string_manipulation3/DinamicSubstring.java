package JavaBasics.day_22_string_manipulation3;

public class DinamicSubstring {
    public static void main(String[] args) {

        String result = "result count:12345";
        System.out.println(result.substring(13));
        System.out.println(result.substring(13,18));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));     // 13comes out and prints <12345>
        System.out.println(result.substring(result.indexOf(":")+1));

        String today = "I learned [java] today";
        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));
        int start = today.indexOf("[")+1;
        int end = today.indexOf("]");
        System.out.println(today.substring(start,end));


    }
}
