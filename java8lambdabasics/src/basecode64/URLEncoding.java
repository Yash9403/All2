package basecode64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class URLEncoding {
	public static void main(String[] args) {
		Encoder eurl = Base64.getUrlEncoder();
		String url = "http://www.javatpoint.com/java-tutorial/";
		System.out.println(url);
		String encodeToString = eurl.encodeToString(url.getBytes());
		System.out.println(encodeToString);
		
		Decoder durl = Base64.getUrlDecoder();
		String string = new String(durl.decode(encodeToString));
		System.out.println(string);
	}

}
