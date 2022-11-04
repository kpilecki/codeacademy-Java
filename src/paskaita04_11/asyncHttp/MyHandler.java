package paskaita04_11.asyncHttp;

import org.asynchttpclient.AsyncHandler;
import org.asynchttpclient.HttpResponseBodyPart;
import org.asynchttpclient.HttpResponseStatus;

import io.netty.handler.codec.http.HttpHeaders;

public class MyHandler implements AsyncHandler<Object>{

	@Override
	public State onStatusReceived(HttpResponseStatus responseStatus) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State onHeadersReceived(HttpHeaders headers) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State onBodyPartReceived(HttpResponseBodyPart bodyPart) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onThrowable(Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object onCompleted() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
