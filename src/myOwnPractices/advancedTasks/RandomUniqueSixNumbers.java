package myOwnPractices.advancedTasks;

import java.util.Random;

public class RandomUniqueSixNumbers {
    public static void main(String[] args) {
        Random ran = new Random();
        int random = 0;
        String sixWord = "";
        String updater = "";
        for (int i = 1; i <= 6; i++){
            random = ran.nextInt(9);
            updater = random+"";
                if(!sixWord.contains(updater+"")){
                    System.out.print(random);
                    sixWord = sixWord+""+random;
            }else{
                i--;
            }
        }
//        Random random = new Random();
//        String randomNumber = "";                             //Saim's code
//        while (randomNumber.length() != 6){
//            int eachRandom = random.nextInt(10); // 0 - 9
//           // int eachRandom = random.nextInt(9) + 1; // 1 - 9
//            if(!randomNumber.contains(""+eachRandom)){
//                randomNumber += eachRandom;
//            }
//        }
//        System.out.println("Random Number: " + randomNumber);
    }
}
