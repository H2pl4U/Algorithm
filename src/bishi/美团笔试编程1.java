package bishi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ���ű��Ա��1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		List<String> list = new ArrayList<String>();
		int n =0;
		while (n<4) {
			str = sc.nextLine();
			if (str.equals("") || str == null)
				break;
			list.add(str);
			n++;
		}
		String[] strs = new String[list.size()];
		for (int i = 0; i < strs.length; i++) {
			strs[i] = list.get(i);
		}
		System.out.println(strs[strs.length - 1]);
		String[] res = func(strs);
		for (String string : res) {
			System.out.println(string);
		}

	}

	// Ҽ���������������顢½���⡢�ơ�����ʰ���ۡ�Ǫ�����ڡ�Ԫ���ǡ��֡��㡢����
	private static String[] func(String[] strs) {
		String[] result = new String[strs.length];
		Map<Character, String> map1 = new HashMap<Character, String>();
		map1.put('0', "��");
		map1.put('1', "Ҽ");
		map1.put('2', "��");
		map1.put('3', "��");
		map1.put('4', "��");
		map1.put('5', "��");
		map1.put('6', "½");
		map1.put('7', "��");
		map1.put('8', "��");
		map1.put('9', "��");
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "");
		map2.put(2, "ʰ");
		map2.put(3, "��");
		map2.put(4, "Ǫ");
		map2.put(5, "��");
		map2.put(6, "ʰ");
		map2.put(7, "��");
		map2.put(8, "Ǫ");
		map2.put(9, "��");
		map2.put(10, "ʰ");
		map2.put(11, "��");
		map2.put(12, "Ǫ");
		for (int i = 0; i < strs.length; i++) {
			String ss = "";
			String str = strs[i];
			if (str.contains(".")) {
				if (str.substring(str.length() - 3).equals(".00")) {
					ss = "��";

				} else {
					if (str.charAt(str.length() - 2) != '0')
						ss = ss + map1.get(str.charAt(str.length() - 2)) + "��";
					if (str.charAt(str.length() - 1) != '0')
						ss = ss + map1.get(str.charAt(str.length() - 1)) + "��";
				}
				str = str.substring(0, str.length() - 3);
			} else
				ss = "��";
			String s = "";
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '0') {
					if (str.charAt(j - 1) != '0')
						s += "��";
				} else
					s += map1.get(str.charAt(j)) + map2.get(str.length() - j);
			}
			ss = s + "Ԫ"+ ss;
			result[i] = ss;
		}
		return result;
	}
	
	


}
