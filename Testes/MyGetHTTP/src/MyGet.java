import java.io.IOException;
import java.net.*;



public class MyGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	       String data = "";
	       URL url = new URL("http://192.168.0.12:13579/commands.html?wm_command=888");
	       HttpURLConnection con = (HttpURLConnection) url.openConnection();
	       con.setRequestMethod("POST");
	       con.setDoOutput(true);
	       con.getOutputStream().write(data.getBytes("UTF-8"));
	       con.getInputStream();
		} catch (Exception e) {
            e.printStackTrace();
        }


	}

}
