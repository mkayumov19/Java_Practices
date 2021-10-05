package myOwnPractices.replPractise;

public class MergeThem {
    public static void main(String[] args) {
        System.out.println(mergeStrings("12345","abcde"));

    }

    public static String mergeStrings(String one, String two) {

        String mergeStrr= "";
        if (one.length() >= two.length()) {

            for (int i=0; i< two.length();i++){
                mergeStrr += one.charAt(i) + "" + two.charAt(i);
            }
            mergeStrr = mergeStrr + one.substring(two.length());
        }
        if (one.length() < two.length()) {

            for (int j=0; j < one.length();j++){
                mergeStrr +=one.charAt(j) + "" + two.charAt(j);
            }
            mergeStrr = mergeStrr + two.substring(one.length());
        }
        return mergeStrr;
    }
}
