package Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] intputArr = {1, 2, 3, 4, 5};
        System.out.println("Orginal Array : ");
        for (int n : intputArr) {
            System.out.println(n);
        }
        System.out.println("-------------------------------------------");
        reversedArray(intputArr);
        System.out.println("Reversed array is : ");
        for (int n : intputArr) {
            System.out.println(n);
        }
    }

    public static void reversedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
