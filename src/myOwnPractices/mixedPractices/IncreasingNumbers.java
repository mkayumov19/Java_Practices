package myOwnPractices.mixedPractices;

public class IncreasingNumbers {
    public static void main(String[] args) {

        int a = 1, b = 5, c = 3;
        if (a <= b && a <= c){
                 if (b >= c ){
                    System.out.println("Statement is: "+true);
                     System.out.println( c+""+ b +""+ a);
           }
        }else if (b >= a &&  b >= c){
                    if (a >= c){
                        System.out.println(a+""+b+""+c+" Statements is: "+false);
                    }
        }else if (c >= a && c>= b){
                if (a >= b ){
                    System.out.println("Statement is "+true);
                    System.out.println(c +""+ a +""+ b);
                } else if (b >= a){
                    System.out.println("Statement is "+true);
                }
        }

    }   // NOT FINISHED
}
