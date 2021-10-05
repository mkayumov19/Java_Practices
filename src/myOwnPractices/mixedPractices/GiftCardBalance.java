package myOwnPractices.mixedPractices;
import java.util.Scanner;
public class GiftCardBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter product name: ");
        String product = scan.next();
        int cardBalance = 100;
        int leftOverBalance = 0;
        int price = 0;

        if (product.equals("Blanket")){
            price = 60;{
                if (price <= cardBalance){
                    leftOverBalance = cardBalance - price;
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+leftOverBalance+"$");
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
            }
        } else if (product.equals("Charger")){
            price = 25;{
                if (price <= cardBalance){
                    leftOverBalance = cardBalance - price;
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+leftOverBalance+"$");
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
            }

        }else if(product.equals("Hat")){
            price = 25;{
                if (price <= cardBalance){
                    leftOverBalance = cardBalance - price;
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+leftOverBalance+"$");
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
            }

        }else if(product.equals("Headphones")){
            price = 30;{
                if (price <= cardBalance){
                    leftOverBalance = cardBalance - price;
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+leftOverBalance+"$");
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
            }

        }else if (product.equals("Laptop")){
            price = 200;{
                if (price <= cardBalance){
                    leftOverBalance = cardBalance - price;
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+leftOverBalance+"$");
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
            }

        }else if(product.equals("Pants")){
            price = 50;{
                if (price <= cardBalance){
                    leftOverBalance = cardBalance - price;
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+leftOverBalance+"$");
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
            }

        }else if(product.equals("Pillow")){
            price = 40;{
                if (price <= cardBalance){
                    leftOverBalance = cardBalance - price;
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+leftOverBalance+"$");
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
            }

        }else if(product.equals("Smartphone")){
            price = 1000;{
                if (price <= cardBalance){
                    leftOverBalance = cardBalance - price;
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+leftOverBalance+"$");
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
            }

        }else if(product.equals("Socks")){
            price = 5;{
                if (price <= cardBalance){
                    leftOverBalance = cardBalance - price;
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+leftOverBalance+"$");
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
            }

        }else if(product.equals("USB cable")){
            price = 10;{
                if (price <= cardBalance){
                    leftOverBalance = cardBalance - price;
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+leftOverBalance+"$");
                }else{
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
            }

        }else {
            System.out.println("Invalid item!");
        }
    }
}
