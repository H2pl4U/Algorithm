package bishi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 求两个数组中第二大的值，没有返回-1
 * ac
 */
public class CVTE0905Test2 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(100);
		list1.add(90);
		list1.add(90);
		list1.add(100);
		list2.add(100);
		list2.add(90);
		list2.add(90);
		list2.add(100);
		int a = getNumberTwo(list1, list2);
		System.out.println(a);
	}

	private static int getNumberTwo(List<Integer> list1, List<Integer> list2) {
		list1.addAll(list2);
		Collections.sort(list1);
		if (list1.size() <= 1)
			return -1;
		int res = list1.get(list1.size() - 1);
		for (int i = list1.size() - 2; i >= 0; i--) {
			if (res > list1.get(i)) {
				res = list1.get(i);
				break;
			}
		}
		if (res == list1.get(list1.size() - 1))
			return -1;
		return res;
	}

}
