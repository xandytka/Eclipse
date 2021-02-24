import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MyRequest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String url = "http://192.168.0.12:13579/variables.html";
		String res = null;
		OkHttpClient client = new OkHttpClient.Builder()
			    .addInterceptor( new LoggingInterceptor())
			    .build();

		Request request = new Request.Builder()
			      .url(url)
			      .header("User-Agent", "OkHttp Example")
			      .build();
		  try (Response response = client.newCall(request).execute()) {
			    try {
					res = response.body().string();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();}

		  }
		  
		  System.out.print(res);   

	}

 	
	
}