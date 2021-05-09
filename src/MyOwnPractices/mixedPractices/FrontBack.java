package MyOwnPractices.mixedPractices;

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
    }

    public static String frontBack(String str) {
        if(str.length() > 1){
            String front = str.substring(0,1);
            String back = str.substring(str.length()-1);
            str = back + str.substring(1,str.length()-1) + front;
        }
        return str;

    }
}

