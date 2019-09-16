package digui;

public class DiGui {

	//¼òµ¥µİ¹é 
	public static void main(String[] args) {
		int n = 5;
		int sum = getsum(n);
		System.out.println(sum);
	}

	private static int getsum(int n) {
		if(n==1){
			return 1;
		}
		return n+getsum(n-1);
	}

}
