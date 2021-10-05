package myOwnPractices.replPractise;

public class TimeConversionTo24 {
    public static void main(String[] args) {
        timeConversion("01:50:45PM");
    }

    public static void timeConversion(String s) {
        if(s.contains("12") && s.contains("AM")){
            s = s.replaceFirst("12","00");
            s = s.substring(0 , s.length()-2);
            System.out.println(s);

        } else if (s.contains("12") && s.contains("PM")){
            s = s.substring(0 , s.length()-2);
            System.out.println(s);

        }else if (s.contains("PM")){
            s = s.substring(0 , s.length()-2);
            String [] arr = s. split(":");
            int intHour = Integer.parseInt(arr[0]);
            int minute = Integer.parseInt(arr[1]);
            if(intHour < 12 && minute < 60) {
                intHour += 12;
            } else {
                System.out.println("Please enter time in 12:00 hour format");
            }
            String strHour = new String(String.valueOf(intHour));
            arr[0] = strHour;
            String newTime = String.join(":", arr);
            System.out.println(newTime);

        }else{
            s = s.substring(0 , s.length()-2);
            System.out.println(s);
        }

    }
}
