package lab3;

public class Main {
    public static void main(String[] args) {
        int lengthOfWord = 3; //length of word to replace
        String replaceString = "Joseph";
        StringBuilder stringBuilder = new StringBuilder("The most powerful man, in the world and USA!");


        String myRegexp = String.format("\\b\\w{%d}\\b", lengthOfWord);
        String newString = stringBuilder.toString().replaceAll(myRegexp, replaceString);
        System.out.println(newString);
    }
}
