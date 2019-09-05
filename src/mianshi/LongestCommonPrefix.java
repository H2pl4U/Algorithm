package mianshi;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "floight","flwww"};
//		System.out.println(String.valueOf(strs[0].charAt(0)).equals(String.valueOf(strs[1].charAt(0))));
//		System.out.println(String.valueOf(strs[0].charAt(0)).equals(String.valueOf(strs[1].charAt(0)))
//				&& String.valueOf(strs[0].charAt(0)).equals(String.valueOf(strs[2].charAt(0))));
		System.out.println(longestCommonPrefix(strs));

	}

	static String longestCommonPrefix(String[] strs) {
		if (strs.length != 0) {
			String c = "";
			int min = strs[0].length();
			for (int i = 0; i < strs.length; i++) {
				if (min > strs[i].length()) {
					min = strs[i].length();
				}
			}
			for (int i = 0; i < min; i++) {
				String s=String.valueOf(strs[0].charAt(i));
				for (int j = 0; j < strs.length; j++) {
					if (!s.equals(String.valueOf(strs[j].charAt(i)))) {
						return c;
					}
				}
				c+=String.valueOf(strs[0].charAt(i));
			}
			System.out.println(c);
			return c;
		} else {
			return "";
		}

	}

}
