package myOwnPractices.replPractise;

public class JavaPython {
    public static void main(String[] args) {
        String sentence = "java, javascript, python, c#, c++, rust, ruby python, swift";
        int countJava = 0;
        int countPython = 0;
        for(int i = 0; i < sentence.length(); i++){
        if(sentence.contains("java")) {
            sentence = sentence.replaceFirst("java", "");
            countJava++;
        }
        if(sentence.substring(i).contains("python")){
            sentence = sentence.replaceFirst("python","");
            countPython++;
          }
        }
            if(countJava == countPython){
                System.out.println(true);
            }else{
                System.out.println(false);
        }
    }
}
