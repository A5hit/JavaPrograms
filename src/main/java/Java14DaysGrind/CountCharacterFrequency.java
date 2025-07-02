package Java14DaysGrind;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterFrequency {

    public static void main(String[] args) {
        String str1 = "Selenium WebDriver";
        String str2 = "Java Programming";
        String str3 = "OpenAI ChatGPT";
        System.out.println("Number of char occurence in " + str1 + " is :" + countCharFrequency(str1));
        System.out.println("Number of char occurence in " + str2 + " is :" + countCharFrequency(str2));
        System.out.println("Number of char occurence in " + str3 + " is :" + countCharFrequency(str3));
    }

    public static Map<Character, Integer> countCharFrequency(String input) {
        char[] chars = input.replace(" ", "").toLowerCase().toCharArray();
        HashMap<Character, Integer> charFreq = new HashMap<>();
        int count = 0;
        for (char a : chars) {
            charFreq.put(a, charFreq.getOrDefault(a, 0) + 1);
        }
        return charFreq;
    }

}
