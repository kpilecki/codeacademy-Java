package paskaita04_11.medziagaThreads;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Worker implements Runnable{
	private int number;

	@Override
	public void run() {
		for(int i = 1 ; i <= number ; i++) {
            System.out.println(Thread.currentThread().getName() + " darbininkas dirba " + i );
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {}
        }
		
	}

}
