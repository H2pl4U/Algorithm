package leetcode;

import java.util.ArrayList;

public class Array09 {

	public static void main(String[] args) {
		int[] nums = {0,1,0,5,3,0,5,0};
		moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
   static void moveZeroes(int[] nums) {
	   ArrayList<Integer> list = new ArrayList<Integer>();
	   int sum=0;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) {
				sum++;
			}else {
				list.add(nums[i]);
			}
		}
        for (int i = 0; i <sum; i++) {
			list.add(0);
		}
        for (int i = 0; i < nums.length; i++) {
			nums[i]=list.get(i);
		}
    }

}
