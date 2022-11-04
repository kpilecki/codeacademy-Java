package paskaita04_11.uzduotis1;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import paskaita03_11.getForecast.Place;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Thread forecast = new Thread( new ForecastGetter() );
		
		var startTime = System.currentTimeMillis();
		
		Future<List<Place>> future = executorService.submit( new PlacesGetter() );
		Future<?> forecastFuture = executorService.submit( new ForecastGetter() );
		
		while( !future.isDone() && !forecastFuture.isDone()) {
			System.out.print(".");
			Thread.sleep( 200 );
		}
		future.get();
		forecastFuture.get();
		forecast.start();
		
		
		System.out.println( System.currentTimeMillis() - startTime );
		executorService.shutdown();
	}

}
