package JavaBasics.day_32_arrays_split;

public class MallShopping{
    public static void main(String[] args) {
//                            1        2       3         4        5          6
        String[] items  = {"Shoes","Jacket","Gloves","Airpods","Ipad","iphone 11 case" };
        double[] prices = { 99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   { 12345 , 12346, 12347, 12348, 12349, 12350};
        System.out.println("========== WELCOME TO PANDEMY-MALL ==========");
        System.out.println("------- Find the index of 'Gloves' in items array");
        for (int i = 0; i < items.length; i++){
            if(items[i].equals("Gloves")){
                System.out.println("\t\t\tGloves found at index "+i);
                break;
            }
        }
        System.out.println("------- Set boolean to true if first 'Ipad' is found");
        boolean ipadExist = false;
       for(String item : items){
            if(item.equalsIgnoreCase("ipad")) {
                ipadExist = true;
                break;
            }
       }
        System.out.println("\t\t\tIpad exists - " + ipadExist);
        System.out.println("------- Print report of each shopping item ------");
        for (int i = 0; i < items.length; i++){
            System.out.println("\t\t\t"+items[i] +"\tPrice: $"+prices[i]+"\tTag Number: "+itemIDs[i]);
        }
        System.out.println("------- Look for 'Jacket' in items and print all details ------");
        for (int k = 0; k < items.length; k++) {
            if(items[k].equalsIgnoreCase("jacket")){
                System.out.println("\t\t\tItem: "+items[k] +" - $"+ prices[k] +" - Tag Number: "+ itemIDs[k]);
                break;
            }
        }
    }
}
