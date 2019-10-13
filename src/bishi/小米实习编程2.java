package bishi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class People {
	int arr;
	int wash;

	public People(int arr, int wash) {
		this.arr = arr;
		this.wash = wash;
	};
}

public class 小米实习编程2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int q = scan.nextInt();
		int[] inArr = new int[2 * q];
		for (int i = 0; i < q * 2; i++) {
			inArr[i] = scan.nextInt();
		}
		int a = scan.nextInt();
		int waitTime = func(inArr, n, k, q, a);
		System.out.println(waitTime);
		scan.close();
	}

	private static int func(int[] inArr, int n, int k, int q, int a) {
		int[] dp = new int[100001];
		for (int i = 0, j = 1; j < inArr.length; i += 2, j += 2) {
			dp[inArr[i]] += inArr[j];
		}
		dp[a]++;
		Queue<People> wash = new LinkedList<People>();
		Queue<People> wait = new LinkedList<People>();
		int i = 1;
		for (;; i++) {
			//wash队首洗澡时间等于k即出队
			while (!wash.isEmpty() && i - wash.peek().wash == k)
				wash.poll();
			int num = dp[i];
			//有人来时进入wait队列等待
			while (i <= a && (num--) != 0)
				wait.add(new People(i, -1));
			//wash队列小于容量n且wait队列不为空，则将wait队首添加至wash中
			while (wash.size() < n && !wait.isEmpty()) {
				wait.peek().wash = i;
				wash.add(wait.peek());
				wait.poll();
			}
			//直到两个队列为空，且当前时刻大于a
			if (i > a && wash.isEmpty() && wait.isEmpty())
				break;
		}
		return i;
	}

}
