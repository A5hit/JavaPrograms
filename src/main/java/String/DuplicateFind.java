package String;

import java.util.HashMap;
import java.util.Map;

;

public class DuplicateFind {

    public static void main(String[] args) {
        String str = "My Name is Ashit Singh";
        duplicateFinder(str);

    }

    public static void duplicateFinder(String str) {

        str = str.replaceAll("[^A-Za-z]", "").toLowerCase();

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }


    }
}






