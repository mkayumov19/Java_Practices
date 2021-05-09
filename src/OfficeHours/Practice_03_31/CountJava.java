package OfficeHours.Practice_03_31;

public class CountJava {
    public static void main(String[] args) {
        String str = "java is fun. java class today, javascript";
        int count = 0;
        while(str.contains("java")){
            count++;
            str = str.replaceFirst("java","");
        }
        System.out.println("java was found "+count+" times");
//  =================================================================================
        String word = "Java is fun. Java class today. I love Javascript and Java";
        int countJava = 0;
        for(int i = 0; i < word.length()-3; i++){
            String eachFourLetters = word.substring(i, i + 4);
//            System.out.println(eachFourLetters);
            if (eachFourLetters.equals("Java")){
                countJava++;
            }
        }
        System.out.println("Java was found times: " + countJava);
    }
}
