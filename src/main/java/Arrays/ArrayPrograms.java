package Arrays;

public class ArrayPrograms {

    // Finds the maximum number in an array.
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Finds the minimum number in an array
    public static int findMin() {
        int[] temperatures = {32, 30, 27, 28, 35, 26, 29};
        int min = 0;
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < temperatures[i - 1]) {
                min = temperatures[i];
            }
        }
        return min;
    }

    // Reverse an array(only vowels)
    public static void reverseArray() {
        char[] input = {'L', 'e', 'e', 't', 'C', 'o', 'd', 'e'};
        int start = 0;
        int end = input.length - 1;
        while (start < end) {
            if (!isVowel(input[start])) {
                start++;
            } else if (!isVowel(input[end])) {
                end--;
            } else {
                char temp = input[start];
                input[start] = input[end];
                input[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }


    // Sort an array
    public static void sortArray() {
        int[] arr = {4, 5, 1, 765, 743, 3, 7, 3, 8, 9, 290, 45};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int obj : arr) {
            System.out.println(obj);
        }
    }

    // Search element in the array.
    public static boolean searchElement(int[] arr, int key) {
        for (int ele : arr) {
            if (ele == key) {
                return true;
            }
        }
        return false;
    }

    // Find the second-largest element in the array.
    public static int findSecondMax() {
        int[] balance = {5000, 8000, 7500, 8000, 6000};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int ele : balance) {
            if (ele > max) {
                secondMax = max;
                max = ele;
            } else if (ele > secondMax && ele != max) {
                secondMax = ele;
            }
        }
        if (secondMax == Integer.MAX_VALUE) {
            return -1;
        }
        return secondMax;
    }

    //Removes duplicate values from an array and returns a new array with only unique elements.
    public static void removeDuplicates(){

    }
}
