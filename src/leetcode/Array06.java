package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Array06 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4 };
		int[] nums2 = { 5, 6 };
		fun(nums1, nums2);
	}

	private static void fun(int[] nums1, int[] nums2) {
		ArrayList<Integer> rs = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			l1.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			l2.add(nums2[i]);
		}
		for (Integer i : l1) {
			for (Integer j : l2) {
				System.out.println(i);
				System.out.println(j);
//				if (i == j) {
//					l1.remove(i);
//					l2.remove(j);
//					rs.add(i);
//				}
			}
		}
		for (Integer e : rs) {
			System.out.println(e);
		}
	}

}
