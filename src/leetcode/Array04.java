package leetcode;

public class Array04 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,1};
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        for(int i=0;i<nums.length-1;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]==nums[j]) {
        			flag=true;
        			i=nums.length;
        			break;
        		}
        	}
        }
        return flag;
    }

}
