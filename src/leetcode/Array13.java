package leetcode;

import java.util.HashSet;
import java.util.Set;

//128. 最长连续序列
public class Array13 {
	public int longestConsecutive(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int num : nums) {
			set.add(num);
		}
		int longestStreak = 0;
		for (int num : nums) {
			if(!set.contains(num-1)) {
				int currentStreak =1;
				int currentNum = num;
				while(set.contains(currentNum+1)) {
					currentNum+=1;
					currentStreak+=1;
				}
				longestStreak = Math.max(currentStreak, longestStreak);
			}
		}
		return longestStreak;
	}

}
