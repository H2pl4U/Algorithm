package bytedancing;

public class CheckInclusion {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "ooolleoolleh";
		System.out.println(checkInclusion(s1, s2));
	}

	static boolean checkInclusion(String s1, String s2) {
		String ss=s2;
		int[] arr = new int[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (String.valueOf(s1.charAt(i)).equals(String.valueOf(s2.charAt(j)))) {
					System.out.println(j);
					arr[i] = j;
					if (j == 0) {
						s2 = "A" + s2.substring(j);
					} else if (j == s2.length() - 1) {
						s2 = s2.substring(0, j - 1) + "A";
					} else {
						s2 = s2.substring(0, j) + "A" + s2.substring(j+1);
					}
					System.out.println(s2);
				}
			}
			s2=ss;
		}
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(s2.substring(arr[0]+1));
		if (IsIncrease(arr, arr.length)) {
			return true;
		} 
		if (s1.length() > s2.substring(arr[0]+1).length()) {
			checkInclusion(s1, s2.substring(arr[0]+1));
		} else {
			return false;
		}
		return false;
	}

	static boolean IsIncrease(int array[], int n) {
		int i, differ;
		differ = array[1] - array[0];
		for (i = 1; i < n - 1; i++) {
			if (differ != array[i + 1] - array[i])
				return false;
		}
		return true;
	}

	static void bubbleSort(int[] array) {
		int tmp = 0;
		for (int i = 0; i < array.length - 1; i++) {// ÌËÊý
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}

	}

}
