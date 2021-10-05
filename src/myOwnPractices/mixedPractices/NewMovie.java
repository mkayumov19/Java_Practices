package myOwnPractices.mixedPractices;

public class NewMovie {

    public static void main(String[] args) {

        String name = "I am Legend", genre = "Horror, Thriller, Adventure, Science-Fiction", rating = "PG13";
        double duration = 1.44, rottenTomatoes = 68.0, releaseDate = 12.14;
        int releaseYear =2007;
        boolean sequels = true, isOnDvd = false;

        System.out.println("Welcome to IMAX Cinema");
        System.out.println("Tonight we are streaming: \""+name+"\" which was released on: "+releaseDate+"."+releaseYear);
        System.out.println("This \""+genre+"\" movie got a %"+rottenTomatoes+" rating on RottenTomatoes.");
        System.out.println("The rating is "+rating+" and it runs for "+duration+" hours");
        System.out.println("This is a sequel: "+sequels+" and is on dvd: "+isOnDvd+".");

    }

}
