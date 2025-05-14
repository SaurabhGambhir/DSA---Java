package multiThreading;

	 class Chatting extends Thread{
	    @Override
		public  void run() {
	    	int i=0;
	    	while(i<4000){
			System.out.println("Chatting Thread is running");
			System.out.println("I am Happy!");
			i++;
	    	}

		}
	}
		
		 class Cooking extends Thread{
			@Override
			public  void run() {
				int i=0;
		    	while(i<4000){
				System.out.println("Cooking Thread is running");
				System.out.println("I am Sad!");
                i++;
		    	}
			}
		}
	public	 class extendingThreadClass {
	public static void main(String[] args) {
		Chatting C = new Chatting();
		Cooking K = new Cooking();
		
		C.start();
		K.start();
	}

}
