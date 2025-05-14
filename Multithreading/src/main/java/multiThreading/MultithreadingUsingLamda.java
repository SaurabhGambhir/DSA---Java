//package multiThreading;
//class MyRunnable implements Runnable {
//	public void run() {
//		int i = 0;
//		while(i<=100) {
//			System.out.println("child Thread");
//			i++;
//		}
//	}	
//}
//
//class MyRunnable2 implements Runnable {
//	public void run() {
//		int i = 0;
//		while(i<=100) {
//			System.out.println("child2 Thread");
//			i++;
//		}
//	}	
//}
//
//public class MultithreadingUsingLamda {
//
//	public static void main(String[] args) {
//		MyRunnable r = new MyRunnable();
//		Thread T = new Thread(r);
//		T.start();
//		
//		MyRunnable2 r2 = new MyRunnable2();
//		Thread T2 = new Thread(r2);
//		T2.start();
//		
//		for (int i=0; i<=100; i++) {
//			System.out.println("Main Thread");
//		}	
//	}
//}

package multiThreading;
//class MyRunnable implements Runnable {
//	public void run() {
//		int i = 0;
//		while(i<=100) {
//			System.out.println("child Thread");
//			i++;
//		}
//	}	
//}

//class MyRunnable2 implements Runnable {
//	public void run() {
//		int i = 0;
//		while(i<=100) {
//			System.out.println("child2 Thread");
//			i++;
//		}
//	}	
//}

public class MultithreadingUsingLamda {

	public static void main(String[] args) {
//		MyRunnable r = new MyRunnable();
//		Thread T = new Thread(r);
//		T.start();
		
		Runnable R = ()-> {
			int i = 0;
		    while(i<=100) {
			System.out.println("child1 Thread");
			i++;
		}
		};
		Thread T = new Thread(R);
		T.start();
		
		   
		
//		MyRunnable2 r2 = new MyRunnable2();
//		Thread T2 = new Thread(r2);
//		T2.start();
		
		Runnable R2 = ()-> {
			int i2 = 0;
		    while(i2<=100) {
			System.out.println("child2 Thread");
			i2++;
		}
		};
		Thread T2 = new Thread(R2);
		T2.start();
		
		
		for (int i=0; i<=100; i++) {
			System.out.println("Main Thread");
		}	
	}
}
