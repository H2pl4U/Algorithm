package leetcode;

//198Ç¿µÁÇÀ½Ù
public class DTGH02 {
	public int rob(int[] nums) {
	    int pre2 = 0, pre1 = 0;
	    for (int i = 0; i < nums.length; i++) {
	        int cur = Math.max(pre2 + nums[i], pre1);
	        pre2 = pre1;
	        pre1 = cur;
	    }
	    return pre1;
	}
}
