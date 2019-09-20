package bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 五八同城笔试编程1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int res = func(str);
		System.out.println(res);
	}

	private static int func(String str) {
		String[] split = str.split(",");
		List<String> list = new ArrayList<>();
		for (int i = 0; i < split.length; i++) {
			if(!list.contains(split[i])) {
				list.add(split[i]);
			}
		}
		return list.size();
	}

}
