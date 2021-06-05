package JavaClasses.day_50_inheritance_overriding;

public class BookObjects {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.title = "Intro to Java";
        b1.author = "Savitch Valter";
        b1.type = "Programming";
        b1.price = 249.99;

        System.out.println("Books title: " + b1.title);
        System.out.println("Book's author: " + b1.author);
        System.out.println("Book type: " + b1.type);
        System.out.println("Book's price: " + b1.price);
        System.out.println("-------------------------------");

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 80;
        audioBook.narrator = "Irina";
        audioBook.price = 44.99;
        audioBook.title = "Selenium cookbook";
        audioBook.type = "Automation";
        audioBook.listen();
        System.out.println("-------------------------------");

        Ebook ebook = new Ebook();
        ebook.title = "Java data structures";
        ebook.author = "Savitch";
        ebook.type = "programming";
        ebook.price = 35.00;
        System.out.println("E-Books title: " + ebook.title);
        System.out.println("E-Book's author: " + ebook.author);
        System.out.println("E-Type of book: " + ebook.type);
        System.out.println("E-Book's price: " + ebook.price);

    }
}
