package JavaBasics.day_05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = num1;
        System.out.println(num2+"\n+");
        int abc = 777;
        int abv = abc;
        System.out.println(abv+"\n=");
        System.out.println(+abv+num2);

        int n1 = 55;
        int n2 = n1;
        int n3 = n2+n1;
        System.out.println(n3);

        int singleMan = 1;
        int singleWoman = 1;
        int expectedResult = 1;
        int marriedCouple = singleMan+singleWoman;
        System.out.println(marriedCouple+expectedResult);

        int inthirasZipCode = 22182;
        int parvinsZipCode = inthirasZipCode;
        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipCode);

        inthirasZipCode = 20007;
        parvinsZipCode = 33626;
        System.out.println(inthirasZipCode+"\n"+parvinsZipCode);


    }
}
