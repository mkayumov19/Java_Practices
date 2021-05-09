package JavaClasses.day_19_class_vs_object_string;

public class StartsEndsWithContains {
    public static void main(String[] args) {

        String word = "Selenium";
        System.out.println(word);
        System.out.println("Starts with ..s " + word.startsWith("s"));
        System.out.println("Starts with ..S " + word.startsWith("S"));
        System.out.println("Starts with ..Semen " + word.startsWith("Semen"));
        System.out.println("Starts with ..Se " + word.startsWith("Se"));
        System.out.println("Starts with ..se " + word.endsWith("se"));
        System.out.println("Starts with ..le " + word.startsWith("le"));

        String urword = "Java";
        System.out.println(urword);
        System.out.println("ends with..va " + urword.endsWith("va"));
        System.out.println("ends with..a " + urword.endsWith("a"));
        System.out.println("ends with..A " + urword.endsWith("A"));
        System.out.println("ends with..ava " + urword.endsWith("ava"));

        String name = "Murodil";
        if (name.startsWith("M") && name.endsWith("l")) {
            System.out.println(name);
        } else {
            System.out.println("Something is wrong here");
        }

        String name1 = "Mr. Murodil";
        if (name1.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (name1.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (name1.startsWith("Mrs.")){
            System.out.println("married woman");
        } else if (name1.startsWith("Ms.")){
            System.out.println("Single woman");
        }else if (name1.startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("Normal name");
        }

        String url = "WhereIsMyStimulusPayment.com";
        if (url.endsWith(".com")) {
            System.out.println("Commercial web");
        } else if (url.endsWith(".ru")) {
            System.out.println("russian web");
        } else if (url.endsWith(".gov")){
            System.out.println("Government web");
        } else if (url.endsWith(".org")){
            System.out.println("Organization web");
        }else if (url.endsWith(".edu")){
            System.out.println("educational");
        }else{
            System.out.println("Unidentified HTTP");
        }
    }
}
