package JavaBasics.day_29_nestedLoops_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\t*** Multiplication table ***");
        for(int outer = 1; outer <= 10; outer++){
            for(int inner = 1; inner <= 10; inner++){
                System.out.print(outer * inner + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("============================================");
        for(int outer = 1; outer <= 10; outer++){
            for(int inner = 1; inner <= 10; inner++){
                int result = inner * outer;
                System.out.print("|\t"+inner+" * "+outer+" = "+result+"\t");
            }
            System.out.print("\n");
        }
    }
}
