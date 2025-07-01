package Java14DaysGrind;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {

    public static void main(String[] args) throws Exception {

        List<String> listStr = new ArrayList<>();
        listStr.add("I love automation testing");
        listStr.add("Java Selenium RestAssured");
        listStr.add("OpenAI ChatGPT");

        for (String str : listStr) {
            System.out.println("Orginal String : " + str + " || Reverse String : " + ReverseString(str));
        }
    }

    public static String ReverseString(String str) {
        String[] words = str.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (int i = words.length-1; i>=0; i--) {
            reverse.append(words[i]);
            if (i != 0) {
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
}
