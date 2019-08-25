package test;

/*
 * µİÔöÅĞ¶Ï
 * 
 */
public class Test {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(fun(arr, arr.length));
	}

	static boolean fun(int array[], int n){
		int i, differ;
		differ = array[1] - array[0];
		for (i = 1; i < n - 1; i++) {
			if (differ != array[i + 1] - array[i])
				return false;
		}
		return true;
	}

}
