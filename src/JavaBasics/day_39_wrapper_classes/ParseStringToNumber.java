package JavaBasics.day_39_wrapper_classes;

public class ParseStringToNumber {
    public static void main(String[] args) {

        String total = "345";
        int count = Integer.parseInt(total);                        // Converting String into Number !!!
        int num = Integer.parseInt("220");                       // Converting String into Number !!!
        System.out.println("total is String: " + total);
        System.out.println("count is number: " + count + "\nnum is number: " + num);

        String str = "123.5";
        double price = Double.parseDouble(str);
        if(price > 100){
            System.out.println("Expensive");
        }

        String sentence = "I wrote 540 lines of code";
        String[] myArray = sentence.split(" ");
        int lineOfCode = Integer.parseInt(myArray[2]);
        System.out.println("" + lineOfCode);

    }
}
