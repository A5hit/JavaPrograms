package Arrays;

public class FindMinNum {

    public static void main(String[] args){
        int[] sampleArray2 = {3, 5, 7, 2, 8};
        int min = findMin(sampleArray2);
        System.out.println("This is the min number of the array :"+min);
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
