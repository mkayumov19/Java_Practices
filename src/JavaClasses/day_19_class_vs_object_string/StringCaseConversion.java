package JavaClasses.day_19_class_vs_object_string;

public class StringCaseConversion {
    public static void main(String[] args) {

        String word = "CyberTek";
        String sentence = "123 Java is Fun";
        System.out.println(word.toUpperCase());
        System.out.println("CYBERtek".toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();                 //
        System.out.println(word);           // this way it does not change "word" to lowercase.

        String wordInLcase = word.toLowerCase();
        System.out.println("WordinLcase = " + wordInLcase);

        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - "+ company.toUpperCase());
        System.out.println("Java".toUpperCase());

        String newCompany = company.toUpperCase();              // declaring and changing companies value
        company = company.toUpperCase();                        // just reassigning value of company
        System.out.println(company);
        System.out.println(newCompany);

    }
}
