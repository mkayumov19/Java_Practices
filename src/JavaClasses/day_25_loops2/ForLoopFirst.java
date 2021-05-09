package JavaClasses.day_25_loops2;

public class ForLoopFirst {
    public static void main(String[] args) {

/**                                                   FOR LOOP
                             for(initialization; condition; updates){
                                System.out.println(do this again and again until cond is true);
                                }
 */
        for (int i = 0; i <= 5; i++){
            System.out.println("Running iteration: " + i);
        }
        for (int i = 10; i <= 100; i += 10){
            System.out.print("Count = " + i + " ");
        }
             System.out.println("");
        for (int num = 12; num >= 1; num--){
            System.out.println("Count reverse months numbers: " + num);
        }
        for (int i = 0, j = 5; i < 5 && j > 0; i++, j--){
            System.out.println(i +" "+ j);
        }
        for(int stars = 1; stars <= 15; stars++){
            System.out.print("\u2605");
        }
            System.out.println("");
        String myStars = "";
        for(int stars = 1; stars <= 5; stars++){
            myStars += "\uD83C\uDF1F ";
        }
            System.out.println("My stars: "+myStars.trim()+" ");

    }
}
