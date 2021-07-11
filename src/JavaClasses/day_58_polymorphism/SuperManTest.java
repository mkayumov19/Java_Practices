package JavaClasses.day_58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {

        Father spMan1 = new SuperMan();
        spMan1.feedKid();
        spMan1.playWithKid();
        spMan1.raiseKid();

        SuperMan spMan2 = new SuperMan();
        spMan2.work("SDET");
        spMan2.getPaid();
        spMan2.raiseKid();
        spMan2.feedKid();
        spMan2.playWithKid();

        Worker spMan3 = new SuperMan();
        spMan3.work("Teacher");
        System.out.println("spMan3 gets paid $" + spMan3.getPaid());



    }
}
