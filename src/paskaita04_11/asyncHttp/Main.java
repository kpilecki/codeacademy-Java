package paskaita04_11.asyncHttp;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.BoundRequestBuilder;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.ListenableFuture;
import org.asynchttpclient.Response;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		String url = "https://api.meteo.lt/v1/places";
		AsyncHttpClient client = Dsl.asyncHttpClient();
		
		BoundRequestBuilder getRequest = client.prepareGet( url );
		
		ListenableFuture<Response> future = getRequest.execute();
		ExecutorService service = Executors.newCachedThreadPool();
		
		future.addListener(
				() -> {
					try {
						Response response = future.get();
						System.out.println( response.getStatusCode() );
						System.out.println( response.getContentType() );
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
		} , service ).get();
		
		client.close();
		service.shutdown();
	}
}
