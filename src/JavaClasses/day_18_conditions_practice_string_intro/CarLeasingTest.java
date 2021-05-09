package JavaClasses.day_18_conditions_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "A";
        double leasePrice = 0.0;

//        if(make.equals("Mercedes") && model.equals("E")) {
//            leasePrice = 500.0;
//        }else if (make.equals("Mercedes") && model.equals("A")) {
//            leasePrice = 400.0;
//        }
        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            }else if (model.equals("A")) {
                leasePrice = 400.0;
            }
        }else {
            System.out.println("Invalid make");
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
// ============================================================================================
        String carMake = "Toyota";
        String carModel = "A";
        double carLeasing = 0.0;

        if(carMake.equals("Mercedes") && carModel.equals("E")) {
            carLeasing = 500.0;
        }else if (carMake.equals("Mercedes") && carModel.equals("A")) {
            carLeasing = 400.0;
        }

        if (make.equals("Mercedes")) {
            if (carModel.equals("E")) {
                carLeasing = 500.0;
            }else if (carModel.equals("A")) {
                carLeasing = 400.0;
            }
        }else {
            System.out.println("Invalid make");
            return; //exit program/ exit main method
        }

        System.out.println("make = " + carMake);
        System.out.println("model = " + carModel);
        System.out.println("leasePrice = " + carLeasing);
    }
}
