package JavaClasses.day_28_loops_practice2;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;
        for (int day = 1; day <= 30; day++){
            if (day % 7 == 0){
                totalCases += 500;
                System.out.println("Hard day is coming up!");
            }else{
                totalCases +=200;
            }
            System.out.println("Day "+day+": total cases: "+totalCases);
        }
        System.out.println("JavaCity 11/2021 Total Cases: "+totalCases);
    }
}
