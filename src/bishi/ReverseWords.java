package bishi;


public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(reverseWords("a good   example"));
	}
	static String reverseWords(String s) {
		
		String[] arr = s.trim().split("\\s+");
        return String.join(" ", s.trim());
    }
}
