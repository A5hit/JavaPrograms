package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] inputArray = {10, 20, 4, 45, 99};
        int secondMaxNumber = secondLarge(inputArray);
        System.out.println("The second biggest integer of the array is :" + secondMaxNumber);
    }

    public static int secondLarge(int[] arr) {
        int min = Integer.MIN_VALUE;
        int secondMin = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > min) {
                secondMin = min;
                min = n;
            } else if (n > secondMin && n != min) {
                secondMin = n;
            }
        }
        return secondMin;
    }
}
