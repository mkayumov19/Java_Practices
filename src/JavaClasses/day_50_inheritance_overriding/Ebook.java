package JavaClasses.day_50_inheritance_overriding;

public class Ebook extends Book{

    int size;
    int pages;

    public void readBook(){
        System.out.println("Reading book: ");
        System.out.println("Title = " + title);
        System.out.println("Author: " + author);
        System.out.println("Book size: " + size);
        System.out.println("Book price: " + price);
        System.out.println("Book type: " + type);

    }
}
