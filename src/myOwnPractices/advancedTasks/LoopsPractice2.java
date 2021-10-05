package myOwnPractices.advancedTasks;

public class LoopsPractice2 {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddee";
        int n = str.length();
        int max = 0;
        char result = str.charAt(0);
        int count = 1;

// Traverse string except last character
        for (int i = 0; i < n; i++) {
            // If current character matches with next
            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
                count++;
                // If doesn't match, update result
                // (if required) and reset count
            else {
                if (count > max) {
                    max = count;
                    result = str.charAt(i);
                }
                count = 1;
            }
        }
        System.out.println(str.substring(str.indexOf(result),str.lastIndexOf(result)+1));
    }
}
//
//    String str = "aaabbbcccccddddee";
//    int len = str.length();
//    int count = 0;
//
//    // Find the maximum repeating character
//    // starting from str[i]
//    char result = str.charAt(0);
//        for (int i = 0; i < len; i++) {
//        int cur_count = 1;
//        for (int j = i + 1; j < len; j++) {
//        if (str.charAt(i) != str.charAt(j))
//        break;
//        cur_count++;
//        }
//        // Update result if required
//        if (cur_count > count) {
//        count = cur_count;
//        result = str.charAt(i);
//        }
//        }
//        System.out.println(str.substring(str.indexOf(result),str.lastIndexOf(result)+1));