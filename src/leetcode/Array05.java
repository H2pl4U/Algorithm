package leetcode;

public class Array05 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2};
		System.out.println(singleNumber(nums));
	}
	public static int singleNumber(int[] nums) {
		int num=0;
		for(int i=0;i<nums.length-1;i++) {
			num=nums[i];
			for(int j=i+1;j<nums.length;j++) {
				if(num==nums[j]) {
					break;
				}else {
					
				}
			}
		}
        return num;
    }

}
