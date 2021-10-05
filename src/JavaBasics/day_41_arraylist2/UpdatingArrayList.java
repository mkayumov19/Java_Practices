package JavaBasics.day_41_arraylist2;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Honda");
        myCars.add("Moskvich");
        myCars.add("Tesla");
        myCars.add(0,"Jeep");
        myCars.add(1,"Lada");
        myCars.add(2,"Yugo");

        System.out.println(myCars.toString());      //prints all cars in list

        String allCarsInList = myCars.toString();   //saves all cars in one string variable
        System.out.println("allCarsInList = " + allCarsInList);

        //change index 0 to Lamborghini
        myCars.set(0,"Lamborghini");
        System.out.println("After .set = " + myCars.toString());
        myCars.set(4, "Kawasaki");                                  //if it was array: myCars[4] = "Honda";
        System.out.println("After .set = " + myCars.toString());

        System.out.println("Index of Toyota is = " + myCars.indexOf("Toyota"));
        int teslaIndex = myCars.indexOf("Tesla");
        System.out.println("Tesla index is = " + teslaIndex);

        //change kawasaki to jiguli
        myCars.set(teslaIndex, "Jiguli");
        System.out.println("After set to jiguli: = " + myCars.toString());

        myCars.set(myCars.indexOf("Yugo"),"Trabant");
        System.out.println(myCars);

        if (myCars.contains("Lada")){
            myCars.set(myCars.indexOf("Lada"),"Bugatti");
        } else {
            System.out.println("Lada is not found");
        }
        System.out.println("After .set bugatti = " + myCars.toString());

        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("Lamborghini")){
                myCars.set(i,"Prius");
            } else if (myCars.get(i).equals("Honda")) {
                myCars.set(i, "Lexus");
            } else if (myCars.get(i).equals("Trabant")){
                myCars.set(i,"Audi");
        }
      }
        System.out.println(myCars.toString());
    }
}














