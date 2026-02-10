package misc;

import java.util.Base64;

public class Encode_Decode {
public static void main(String[] args) {
	String encode = new String(Base64.getEncoder().encode("ABC".getBytes()));
	System.out.println(encode);
	String decode = new String (Base64.getDecoder().decode("QUJD".getBytes()));
	System.out.println(decode);
}
}
