package MyOwnPractices.quiz_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Unit3Quiz {
//    public static void main(String[] args) {
//            int result = method4('z',"zebra");
//        System.out.println("result");
////        method1();
//    }
////
////    public static void method1(){
////        int n = 5;
////        for (int i = 0; i < 5; i++) {
////            n += i;
////        }
////        System.out.println(n);
//    public static int  method4(char c, String s){
//        if(s.contains("" + c)){
//            return 1;
//        }else {
//            return 0;
//        }
//        Scanner input = new Scanner(System.in);
//        int [] a = new int [input.nextInt()];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = input.nextInt();
//        }
//        method8(a);
//    }
//
//    public static void method8(int[] arr){
//        for (int n : arr){
//            if(n % 2 == 0){
//                continue;
//            }
//            System.out.println(n);
//        }

//        public static String method9(String one,String two, String three){
//            return"" + middle(one) + middle(two) + middle(three);
//        }
//        public static void main(String[] args) {
//        String str = method9("lawn", "solar","activity");
//            System.out.println(str);
//    }
//        public static char middle(String s){
//            return s.charAt(s.length()/2);
////    }
//    public static int action(int i){
//        return  i *2;
//    }
//
//    public static void main(String[] args) {
//        int total = 0;
//        total += action(true);
//        total += action(6);
//        total += action("false");
//        total += action("four");
//        System.out.println(total);
//
//    }
//    public static int action (String s){
//        return s.length();
//    }
//    public static int action(boolean b){
//        if(!b){
//            return 5;
//        }else{
//            return  10;
//        }
//    }
public static void main(String[] args) {

//
//    ArrayList<Integer> nums = new ArrayList<>();
//    nums.add(4);
//    nums.add(2);
//    nums.add(10);
//    nums.add(0,6);
//    nums.add(-7);
//    nums.add(2,2);
//    System.out.println(nums);


//
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
        String s = "";
    for (int i = 0; i <numbers.size() ; i++) {
        if (numbers.get(i) > 5){
            continue;
        }
        if (numbers.get(i) % 2 == 0){
            s += "1";
        }else{
            s += "0";
        }
    }
    System.out.println(s);

    }
}












