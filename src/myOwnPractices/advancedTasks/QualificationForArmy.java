package myOwnPractices.advancedTasks;

public class QualificationForArmy {
    public static void main(String[] args) {
        String citizenship = "USA";
        boolean resident = true;
        boolean hasHighSchDiploma = true;
        int age = 20;
        if(citizenship.equals(citizenship.equalsIgnoreCase("USA")) || resident == true){
            if(age >= 18 && age <= 35){
               if(hasHighSchDiploma == true){
                   System.out.println("You are qualified for the US Army");
               }else{
                   System.out.println("You must have a high school diploma");
               }
            }else{
                System.out.println("Your age must be between 18 to 35 years old");
            }
        }else{
            System.out.println("You must be a U.S. citizen or a resident");
        }
    }
}
