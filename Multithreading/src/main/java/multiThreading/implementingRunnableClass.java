package multiThreading;

class Thread1 implements Runnable{
	
   
	public void run() {
		int i=0;
		while (i<4000) {
			System.out.println("Thread1 is running 11111111");
			i++;
		}
	}
}
	
	class Thread2 implements Runnable{
		
		public void run() {
			int i=0;
			while (i<4000) {
				System.out.println("Thread2 is running 22222222");
				i++;
			}
		}
	}
	
	
public  class implementingRunnableClass {

	public static void main(String[] args) {
		Thread1 bullet1 = new Thread1();
		Thread gun1 = new Thread(bullet1);
		
		
		Thread2 bullet2 = new Thread2();
		Thread gun2 = new Thread(bullet2);
		
		gun1.start();
		gun2.start();
	}
}

