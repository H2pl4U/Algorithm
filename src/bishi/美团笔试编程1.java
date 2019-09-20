package bishi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ÃÀÍÅ±ÊÊÔ±à³Ì1 {

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

	// Ò¼¡¢·¡¡¢Èş¡¢ËÁ¡¢Îé¡¢Â½¡¢Æâ¡¢°Æ¡¢¾Á¡¢Ê°¡¢°Û¡¢Çª¡¢Íò¡¢ÒÚ¡¢Ôª¡¢½Ç¡¢·Ö¡¢Áã¡¢Õû£»
	private static String[] func(String[] strs) {
		String[] result = new String[strs.length];
		Map<Character, String> map1 = new HashMap<Character, String>();
		map1.put('0', "Áã");
		map1.put('1', "Ò¼");
		map1.put('2', "·¡");
		map1.put('3', "Èş");
		map1.put('4', "ËÁ");
		map1.put('5', "Îé");
		map1.put('6', "Â½");
		map1.put('7', "Æâ");
		map1.put('8', "°Æ");
		map1.put('9', "¾Á");
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "");
		map2.put(2, "Ê°");
		map2.put(3, "°Û");
		map2.put(4, "Çª");
		map2.put(5, "Íò");
		map2.put(6, "Ê°");
		map2.put(7, "°Û");
		map2.put(8, "Çª");
		map2.put(9, "ÒÚ");
		map2.put(10, "Ê°");
		map2.put(11, "°Û");
		map2.put(12, "Çª");
		for (int i = 0; i < strs.length; i++) {
			String ss = "";
			String str = strs[i];
			if (str.contains(".")) {
				if (str.substring(str.length() - 3).equals(".00")) {
					ss = "Õû";

				} else {
					if (str.charAt(str.length() - 2) != '0')
						ss = ss + map1.get(str.charAt(str.length() - 2)) + "½Ç";
					if (str.charAt(str.length() - 1) != '0')
						ss = ss + map1.get(str.charAt(str.length() - 1)) + "·Ö";
				}
				str = str.substring(0, str.length() - 3);
			} else
				ss = "Õû";
			String s = "";
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '0') {
					if (str.charAt(j - 1) != '0')
						s += "Áã";
				} else
					s += map1.get(str.charAt(j)) + map2.get(str.length() - j);
			}
			ss = s + "Ôª"+ ss;
			result[i] = ss;
		}
		return result;
	}
	
	


}
