package JavaBasics.day_11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {

//        == --> equals
//        >  --> greater than
//        <  --> less than
//        >= --> greater than or equals
//        =< --> less than or equals
//        != --> not equal

        System.out.println(5 == 5);
        System.out.println(10 > 5);
        System.out.println(10 < 5);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 100);

        int a = 100;
        int b = 200;
        System.out.println(a==b);
        System.out.println(+a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        boolean result;
        result = 5 == 5;
        System.out.println("result = "+result);

        result = 33 > 55;
        System.out.println("result = "+result);
        result = 33 < 55;
        System.out.println("result = "+result);
        result = 46 >= 86;
        System.out.println(result);
        result = 123 <= 124;
        System.out.println("result = " + result);

        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");
        System.out.println(city != "Fairfax");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);

        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);

        int age = 2;
        boolean noMoreToddler = age > 3;
        System.out.println(noMoreToddler);

        age = 66;
        boolean seniorCitizen = age >= 65;
        System.out.println(seniorCitizen);

    }

}
