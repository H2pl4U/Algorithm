package bishi;

import java.math.BigInteger;
import java.util.Scanner;
 
public class »˝¡˘¡„±  ‘±‡≥Ã1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		long[] arrX = new long[len];
		long[] arrY = new long[len];
		for (int i = 0; i < len; i++) {
			arrX[i] = sc.nextLong();
			arrY[i] = sc.nextLong();
		}
		long length = funnc(arrX, arrY);
		BigInteger size = new BigInteger(length+"");
		System.out.println(size.multiply(size));
		sc.close();
	}

	private static long funnc(long[] arrX, long[] arrY) {
		long minX = arrX[0];
		long minY = arrX[0];
		long maxX = arrX[0];
		long maxY = arrX[0];
		for (int i = 0; i < arrX.length; i++) {
			if (arrX[i] < minX) {
				minX = arrX[i];
			}
			if (arrX[i] < minY) {
				minY = arrY[i];
			}
			if (arrX[i] > maxX) {
				maxX = arrX[i];
			}
			if (arrY[i] > maxY) {
				maxY = arrY[i];
			}
		}
		long length = Math.abs(maxX - minX);
		long height = Math.abs(maxY - minY);
		return Math.max(length, height);
	}

}
