package myOwnPractices.replPractise;

public class RemoveFirst {
    public static void main(String[] args) {
        System.out.println(removeFirst("aaa"));
    }

    public static String removeFirst(String target) {
        String word = "";
        for(int i =1; i < target.length(); i++){
                word += target.charAt(i);
            }
            return word;
        }
    }
