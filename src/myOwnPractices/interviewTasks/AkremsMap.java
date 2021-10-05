package myOwnPractices.interviewTasks;

import java.util.*;
import java.util.stream.Collectors;

public class AkremsMap {

    /**    Task :
    //  - From a given String, find out all the vowels, consonants and empty space and print their counts
    //  - Store the vowels and consonants into a HashMap<AlphabetType,List>
    //  - Finally from the individual Lists, get the duplicated alphabets occurrence count for both vowels and consonants
    //  - Capitalization of alphabets shouldn't matter for any of the solutions
    //  - String testData = "How many vowels in this String "
    //  - Use enum.
    */

    public static void main(String[] args) {
        System.out.println("Result = " + hello("Air and cosmic Space Shuttle"));

    }

    public static Map<alphabets, List<String>> hello(String str){
        Map<alphabets, List<String>> answer = new LinkedHashMap<>();
        List<String> vowels = new ArrayList<>(Arrays.asList("a","e","i","o","u"));
        str = str.toLowerCase();
        StringBuilder temp = new StringBuilder();
        int sumVowels = 0;
        int consonantsVowels = 0;
        answer.put(alphabets.vowels,(Arrays.stream(str.split("")).filter(vowels::contains).collect(Collectors.toList())));
        answer.put(alphabets.space,(Arrays.stream(str.split("")).filter(p->p.equals(" ")).collect(Collectors.toList())));
        answer.put(alphabets.consonants,(Arrays.stream(str.split("")).filter(p-> !p.equals(" ") && !vowels.contains(p)).collect(Collectors.toList())));
        for (String each : answer.get(alphabets.vowels)) {
            if(Collections.frequency(answer.get(alphabets.vowels),each) > 1 && !temp.toString().contains(each)) {
                sumVowels += Collections.frequency(answer.get(alphabets.vowels), each);
                temp.append(each);
            }
        }
        for (String each : answer.get(alphabets.consonants) ) {
            if(Collections.frequency(answer.get(alphabets.consonants),each) > 1 && !temp.toString().contains(each)) {
                consonantsVowels += Collections.frequency(answer.get(alphabets.consonants), each);
                temp.append(each);
            }
        }
        System.out.println("vowels = " + sumVowels);
        System.out.println("Consonants = " + consonantsVowels);
        return answer;

    }
    enum alphabets{
        consonants,
        space,
        vowels
    }
}
