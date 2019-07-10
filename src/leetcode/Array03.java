package leetcode;

public class Array03 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		rotate(nums, 3);
		
	}
	public static void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
        	int tmp=nums[nums.length-1];
            for(int j=nums.length-2;j>=0;j--){
                nums[j+1]=nums[j];
            }
            nums[0]=tmp;
        }
        for(int j=0;j<nums.length;j++){
            System.out.print(nums[j]);
        }
    }
}
