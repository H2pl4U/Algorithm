package bishi;

import java.util.Scanner;

public class С��ʵϰ���1 {

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
		//�����߽�ĳ�ʼֵ
		int left = 0, top = 0, bottom = row - 1, right = col - 1;
		while (left <= right && bottom >= top) {
			// �����Һ���
			for (int i = left; i <= right; i++) {
				str += arr[top][i] + " ";
			}
			// ���ϵ�������
			for (int i = top + 1; i <= bottom; i++) {
				str += arr[i][right] + " ";
			}
			// ���ҵ������
			if (top != bottom)
				for (int i = right - 1; i >= left; i--) {
					str += arr[bottom][i] + " ";
				}
			// ���µ�������
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
