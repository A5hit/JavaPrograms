package String;

import java.util.HashMap;
import java.util.Map;

public class FindAangram {

    public static void main(String[] args){

        String str1 = "";
        String str2 = "";
        System.out.println(isAnagram(str1,str2));

    }

    public static boolean isAnagram(String s1 , String s2){
        s1 = s1.replaceAll("[^A-Za-z]","").toLowerCase();
        s2 = s2.replaceAll("[^A-Za-z]","").toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }

        Map<Character,Integer> countMap = new HashMap<>();

        for(char c : s1.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }

        for (char c : s2.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)-1);
            if(countMap.get(c)<0); return false;
        }

        return true;
    }

}










