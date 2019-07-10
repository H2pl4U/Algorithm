package leetcode;

public class Array12 {

	public static void main(String[] args) {
		int[][] arr = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		rotate(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void rotate(int[][] matrix) {
		int[] re=new int[matrix.length*matrix.length];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                re[i*matrix.length+j]=matrix[matrix.length-1-j][i];
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                matrix[i][j]=re[i*matrix.length+j];
            }
        }
    }

}
