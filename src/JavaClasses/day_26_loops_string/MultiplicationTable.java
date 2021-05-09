package JavaClasses.day_26_loops_string;

public class MultiplicationTable{
    public static void main(String[] args) {

        int num = 11;
//          System.out.println(num + " * " + 1 + " = " + (num * 1));
        if(num < 1 || num > 10){
            System.out.println("ERROR: invalid input");
            return;                      //----------------- >>>   EXIT main method/stop the program
        }
        for (int i=1; i<=10;i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
