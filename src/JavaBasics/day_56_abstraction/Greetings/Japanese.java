package JavaBasics.day_56_abstraction.Greetings;

public class Japanese implements Greeting {

    @Override
    public void hi() {
        System.out.println("こんにちは");
    }

    @Override
    public void bye() {
        System.out.println("さようなら");
    }
}

