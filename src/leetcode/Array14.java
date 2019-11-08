package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 15.三数之和
 */
public class Array14 {

	// 暴力解法 O(n^3) 超时
	public List<List<Integer>> threeSum1(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[k] + nums[j] + nums[i] == 0) {
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						if (!result.contains(list)) {
							result.add(list);
						}
						list = new ArrayList<Integer>();
					}
				}
			}
		}
		return result;
	}

	// 双指针解法 O(n^2) ac
	public List<List<Integer>> threeSum2(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int k = 0; k < nums.length - 2; k++) {
			if (nums[k] > 0)
				break;
			if (k > 0 && nums[k] == nums[k - 1])
				continue;
			int i = k + 1, j = nums.length - 1;
			while (i < j) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum < 0) {
					while (i < j && nums[i] == nums[++i]);
				} else if (sum > 0) {
					while (i < j && nums[j] == nums[--j]);
				} else {
					result.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
					while (i < j && nums[i] == nums[++i]);
					while (i < j && nums[j] == nums[--j]);
				}
			}
		}
		return result;
	}
}
