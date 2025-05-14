package multiThreading;


class goodMorning extends Thread{
//	public void run() {
//		int i=0;
//		while (i<4000) {
//		System.out.println("goodMorning");
//		}
//	}
}


class Welcome extends Thread{
//	public void run() {
//		int i=0;
//		while (i<4000) {
//		System.out.println("Welcome");
//		}
//	}
	
}

public class practiceMultithreading {

	public static void main(String[] args) {
		goodMorning GM = new goodMorning();
		Welcome WL = new Welcome();
		
		GM.start();
		GM.setPriority(Thread.MIN_PRIORITY); 
		
		GM.setName("Saurabh");
		System.out.println(GM.getName());
		
//		try {
//			GM.join(1000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		WL.start();
		System.out.println(WL.toString());
//		WL.setPriority(1);
		System.out.println(WL.getName());
	}

}
