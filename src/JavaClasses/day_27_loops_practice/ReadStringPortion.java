package JavaClasses.day_27_loops_practice;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat, car, cat, red_car, selenium, maven";

        for (int i = 0; i < list.length()-2; i++){
           String part = list.substring(i,i+3);
            System.out.println(part);
            if (part.equals("cat")||part.equals("car")){
                System.out.println("cat or car found");
            }else{
            }
        }

//        int i = 0;
//        System.out.println(list.substring(i,i+3));
//        i++;
//        System.out.println(list.substring(1,4));
//        i++;
//        System.out.println(list.substring(2,5));
//        i++;
//        System.out.println(list.substring(3,6));

    }
}
