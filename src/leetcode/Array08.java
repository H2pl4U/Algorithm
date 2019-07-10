package leetcode;

import java.util.ArrayList;

public class Array08 {

	public static void main(String[] args) {
		int[] n= {-2147483648,1,2,3};
		int[] m = {1,-2147483648,-2147483648};
		int[] res = intersect(n,m);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
	}
	static int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i]==nums2[j]) {
					arr.add(nums1[i]);
					nums2[j]=-1000000;
					break;
				}
			}
		}
		for (Integer i : arr) {
			System.out.println(i);
		}
		int[] res = new int[arr.size()];
		for (int i = 0; i < res.length; i++) {
			res[i]=arr.get(i);
		}
		return res;
    }
}
