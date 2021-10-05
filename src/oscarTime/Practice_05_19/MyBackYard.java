package oscarTime.Practice_05_19;

public class MyBackYard {
    public static void main(String[] args) {

        Birds birdOne = new Birds();
        Birds birdTwo = new Birds();
        birdOne.setCanFly(true);
        System.out.println(birdOne.canFly());
        birdTwo.setBeakLength(2);
        System.out.println(birdTwo.getBeakLength());

    }

}
