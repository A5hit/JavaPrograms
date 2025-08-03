package Java14DaysGrind;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagram {

    public static void main(String[] args) {
        String wrd1 = "Clint Eastwood";
        String wrd2 = "Old West Action";
    }

    public static boolean areAnagram(String wrd1, String wrd2) {
        String str1 = wrd1.replaceAll("\\s", "").toLowerCase();
        String str2 = wrd2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> freq1 = frequencyBuilder(str1);
        Map<Character, Integer> freq2 = frequencyBuilder(str2);

        return  freq1.equals(freq2);
    }

    public static Map<Character, Integer> frequencyBuilder(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
