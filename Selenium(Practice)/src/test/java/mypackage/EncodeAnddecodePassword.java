package mypackage;

import org.apache.commons.codec.binary.Base64;

public class EncodeAnddecodePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Encode the String	
		String str="test123";
		
		byte[] encodeString=Base64.encodeBase64(str.getBytes());     // covert string in to bytes
		System.out.println("Encoded String :"+new String(encodeString));
		
		
		// Decode the String	
		
		byte[] decodeString=Base64.decodeBase64(encodeString);
		System.out.println("Decoded String :"+new String(decodeString));
		
	}

}
