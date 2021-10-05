package myOwnPractices.AbstractPractice;

public class NonAbsThree extends AbsTwo{

    @Override
    public void methOne() {
        System.out.println("NonAbsThree implements AbsOne");
    }

    @Override
    public void methOneOne() {
        System.out.println("NonAbsThree implements AbsTwo");
    }

    public static void main(String[] args) {
        NonAbsThree absThree = new NonAbsThree();
        absThree.methOne();
        absThree.methTwo();
        absThree.methOneOne();
//        absThree.methTwoTwo();

    }
}
