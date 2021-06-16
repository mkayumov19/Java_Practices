package JavaClasses.day_54_abstraction;

public abstract class MyAbstractClass {
    int num = 55;

    public void learn() {
        System.out.println("Learning...");
    }

    public abstract void close();

}

class Sub extends MyAbstractClass {
    public void close() {
        System.out.println("Close - abstract method implementation");
    }
}

class MyObjects {
    public static void main(String[] args) {
//      MyAbstractClass mac = new MyAbstractClass();
        Sub sub1 = new Sub();
        sub1.learn();
        sub1.close();
    }
}
