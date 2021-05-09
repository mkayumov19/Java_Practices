package JavaClasses.day_36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
//        System.out.println("Full name: "+fullName()+"\nMarriage Status: "+isMarried()+" --> Married\nAge "+getAge());
//        System.out.println("Random year: "+getRandomYear());
       String fullName = fullName();
        boolean isMarried = isMarried();
        int age = getAge();
        int randYear = getRandomYear();
        if(fullName.length() > 6){
            if(isMarried){
                if(age >=30){
                    System.out.println("Full name: "+fullName+"\nAge: "+age+"\nMarried? - "+isMarried+"\nFavNum: "+randYear);
                }
            }
        }
    }

    public static String fullName(){
//        System.out.println("Full name: ");
        return "Mike Smiths";
    }
    public static boolean isMarried(){
        return true;
    }
    public static int getAge(){
        return 35;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;

    }

}
