package OfficeHours.Practice_03_22;
import  java.util.Scanner;
public class longestContainingLetter {
    public static void main(String[] args) {
        String word1, word2, word3;
        word1 = "java";
        word2 = "mouse";
        word3 = "computer";
        int word1Length, word2Length, word3Length, i=0, j=0 , l=0;
        word1Length = word1.length();
        word2Length = word2.length();
        word3Length = word3.length();
         if (word1.contains("u"))   {
            i = (word1Length);
        }if  (word2.contains("u"))   {
            j = (word2Length);
        }if (word3.contains("u"))   {
            l = (word3Length);
        }
        if (i > j && i > l) {
            System.out.println(word1);
        } if (j > i && j >l) {
            System.out.println(word2);
        } if (l > i && l > j) {
            System.out.println(word3);
        }
    }
}
