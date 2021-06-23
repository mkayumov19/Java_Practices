package MyOwnPractices.quiz_examples;

import java.util.ArrayList;

public class Unit4Quiz {

   static int count;
   public Unit4Quiz(){
       count++;

   }
   public Unit4Quiz(int i){
       count +=i;

   }
   public Unit4Quiz(String s){
       count += s.length();
   }

}
