package Arrays;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int t = 0;
        {
            for (int i = 0; i < n; i++) {
                boolean isDuplicates = false;
                for (int k = 0; k < t; k++) {
                    if (arr[i] == temp[k]) {
                        isDuplicates = true;
                        break;
                    }
                }
                if (!isDuplicates) {
                    temp[t++] = arr[i];
                }
            }
        }
        int[] cleanArr = new int[t];
        System.arraycopy(temp,0,cleanArr,0,t);
        return cleanArr;
    }

    public static void main(String[] args){
        int[] inputArray = {1,2,2,3,4,4,5};
        int[] result = removeDuplicates(inputArray);
        System.out.println("Array after removing duplicates : ");
        for(int num : result){
            System.out.println(num);
        }
    }
}
