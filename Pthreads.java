package abstractclass.java;

class demo{
	 synchronized public void run() {
			for(int i = 1;i<=3;i++) {
				try{
		    		Thread.sleep(3000);  // 2000 miliseconds = 2 secs
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  

				System.out.println("running thread name is:"+Thread.currentThread().getName()); 
				System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());
				System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive()); 
				System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); 
	
}
	 }
}
	 
 class Pthreads extends Thread {
	 demo d;
	 Pthreads(demo d){
		 this.d = d;
	 }
	 public void run() {
		 d.run();
	 
 }
 
 
	 
	 
		public static void main(String[] args) {
		demo ob = new demo();
		Pthreads s1 = new Pthreads(ob);
		Pthreads s2 = new Pthreads(ob);
		Pthreads s3 = new Pthreads(ob);
		
		s1.setName("IT");
		s2.setName("Finanical");
		s3.setName("HR");
		
		s1.setPriority(Thread.MAX_PRIORITY);
		s2.setPriority(Thread.MIN_PRIORITY);
		s3.setPriority(Thread.NORM_PRIORITY);
		
		s1.start();
		s2.start();
		s3.start();
		
		
		

	}

}
	 
