package leetcode;

public class Array01 {

	public static int removeDuplicates(int[] nums) {

	        if(nums==null||nums.length==0) {
	            return 0;
	        }
	        int k = 1;
	        for(int i=1 ; i<nums.length; i++) {
	            if(nums[i]==nums[i-1]) {
	                continue;
	            }else {
	                nums[k++]=nums[i];
	            }
	        }
	        return k;
	}
		
}
