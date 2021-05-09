package JavaClasses.day_31_array_class;

public class CharArrays {
    public static void main(String[] args) {
        char[] charLetters = {'j','a','v','a',' ','i','s',' ','f','u','n'};
        for(char eachLetter : charLetters){
            System.out.print(eachLetter + " ");
        }
        String sentence = new String(charLetters);
        System.out.println("\nSentence converted from Char to String: - "+sentence.toUpperCase());
        System.out.println("------------------------------------");
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.print("ItemArray.length - "+ itemArray.length);
        System.out.print("\nItem.length() - "+ item.length());

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        System.out.println("\n------------------------------------");
        String fruitStr = "";
        for (String each : fruits){
                System.out.print(each + "-");
                fruitStr += each + "-";
        }
        System.out.print("\n");
        System.out.println("fruitStr = "+fruitStr);

        String[] languages = {"java","ruby","sql","python","c++","javascript"};
        System.out.println("------------------------------------");
        System.out.println(String.join(" | ", languages));      // String.join --> ads value between array values
        String joinedlangs = String.join("  \uD83D\uDD2B  ",languages);
        System.out.println(joinedlangs);
    }
}
