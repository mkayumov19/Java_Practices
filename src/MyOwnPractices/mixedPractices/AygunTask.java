package MyOwnPractices.mixedPractices;

public class AygunTask {

    // Create a method which will return re-formatted phone number as a String and accept any string
    // including 10-digit phone number. Input: cell= 2124553377 or 212-455-3377 or 212.455.3377  or
    // 212 455 3377 etc.  Output:(212)455-3377

    public static void main(String[] args) {
        System.out.println(reFormat("212-455-3377"));
    }

    public static String reFormat(String num) {
        String result = "";

        for (int i = 0; i < num.length(); i++) {
            if (Character.isDigit(num.charAt(i))) {
                result += num.charAt(i);
            }
        }
        if (result.length() != 10) {
            return "invalid phone number";
        } else {

            result = "(" + result.substring(0, 3) + ")" + result.substring(3, 6) + "-" + result.substring(6);
            return result;
        }
    }
}
