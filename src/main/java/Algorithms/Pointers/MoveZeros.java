// https://leetcode.com/problems/move-zeroes/description/

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

 */

package Algorithms.Pointers;

public class MoveZeros {

    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);

        for(int num : nums){
            System.out.println("Num : "+num);
        }

    }

    public static void moveZeros(int[] nums){
        int lastNonZeroIndex = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        for(int i = lastNonZeroIndex;i<nums.length;i++){
            nums[i] = 0 ;
        }
    }
}
