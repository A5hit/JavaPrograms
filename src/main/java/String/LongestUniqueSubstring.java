package String;

import java.util.HashMap;
import java.util.HashSet;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
    }

    public static String lengthOfLongestSubstring(String str) {
        int left = 0;
        int maxLenth = 0;
        int start = 0;

        HashSet<Character> window = new HashSet<>();

        for (int right = 0; right<str.length(); right++) {
            char c = str.charAt(right);

            while (window.contains(c)) {
                window.remove(str.charAt(left));
                left++;
            }

            window.add(c);

            if(right-left+1>maxLenth){
                maxLenth = right-left+1;
                start = left;
            }
        }
        return str.substring(start,start+maxLenth);
    }

}
