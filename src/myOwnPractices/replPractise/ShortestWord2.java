package myOwnPractices.replPractise;

import java.util.Arrays;

public class ShortestWord2 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();

        String[] str = {"olive", "fish", "pursuit", "old", "warning", "python", "java", "coffee", "cat", "ray"};
        String shortest = "";
        int count = str[0].length();

        for (int i = 0; i < str.length; i++){

            if (count == str[i].length()) {
                shortest += " " + str[i];
            } else if (count > str[i].length()) {
                shortest = str[i];
                count = str[i].length();
            }
        }
        String[] shortestArr = shortest.trim().split(" ");
        Arrays.sort(shortestArr);
        System.out.print(Arrays.toString(shortestArr));
    }
}
