package MyOwnPractices.replitTasks.TV_OOP;

public class TvTest {
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println(tv.getVolumeLevel());
        tv.turnOff();
        tv.setChannel(5);

        TV tv2 = new TV("Samsung");
        tv2.turnOn();
        tv2.turnOn();
        tv2.setChannel(8);
        tv2.setChannel(20);
        tv2.setVolumeLevel(7);
        tv2.volumeUp();
    }
}
