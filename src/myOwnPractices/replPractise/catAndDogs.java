package myOwnPractices.replPractise;

public class catAndDogs {
    public static void main(String[] args) {

        int countOfCats = 0;
        int countOfDogs = 0;
        String word = ("catcat");
        String cat = "";
        String dog = "";

        while(word.contains("cat") || word.contains("dog")){
            if(word.contains("cat")){
                countOfCats++;
                word = word.replaceFirst("cat","");
            }
            if(word.contains("dog")){
                countOfDogs++;
                word = word.replaceFirst("dog","");
            }
        }
            if(countOfCats == countOfDogs){
                System.out.println(true);
            }else if(countOfCats != countOfDogs){
                System.out.println(false);
        }
    }
}