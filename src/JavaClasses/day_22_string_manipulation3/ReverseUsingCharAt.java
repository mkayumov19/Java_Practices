package JavaClasses.day_22_string_manipulation3;

public class ReverseUsingCharAt {
    public static void main(String[] args) {

//      1  .equals()                -->
//      2  .equalsIgnoreCase()      -->
//      3  .length()                -->
//      4  .toUpperCase()           -->
//      5  .toLowerCase             -->
//      6  .startsWith()            -->
//      7  .endsWith()              -->
//      8  .contains()              -->
//      9  .isEmpty()               -->
//     10  .replace()               -->
//     11  .charAt()                -->
//     12  .indexOf()               -->
//     13  .substring()             -->

        String word = "java";
        String word2 = ""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);

        System.out.println(word.charAt(3));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word + " ---> " + word2);
        if (word.equalsIgnoreCase(word2)){
            System.out.println("palindrome word");
        }else{
            System.out.println("not palindrome word");
        }
        String name = "Anna";
        String name1 = ""+name.charAt(3)+name.charAt(2)+name.charAt(1)+name.charAt(0);
        System.out.println(name1);
        if (name.equalsIgnoreCase(name1)){
            System.out.println(name+" and "+name1+" palindrome words");
        }else{
            System.out.println(name+" and "+name1+" not palindrome words");
        }
    }
}
