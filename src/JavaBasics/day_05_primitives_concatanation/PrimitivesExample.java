package JavaBasics.day_05_primitives_concatanation;

public class PrimitivesExample {
    public static void main(String[] args){

//      All primitives start with small letters
//      Whole numbers: ======================================
        byte byteValue = 123;
        short shortValue = 12345;
        int intValue = 1234567890;
        long longValue = 1234875625678901L;                  //we have to put L at the end so it does not think it Int.

//      Decimal numbers/Floating point ========================
        float floatValue = 2365.87755F;                      //we have to put F at the end
        double doubleValue = 35876553432.498364651293847;    //D also valid but not needed.

//      Character type ========================================
        char charValue = '$';                               //1 character in single quote
//      Boolean type  =========================================
//      bool boolValue = true;
        double totalValue = byteValue+shortValue+intValue+longValue+floatValue+doubleValue;
        if (totalValue > 999){

            System.out.println("Total Balance in Account: "+charValue+totalValue);


        }


    }

}
