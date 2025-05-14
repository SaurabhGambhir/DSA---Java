package multiThreading;

class ThreadConstrutorString1 extends Thread {
	
	ThreadConstrutorString1 (String S){
		
		super(S);
		
	}
		@Override
	public void run(){
//			int i=0;
//			while (i<4) {
//				System.out.println("Threadconstructor1");
//			}
		}
	
}

class ThreadConstrutorString2 extends Thread {
	
	ThreadConstrutorString2 (String S){
		
		super(S);
	}
		@Override
		public void run(){
//			int i=0;
//			while (i<4) {
//				System.out.println("Threadconstructor2");
//			}
		}	
}
public class constructorsInThreadClassStringNmae {

	public static void main(String[] args) {
		
		ThreadConstrutorString1 t1 = new ThreadConstrutorString1("Saurabh");
		ThreadConstrutorString1 t2 = new ThreadConstrutorString1("Pari");
		
		t1.start();
		t2.start();
		
		System.out.println("ID of ThreadConstrutorString1"+ t1.getId());
		System.out.println("Name of ThreadConstrutorString1"+ t1.getName());
		
		System.out.println("ID of ThreadConstrutorString1"+ t2.getId());
		System.out.println("Name of ThreadConstrutorString1"+ t2.getName());
	}
}
