package JavaBasics.day_29_nestedLoops_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++){
            for (int j = 0; j <= i; j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
//  --------------------------------------------------------------------------------------------------
        String str = "java";
        for (int i = str.length()-1; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
//  --------------------------------------------------------------------------------------------------//

        String str2 = "java";
        for (int i = 0; i < str2.length(); i++){
            for (int j = i; j < str2.length(); j++){
                System.out.print(str2.charAt(j));
            }
            System.out.println();
        }
//  --------------------------------------------------------------------------------------------------//
        String str3 = "java";
//        String checked = "";
        for (int i = 0; i < str3.length(); i++){
            char outer = str3.charAt(i);
            int count = 0;                              //count resetted every time
            for (int j = 0; j < str3.length(); j++){
                char innerChar = str3.charAt(j);
                if( outer == innerChar){
                    count++;
                }
            }
            System.out.println(outer + " = " + count);
        }

    }
}
