package JavaBasics.day_28_loops_practice2;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*'";
        Random random = new Random();
        String password = "";
        for (int i = 1; i <= 8; i++){
            int index = random.nextInt(71);
            System.out.print(source.charAt(index));
//          source.substring(index,index+1);        --- does same thing above line does
            password += source.charAt(index);
//            System.out.println(password);
        }
        System.out.println("\nYour password is: "+password);
    }
}
