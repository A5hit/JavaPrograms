package Arrays;

public class SortArray {
    public static void main(String[] args){
        int[] inputArray = {12,5432,13,42535,54,432,34,5,};
        sortArray(inputArray);
        for(int n : inputArray){
            System.out.println(n);
        }
    }

    public static void sortArray(int[] arr){
        for(int i = 0;i< arr.length;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
