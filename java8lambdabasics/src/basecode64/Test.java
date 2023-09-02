package basecode64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Test {
	public static void main(String[] args) {
		String s = "India@11";
		System.out.println(s);
		Encoder e = Base64.getMimeEncoder();
		String se = e.encodeToString(s.getBytes());
		System.out.println(se);
		
		Decoder d = Base64.getMimeDecoder();
		String string = new String(d.decode(se));
		System.out.println(string);
	}

}
