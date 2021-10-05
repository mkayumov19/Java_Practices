package JavaBasics.day_34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("Starting Etsy Smoke test");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
    }
    public static void openBrowser(){
        System.out.println("Launch Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigate to: https://www.etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("In search bar type \"Wooden spoon\" and press enter");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("Scroll down the page and check if all results include wooden spoon");
    }

}
