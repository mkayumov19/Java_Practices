package JavaBasics.day_21_string_manipulation2;

public class IndexStringMethods {
    public static void main(String[] args) {

        String word = "java";
        char index1 = word.toUpperCase().charAt(0);
        char index2 = word.replace("a","i").toUpperCase().charAt(1);
        char index3 = word.replace("v","m").toUpperCase().charAt(2);
        char index4 = word.replace("a","i").toUpperCase().charAt(3);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);

        String company = "Cybertek";
        System.out.println("first letter: "+company.charAt(0));
        char first=company.charAt(0);
        char second=company.charAt(1);
        char third =company.charAt(2);
        char fourth =company.charAt(3);
        char fifth =company.charAt(4);
        char six =company.charAt(5);
        char seven =company.charAt(6);
        char eight =company.charAt(7);

        System.out.println(first+ " "+second+" "+third+" "+fourth+" "+fifth+" "+six+" "+seven+" "+eight);

        String withSpaces = first+ " "+second+" "+third+" "+fourth+" "+fifth+" "+six+" "+seven+" "+eight;
        System.out.println(withSpaces);


/**           PALINDROME is word readable same from each end */
        String word5 = "mom";
        char firstNum = word5.charAt(0);
        char lastNum = word5.charAt(2);
        if (firstNum == lastNum){
            System.out.println("mom has same starting ending letters");
        }else{
            System.out.println("not true");
        }
        String anotherName = "aziza";
        char firstLetter = anotherName.charAt(0);
        char lastLetter = anotherName.charAt(anotherName.length()-1);       // get last character------------<<<
        int count = anotherName.length()-1;                                 //2nd way of getting last letter
        System.out.println(firstLetter);
        System.out.println(count);
        if (firstLetter == lastLetter){
            System.out.println("Aziza's first and last letters are same");
        }

    }
}
