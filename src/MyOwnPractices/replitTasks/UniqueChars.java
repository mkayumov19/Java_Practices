package MyOwnPractices.replitTasks;

public class UniqueChars {
    public static void main(String[] args) {
        System.out.println(uniqueChars("spoon"));
    }

    public static String uniqueChars(String str){
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                   count++;
                }
            }
            if (count >= 1 && !unique.contains(str.charAt(i) + "")) {
                unique += str.charAt(i) + "";
            }
        }
        return unique;
    }
}
