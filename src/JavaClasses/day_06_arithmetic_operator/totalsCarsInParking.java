package JavaClasses.day_06_arithmetic_operator;

public class totalsCarsInParking {
    public static void main(String[] args) {

//       int toyota = 431;
//       int hondas = 233;
//       int  vw = 2;
//       int tesla = 20;
//       int nissans = 1;
//       int bmw = 155;
         int toyota = 431, hondas = 233, vw = 2, tesla = 20, nissan = 1, bmw = 155;
         int totalCars = toyota+hondas+vw+tesla+nissan+bmw;
        System.out.println("There are "+totalCars+" total cars in lot");

        String pizza = "Hawaiian";
        int slices = 8;
        int people = 4;
        int perPerson = slices/people;
        System.out.println(perPerson+" slices of pizza per person");
        System.out.println("We ordered "+pizza+" pizza with "+slices+
                " slices, "+people+" people ate "+perPerson+" slices each.");


    }
}
