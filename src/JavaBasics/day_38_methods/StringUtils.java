package JavaBasics.day_38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        //System.out.println(word.isEmpty());

        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();

//      if(str == null || str.isEmpty()) {
//         return true;
//      if(str.isEmpty() || str == null){ ------->>>    gives NullPointerException
//      if(str == null | str.isEmpty()){  ------->>>    gives NullPointerException
//        }
//        return false;
    }

    public static String reverse(String str){
        str = str.toLowerCase();
        return new StringBuffer(str).reverse().toString();
    }

}
