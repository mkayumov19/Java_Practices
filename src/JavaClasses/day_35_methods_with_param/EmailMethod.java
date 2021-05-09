package JavaClasses.day_35_methods_with_param;

public class EmailMethod {
    public static void main(String[] args) {
        String name = "Bayden Aka";
        String domain = "trump Tower";
        buildEmail(name,domain);
        buildEmail("Makhmudjon","gmail");
    }
    public static void buildEmail(String name, String domain){
        name = name.replace(" ","_").toLowerCase();
        domain = domain.replace(" ","-").toLowerCase();
        System.out.println("Email suggestion is: "+name+"@"+domain+".com");
    }
}
