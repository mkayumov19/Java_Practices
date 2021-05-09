package JavaClasses.day_23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
                                //-------------->> if cond. <<----------------
        int i = 1;
            if (i <=5){
                System.out.println(i);
                i++;
            }
//-------------------------------------------------------------------------------------------------------
                                //-------------->> LOOPs <<----------------
        int j = 1;
            while (j <= 5) {
                System.out.println(j);
                j++;
            }
//      ==============================================================================================================
        double time = 9.0;
            while(time <= 10.0){
                System.out.println("Break till 9:18 PM EST");
                time++;
            }

        int apples = 0;
            while(apples <= 3){
                System.out.println("apples " + apples);
                apples++;
            }
        System.out.println();

//            while(true){                              ------> infinite loop
//                System.out.println("Hello world");
//            }
    }
}










