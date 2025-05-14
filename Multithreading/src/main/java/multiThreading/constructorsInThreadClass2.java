package multiThreading;
class ThreadConstructorString1 extends Thread {

    public ThreadConstructorString1(Runnable target, String name) {
        super(target, "Saurabh"); // Calls Thread(Runnable r, String name)
    }
}

class ThreadConstructorString2 extends Thread {

    public ThreadConstructorString2(Runnable target, String name) {
        super(target, "Saurabh2"); // Calls Thread(Runnable r, String name)
    }
}

class Task1 implements Runnable {

    public void run() {

    }
}

class Task2 implements Runnable {
   
    public void run() {

    }
}

public class constructorsInThreadClass2 {
    public static void main(String[] args) {
        
        Runnable task1 = new Task1();
        Thread thread1 = new ThreadConstructorString1(task1, "T1");
        
        Runnable task2 = new Task2();
        Thread thread2 = new ThreadConstructorString2(task2,"T2");
        
        thread1.start();
        thread2.start();
        
        System.out.println("ThreadConstructorString1"+ thread1.getId());
        System.out.println("ThreadConstructorString1"+ thread1.getName());
        
        System.out.println("ThreadConstructorString2"+ thread2.getId());
        System.out.println("ThreadConstructorString2"+ thread2.getName());
    }
}