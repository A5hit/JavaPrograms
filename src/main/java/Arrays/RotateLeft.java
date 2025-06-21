package Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array :");
        for (int n : inputArray) {
            System.out.println(n);
        }
        System.out.println("-----------------------------------------");
        leftRotation(inputArray);
        System.out.println("Array after first left rotation: ");
        for(int n : inputArray){
            System.out.println(n);
        }
    }

    public static void leftRotation(int[] arr) {
        int first = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
    }
}