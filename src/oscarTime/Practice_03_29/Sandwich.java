package oscarTime.Practice_03_29;

public class Sandwich {
    public static void main(String[] args) {

        String str = "breadjambread";
        boolean isValid = false;
        if(str.contains("bread")) { // 5,5
            int firstBread = str.indexOf("bread");
            if(str.substring(firstBread+5).contains("bread")) { //jambread
                int secondBread = str.lastIndexOf("bread");
                String result = str.substring(firstBread + 5,secondBread);
                if(result.isEmpty()) {
                    System.out.println("nothing");
                } else {
                    System.out.println(result);
                }
            } else {
                System.out.println("nothing");
            }
        } else {
            System.out.println("nothing");
        }
//        String str = "breadbread";  // 0 + 5 = 5 -> substring(5) -> jam.contain(bread)
//        boolean isValid = false;
//        String result = "";
//
//        if(str.contains("bread")) { // 5,5
//
//            int firstBread = str.indexOf("bread");
//
//            if(str.substring(firstBread+5).contains("bread")) { //jambread
//                int secondBread = str.lastIndexOf("bread");
//                result = str.substring(firstBread + 5,secondBread);
//                isValid = true;
//            }
//
//        }
//
//        if(!isValid || result.isEmpty()) {
//            System.out.println("nothing");
//        } else {
//            System.out.println(result);
//        }
    }
}
