package bishi;

import java.util.Scanner;

public class 三六零笔试编程2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		int res = angleEnable(nums);
		System.out.println(res);
		in.close();
	}
		 
		 
	public static int angleEnable(int[] nums) {
		//如果边长＜2，肯定不能实现
		if (nums == null || nums.length <= 2) return -1;
		//条件： n-1边的和大于最长边，就能组成封闭多边形
		         
		int sum = 0; //前N个数之和
		int max = 0;//前N个树中的最大值
		for (int i = 0; i < nums.length ; i++) {
			sum += nums[i];
			max = max > nums[i] ? max : nums[i];
			//如果i > 1（如果不大于1，说明只有2条边，无论如何都构成不了的）
			//并且sum - max > max，即前N个中不含Max的值之和大于Max，说明找到了，直接返回
			//这个注意 + 1 ，因为i从0开始
			if (i > 1 && sum > 2 * max) return i + 1;
		}
		//遍历完所有都不存在则说明不存在
		return -1;
	}
		 
}

