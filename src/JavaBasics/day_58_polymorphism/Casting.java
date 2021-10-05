package JavaBasics.day_58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid();

        //DOWNCASTING from Worker to SuperMan class
        SuperMan superman = (SuperMan) worker;
        superman.feedKid();
        superman.work("SDET");


    }

}
