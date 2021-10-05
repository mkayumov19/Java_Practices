package myOwnPractices.mixedPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayDeclaringWays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2,5,7};

        /** <----- OR -----> */

        int[] nums2 = new int[3];
        nums2[0] = 2;
        nums2[1] = 5;
        nums2[2] = 7;
        /** <----- OR -----> */

        int[] nums3 = {2,5,7};
    }

    public static class ArraysQuiz3 {
        public static void main(String[] args) {

           char[] arr = {'D','C','B','A'};
            Arrays.sort(arr);
            for (char each:arr) {
                System.out.println(each + " ");
                if(each == 'D'){
                    continue;
                }
            }

            int n = 0 ;
            String[] days = {"sun", "mon", "wed", "sat"};
            for (int i = 0; i < days.length; i++) {
                switch (days[i]){
                    case "sat":
                    case "sun":
                        n -=1;
                        break;
                    case "mon":
                        n++;
                    case "wed":
                        n +=2;
                }
            }
            System.out.println(n);
        }
    }

    public static class FirstQuizSamples {
        public static void main(String[] args) {

            long a =30L;
            long b = (short)a;
            System.out.println(b);

            float a1 =100.987_6543f;
            short b1=(byte)a1;
            byte c1=(byte)b1;
            System.out.println(c1);

            long a2 =3_000L;
            double b2 = (float)a2;
            System.out.println(b2);
            int i2=100;
            double d2=123;
            float f2=300;
    //      i2=f2;                  -------> does not work
            d2=f2;
    //      f2=d2;                  -------> does not work
            d2=i2;
    //      i2=d2;                  -------> does not work

        }
    }

    public static class ForLoopQuiz {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
    //    for (int i = 0; i < 5; i--){
    //        System.out.println("Kello");
    //    }
            int z = 5;
        for(int i = 5; i > 0; i--){
            z += i;
        }
            System.out.println(z);

            int a = 0;
            while (a <= 6){
                a += 2;
            }
            System.out.println(a);
        }
    }

    public static class Person {

        private String surname;
        private String name;

        public Person(String surname, String name){
            this.name = name;
            this.surname = surname;
        }

        public static void main(String[] args) {
            HashMap<Person, String> personMap = new HashMap<>();
            Person person1 = new Person("Smith", "John");
            Person person2 = new Person("Smith", "John");

            personMap.put(person1, "person1");
            System.out.println(personMap.get(person2));
        }

    }

    public static class Pillow {
        public static void main(String[] args) {

            new Unit4Quiz();
            Unit4Quiz a = new Unit4Quiz();
            Unit4Quiz a2 = new Unit4Quiz("word");
            Unit4Quiz a3 = new Unit4Quiz(5);
            System.out.println(Unit4Quiz.count);

        }

    }

    public static class SecondQuizSamples {
        public static void main(String[] args) {
    //
    //        int x = 10;
    //        int y = x++;
    //        System.out.println(y++ + " " + x++ + " " + y);
            boolean x = true;
            boolean y = !x == false;
            boolean z = y;
            if (x) {
                System.out.println("1");
            }if(y){
                System.out.println("2");
            }if(z){
                System.out.println("3");
            }

            int num = 9;
            if (num++ == 10){
                System.out.println("Hello world"+num);
            }else {
                System.out.println("hello universe"+num);
            }

            int number = 10;
            if (--number > 10){
                System.out.println("Hello cybertek"+number);
            }else{
                System.out.println("Hello world"+number);
            }
            int score = 0;
            if (score == 0){
                score += 50;
            }if (score != 0) {
                score += 50;
            }
            System.out.println(score);

            int number1 =10;
            if (number1 % 2 == 0){
                System.out.println(number1 + " is even");
            }else{
                System.out.println(number1 + " is odd");

            }

        }
    }

    public static class Test {

        static String name = "John";
        static String id = "123";       //if this is not static, println would not read this line.

        public static void main(String[] args) {

            System.out.println(name);           //John
            System.out.println(id+1);           //1231          ...if id was not static = ERROR.
        }
    }

    public static class Test1 {

        int num = 10;

        public static void main(String[] args) {

            Test1 obj1 = new Test1();
            obj1.num = 20;

            Test1 obj2 = new Test1();
            System.out.println(obj2.num);       //10

        }
    }

    public static class Test2 {

        static int nums = 10;

        public static void main(String[] args) {

            Test2 obj1 = new Test2();
            obj1.nums = 20;
            nums = 30;

            Test2 obj2 = new Test2();

            System.out.println(obj2.nums);      //30
            System.out.println(nums);           //30

        }
    }

    public static class Test3 {
        static int a;
        int b;

        public static void main(String[] args) {
            Test3 obj1 = new Test3();
            obj1.b = 10;
            obj1.a = 20;

            Test3 obj2 = new Test3();
            obj2.b = 30;
            obj2.a = 40;

            System.out.println(obj1.a + " " + obj1.b);
            System.out.println(obj2.a + " " + obj2.b);
        }
    }

    public static class ThirdQuizSamples {
        public static void main(String[] args) {

            float f1 = (12_435.1 > 123_45.0) ? 12_456 : 124_56.02f;
            float f2 = f1 + 1024;
            System.out.println(f2);

            int z = 11;
            switch(z){
                case 10:
                    System.out.println("Monday");
                case 11:
                    System.out.println("Tuesday");
                case 12:
                    System.out.println("wednesday");
                default:
                    System.out.println("friday");
            }

        }
    }

    public static class Unit2Assesment {
        public static void main(String[] args) {

    //        String a = "123";
    //        String b = 5+4+a;
    //        System.out.println(b);
    //        String s = "the game was tied at 2-2";
    //        String s2 = s.substring(5);
    //        int index1 = s.indexOf("game");
    //        int index2 = s2.indexOf("game");
    //        if(index1 == index2){
    //            System.out.println(index1);
    //        }else{
    //            System.out.println(index2);
    //        }
    //        String z = "popcorn";
    //        z = z.substring(1,8);
    //        if(z.equals("opcor")){
    //            System.out.println(z.length());
    //        }else{
    //            System.out.println(z.replaceAll("0", "a"));
    //        }

    //        String a = "today I will go to the beach";
    //        boolean b = a.contains("i");
    //        boolean c = a.substring(12).startsWith("go");
    //        String result = b && c ? "go" : "dont't go";
    //        System.out.println(result);

    //
    //        int number = 5;
    //        String str = "The whole time it was raining.";
    //        do{
    //            System.out.println(str.charAt(0));
    //            str = str.substring(3);
    //        } while (!str.isEmpty());

    //        System.out.println(number);
    //
    ////

    //        String s = "I will find the lost book";
    //        String wordr = "";
    //        for (int i = s.length()-1; i <= 0 ; i--) {
    //            wordr += s.charAt(i);
    //        }
    //        System.out.println(wordr);

    //        String str = "cybertek";
    //        for (int i = 0; i <= str.length() ; i+= 2) {
    //            System.out.print(str.charAt(i));
    //        }


    //        String input = "today it will be 100 degrees";
    //        int n = 0;
    //        while ( n++ < input.length()){
    //            if(n == 8){
    //                continue;
    //            }else if(n == 9){
    //                break;
    //            }
    //            System.out.println(input.charAt(++n));
    //        }


    //
    //        int count = 0;
    //        for (int a = 0; a < 4; a++) {
    //            if(a == 3)continue;
    //            for (int b = a+1; b < 5; b++) {
    //                count++;
    //                if(b ==3)break;
    //            }
    //        }
    //        System.out.println(count);
    //
    //double[] nums = new double[4];
    ////int a = 5;
    //        nums[0] = 1.0;
    //        nums[2] = 42.1;
    //        nums = new double[4];
    //
    //        nums[1] = 17.2;
    //        nums[3] = nums.length;
    ////        nums[3] = nums[a-3];
    //        System.out.println(Arrays.toString(nums));

    //            int [] arr = {1,3,12,5,24,7,9,10};
    //            boolean [] bArr = new boolean [arr.length];
    //        for (int i = 0; i < arr.length; i++) {
    //            if(arr[i] % 2 == 0){
    //                bArr[i] = true;
    //            }
    //        }
    //        System.out.println(Arrays.toString(bArr));

    //        String[] things = {"house","shed","slide","zebra","park","garden"};
    //        for (String s : things) {
    //            switch (s.charAt(1)){
    //                case 'h':
    //                    System.out.println(1);
    //                    break;
    //                case 'a':
    //                    System.out.println(2);
    //                case 's' :
    //                    System.out.println(3);
    //                    break;
    //                case 'o':
    //                default:
    //                    System.out.println(4);
    //                case 'p' :
    //                    System.out.println(5);
    //                    break;
    //                case 'z':
    //                    System.out.println(6);
    //                case 'l' :
    //                    break;
    //                case 'g':
    //                    System.out.println(7);
    //
    //            }
    //        }


        }
    }

    public static class Unit3Quiz {
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

    public static class Unit4Quiz {

       static int count;
       public Unit4Quiz(){
           count++;

       }
       public Unit4Quiz(int i){
           count +=i;

       }
       public Unit4Quiz(String s){
           count += s.length();
       }

    }

    public static class UnitOneQuiz {
        public static void main(String[] args) {
    //       int num = 2;
    //       boolean b = true;
    //       switch (num){
    //           case 0:
    //               b = false;
    //           case 1:
    //               System.out.println(1);
    //           case 2:
    //               if(b){
    //                   System.out.println(2);
    //               }else{
    //                   b = false;
    //               }
    //           case 3:
    //               if (b){
    //                   System.out.println(3);
    //                b = false;
    //               }else{
    //                   break;
    //               }
    //           case 4:
    //               System.out.println(4);
    //           case 5:
    //               if(!b){
    //                   break;
    //               }
    //               System.out.println(5);
    //       }

            int one = 5;
            int two = 2;
            if(one-- > two *2){
                System.out.println("one");
            }else{
                System.out.println(two);
            }


        }
    }
}
