package JavaBasics.day_20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {

        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());                 // true
        System.out.println(jobTitle.length());                  // 0
        System.out.println(jobTitle.length() == 0);             // true

        if (jobTitle.isEmpty()){
            System.out.println("JobTitle is missing, please resend");
        }else{
            System.out.println("JobTitle looks good");
        }
        if (jobTitle.length() ==0){
            System.out.println("Job title is empty");
        }else{
            System.out.println("Job title is not empty");
        }
        System.out.println(jobTitle.equals(""));
        if ("".equals(jobTitle)) {
            System.out.println("Job title is empty too");
        }else{
            System.out.println("Job title is not empty too");
        }
        String word = " ";
        System.out.println(word.isEmpty());                         // false
        System.out.println(word.length());                          // 1

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());                       // false

        if(!veggie.isEmpty()){
            System.out.println("We have " + veggie);
        }
//        String word2;                                              word not initialized -->
//        System.out.println(word2.isEmpty());                       --> ERROR



    }
}
