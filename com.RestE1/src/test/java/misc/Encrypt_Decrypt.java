package misc;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import utility.Encrypt_utility;

public class Encrypt_Decrypt {
public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
	String PrivateKey = "Ac03tEam@j!tu_#1";
	Encrypt_utility eu = new Encrypt_utility();
	System.out.println(eu.encrypt("dinesh", PrivateKey));
	
	//vag0s6D4ohHR+jdyjl+FvQ==
	
	System.out.println(eu.decrypt("vag0s6D4ohHR+jdyjl+FvQ==", PrivateKey));
}
}
