package JavaBasics.day_60_exceptions;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("lets create exceptions");
//        RuntimeException e = new RuntimeException();
//        throw e;
        String userName = "";
        if(userName.isEmpty()){
            throw new NullPointerException("userName cannot be empty");
        }
    }
}
