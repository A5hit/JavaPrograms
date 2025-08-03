package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagram {

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc")); // [0, 6]
        System.out.println(findAnagrams("abab", "ab"));        // [0, 1, 2]
    }

    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> result = new ArrayList<>();
        if(s.length()<p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for(char c: p.toCharArray()){
            pCount[c-'a']++;
        }

        int windowSize = p.length();

        for(int i=0;i<s.length();i++){
            sCount[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(sCount,pCount))  result.add(0);

        for(int i = windowSize;i<s.length();i++){
            sCount[s.charAt(i-'a')]++;
            sCount[s.charAt(i-windowSize)-'a']--;

            if(Arrays.equals(pCount,sCount)){
                result.add(i-windowSize+1);
            }
        }


        return result;
    }
}
