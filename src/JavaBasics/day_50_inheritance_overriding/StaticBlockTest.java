package JavaBasics.day_50_inheritance_overriding;

public class StaticBlockTest {

    public static void main(String[] args) {
        StaticBlockDemo sb1 = new StaticBlockDemo();    //static(10), constructor(15)
        StaticBlockDemo sb2 = new StaticBlockDemo();    //constructor(20)
        StaticBlockDemo sb3 = new StaticBlockDemo();    //constructor(25)

        System.out.println(StaticBlockDemo.num);        //num(25)
        StaticBlockDemo sb4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);    //75




    }

}
