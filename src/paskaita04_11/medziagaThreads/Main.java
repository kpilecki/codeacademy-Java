package paskaita04_11.medziagaThreads;

public class Main {
	public static void main(String[] args) throws InterruptedException {
	        
	        Thread thread = new Thread( new Worker( 10 ));
	        Thread thread2 = new Thread( new Worker( 7 ));
	        
	        System.out.println(Thread.currentThread().getName() + " Startuojam pirma");
	        thread.start();
	        
	        System.out.println(Thread.currentThread().getName() + " Startuojam antra");
	        thread2.start();
	        
	        System.out.println(Thread.currentThread().getName() + " Cia laukiam");
	        thread2.join();
	        thread.join();
	
	       System.out.println(Thread.currentThread().getName() + " Baigiam darba");
	       
	    }

}
