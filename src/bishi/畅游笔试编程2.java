package bishi;

/*
 * 两个线程交替输出12A34B56C...5152Z
 */
class MyThread1 implements Runnable {
	public void run() {
		int count = 0;
		for (int i = 1; i <= 52; i++) {
			count++;
			synchronized (this) {
				if (count == 2) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count = 0;
				}else {
					System.out.println(i);
					this.notify();
				}
			}
		}
	}
}

class MyThread2 implements Runnable {

	public void run() {
		int count = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			count++;
			synchronized (this) {
				if (count == 1) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count = 0;
				}else {
					System.out.println(i);
					this.notify();
				}
			}
		}
	}
}

public class 畅游笔试编程2 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
	}
}
