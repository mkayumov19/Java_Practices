package JavaClasses.day_40b_reviewClass;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(GetSumOfNums("a5bc12def100g"));
    }

    public static int GetSumOfNums(String str){
        int sum = 0;
        String num = "";
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                num += str.charAt(i);
                if (i == str.length()-1 || !Character.isDigit(str.charAt(i+1))){
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
         return sum;
    }
}

//[Sum of Numbers from String]
//        Create a method that will accept a String and returns the sum of all the numbers in the String.
//        Requirement: any numbers that are next to each other are not single digit numbers but instead read as a full number
//        Ex: a5bc12def100g
//        Here we would have added 5 + 12 + 100
//        NOT: 5 + 1 + 2 + 1 + 0 + 0