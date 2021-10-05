package JavaBasics.day_45_oop;

public class ComparingStrings {
    public static void main(String[] args) {

        String word1 = "java";                          // in string pool
        String word2 = "java";                          // re-use from string pool
        String word3 = new String("java");      // create new object in Heap, outside of pool string
        String word4 = new String("java");      // create new object in Heap, outside of pool string

        System.out.println(word1 == word2);             // True
        System.out.println(word1 == word3);             // False
        System.out.println(word3 == word4);             // False -> points to different object

        System.out.println(word1.equals(word2));        // True
        System.out.println(word1.equals(word3));        // True
        System.out.println(word3.equals(word4));        // True




    }
}
