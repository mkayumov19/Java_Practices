package JavaBasics.day_50_inheritance_overriding;

public class AudioBook extends Book{

    int length;
    String narrator;

    public void listen() {
        System.out.println(author + " is listening to AudioBook");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
        System.out.println("narrator = " + narrator);
        System.out.println("length = " + length);
    }

}
