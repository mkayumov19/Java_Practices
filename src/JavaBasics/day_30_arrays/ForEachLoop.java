package JavaBasics.day_30_arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};

        for (int eachNum : data){                                   // FOR EACH LOOP
            System.out.print(eachNum + " ");
        }
        System.out.println("---------FOR EACH LOOP-------");
//   ---------------------------------------------------------------------------------------
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i]+" ");                          // FOR LOOP
        }
        System.out.println("---------FOR LOOP-------");

        System.out.println("Last value/element in array - " + data[data.length-1]);
        System.out.println("---------------------------");
//   -----------------------------------------------------------------------------------------
        //print all number backwards in same line
        for(int idx = data.length - 1; idx >= 0; idx--) {
            System.out.print(data[idx] + " ");
        }
    }
}
