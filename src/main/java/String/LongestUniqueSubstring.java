package String;

import java.util.HashMap;
import java.util.HashSet;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        String inputStr = "abcabcbb";
        String outputStr = findLongestUniqueSubstring(inputStr);
        System.out.println("This is the Longest Unique Substring :"+outputStr);
    }

    public static String findLongestUniqueSubstring(String str) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int startOfMax = 0;

        HashSet<Character> seen = new HashSet<>();

        while (right<str.length()){
            char currentChar = str.charAt(right);
            if(!seen.contains(currentChar)){
                seen.add(currentChar);
                if(right-left+1>maxLength){
                    maxLength = right-left+1;
                    startOfMax = left;
                }
                right++;
            }
            else {
                seen.remove(str.charAt(left));
                left++;
            }
        }
        return str.substring(startOfMax,startOfMax+maxLength);
        
    }

}
