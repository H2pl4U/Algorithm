package leetcode;
public class Demo01 {

	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(fun(s));
	}

	public static int fun(String s) {
		if (s.equals("") || s == null) {
			return 0;
		} else {
			int[] sum = new int[s.length()];
			String ss = "";
			for (int j = 0; j < s.length(); j++) {
				ss = String.valueOf(s.charAt(j));
				for (int i = j+1; i < s.length(); i++) {
					if (!ss.contains(String.valueOf(s.charAt(i)))) {
						ss += String.valueOf(s.charAt(i));
					} else {
						break;
					}
				}
				sum[j] = ss.length();
				ss = "";
			}
			int max = 0;
			for (int i = 0; i < sum.length; i++) {
				System.out.println(sum[i]);
				if (max < sum[i]) {
					max = sum[i];
				}
			}
			return max;
		}

	}
}
