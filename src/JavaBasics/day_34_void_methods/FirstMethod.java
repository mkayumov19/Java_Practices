package JavaBasics.day_34_void_methods;

public class FirstMethod {
    public static void myMessage (){
        System.out.println("Hello from second Method! --> This comes from my 2nd Method");
    }
    public static void main(String[] args) {
        System.out.println("Hello B22 friends ---> Prints from Main Method");
        displayMessage();
        myMessage();
        for (int i = 0; i <=100; i++){
            displayMessage();
        }
    }
        public static void displayMessage () {
            System.out.println("Hello world!   \t--------> This comes from my 1st Method");

    }
}