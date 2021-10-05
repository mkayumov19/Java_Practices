package JavaBasics.day_04_Variables_Intro;

public class VariableNamingRules {

    public static void main(String[] args) {

//    int public = 10;           --------------> ERROR, public is reserved by Java
      int publicRelationsRoom = 10;
      int fifeFeetFish = 10;

      int static2 = 22;
      int _static = 22;
      int $tatic = 44;
      int staticVar = 55;

      int salary$ = 66;
//    int 1stMonthSalary = 4000;  -----> Error, can not start with number
      int num1 = 20;              //------------> works fine

      int $ = 7;
      int _= 8;
        System.out.println($);
        System.out.println(_);
//       Above variables work fine but not recommended
//       We should use meaningful variable names
//       int number-of-friends = 90;   --------------> ERROR. illegal sign
      int numberOfFriends = 90;    //----------------> Good
      int number_of_friends = 90;  //----------------> works but not conventional

    System.out.println(static2);


    }

}
