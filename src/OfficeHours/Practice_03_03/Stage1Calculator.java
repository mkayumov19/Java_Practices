package OfficeHours.Practice_03_03;

public class Stage1Calculator {

    public static void main(String[] args){

        double numOne = 10.0;
        double numTwo = 5.0;

        double addition = numOne + numTwo;
        double subtraction = numOne - numTwo;
        double multiplication = numOne * numTwo;
        double division = numOne / numTwo;
        double remainder = numOne % numTwo;

        System.out.println("Addition Result: "+addition+";\nSubtraction Result: "+subtraction+";\nMultiplication Result: "
                +multiplication+";\nDivision Result: "+division+";\nRemainder Result: "+remainder+"\n");

        //small number's remainder always Equal to that small number: 5%10=5

        System.out.println("Calculation for " + numOne + " & " + numTwo);
        System.out.println(numOne + " + " + numTwo + " = " +  addition);
        System.out.println(numOne + " - " + numTwo + " = " +  subtraction);
        System.out.println(numOne + " * " + numTwo + " = " +  multiplication);
        System.out.println(numOne + " / " + numTwo + " = " +  division);
        System.out.println(numOne + " % " + numTwo + " = " +  remainder+"\n");

        // Printing without variables

        System.out.println("Calculation for " + numOne + " & " + numTwo);
        System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
        System.out.println(numOne + " - " + numTwo + " = " +  (numOne - numTwo));
        System.out.println(numOne + " * " + numTwo + " = " +  (numOne * numTwo));
        System.out.println(numOne + " / " + numTwo + " = " +  (numOne / numTwo));
        System.out.println(numOne + " % " + numTwo + " = " +  (numOne % numTwo));
    }
}
