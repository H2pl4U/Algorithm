package leetcode;

public class String07 {

	public static void main(String[] args) {
		String haystack = "mississippi";
		String needle = "pi";
		System.out.println(haystack.equals(needle));
		System.out.println(strStr(haystack, needle));
	}
	static int strStr(String haystack, String needle) {
		if(needle.equals("")||haystack.equals(needle)) {
			return 0;
		}
		if(haystack.contains(needle)) {
			for (int i = 0; i <= haystack.length()-needle.length(); i++) {
				if(haystack.substring(i, i+needle.length()).equals(needle)) {
					return i;
				}
			}
		}
		return -1;
    }

}
