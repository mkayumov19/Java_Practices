package JavaBasics.day_14_multi_branch_if_statements;

public class WarmUpDay14 {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete file?");
        char selection = 'y';
        boolean answer;
        String result;
        if( selection == 'y'){
            System.out.println("Your file will be deleted!");
            answer = true;
            result = "deleted";
        } else {
            System.out.println("File deletion canceled.");
            answer = false;
            result = "not deleted";
        }
        System.out.println("Did file get deleted? - " + answer + ". Your file is " + result);


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Are you sure you want to delete this?");
//        String select = scan.next();
//        boolean isYes = select.equals("y");
//        if(isYes) {
//            System.out.println("Your file is deleted.");
//        } else {
//            System.out.println("Your file deletion is cancelled");
//        }
    }
}
