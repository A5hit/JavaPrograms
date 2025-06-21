package Arrays;

import java.util.SequencedSet;

public class SearchElements {
    public static void main(String[] args){
        int[] inputArray = {1, 2, 3, 4, 5};
        int key = 3;
        boolean found = searchElements(inputArray,key);
        System.out.println("Element " + key + (found ? " is found." : " is not found."));
    }

    public static boolean searchElements(int[] arr , int key){
        for(int n : arr){
            if(n==key){
                return true;
            }
        }
        return false;
    }
}
