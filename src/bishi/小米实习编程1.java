package bishi;

import java.util.Scanner;

public class 小米实习编程1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		String str = func(arr);
		System.out.println(str);
		scan.close();
	}

	private static String func(int[][] arr) {
		String str = "";
		int row = arr.length;
		int col = arr[0].length;
		if (row == 0 || col == 0)
			return null;
		//各个边界的初始值
		int left = 0, top = 0, bottom = row - 1, right = col - 1;
		while (left <= right && bottom >= top) {
			// 从左到右横向
			for (int i = left; i <= right; i++) {
				str += arr[top][i] + " ";
			}
			// 从上到下纵向
			for (int i = top + 1; i <= bottom; i++) {
				str += arr[i][right] + " ";
			}
			// 从右到左横向
			if (top != bottom)
				for (int i = right - 1; i >= left; i--) {
					str += arr[bottom][i] + " ";
				}
			// 从下到上纵向
			if (right != left)
				for (int i = bottom - 1; i > left; i--) {
					str += arr[i][left] + " ";
				}
			left++;
			top++;
			right--;
			bottom--;
		}
		return str;
	}

}
