package myOwnPractices.mixedPractices;

public class StringObject {
    public static void main(String[] args) {

        String s = "hi";
        String x = "hi";
        String a = "hi bob";
        String b = " bob";
        String c = x.concat(b);

        if (s==x){
            System.out.println(true);;
        }else{
            System.out.println(false);
        }
        if (c==a){
            System.out.println(true);;
        }else{
            System.out.println(false);
        }
        if (c.equals(a)){
            System.out.println(true);;
        }else{
            System.out.println(false);
        }
    }
}
