package OfficeHours.Practice_03_24;

public class AccountNumber {
    public static void main(String[] args) {

//     Requirement:   Declare a variable account number (String). You will check if these account numbers are valid.
//                - If the account number begins with a “2” the account number should be 7 characters long
//        -> Print: "Valid 7 digit account number"
//        Otherwise: "Invalid 7 digit account number"
//                - If the account number begins with a “5” the account number should be 10 characters long
//        -> Print: "Valid 5 digit account number"
//        Otherwise: "Invalid 5 digit account number"
//    — If the account number does not begin with a 2 or a 5
//        -> Print "Invalid account number"

        String accountNumber = "234567";
        if (accountNumber.startsWith("2")) {
            if (accountNumber.length() == 7) {
                System.out.println("Valid 7 digit account number");
            } else {
                System.out.println("Not a valid 7 digit account number");
            }
        } else if (accountNumber.startsWith("5")) {
            if (accountNumber.length() == 10) {
                System.out.println("Valid 10 digit account number");
            } else {
                System.out.println("Not valid 10 digit account number");
            }
        } else {
            System.out.println("Not valid account number");
        }
    }
}
