package leetcode;

import java.util.ArrayList;

public class Array10 {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 5,4};
		int[] res = twoSum(nums, 9);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
	static int[] twoSum(int[] nums, int target) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					list.add(i);
					list.add(j);
					  int[] arr = new int[list.size()];
				        for (int k = 0; k < arr.length; k++) {
							arr[k]=list.get(k);
						}
				        return arr;
				}
			}
		}
        return null;
      
    }

}
