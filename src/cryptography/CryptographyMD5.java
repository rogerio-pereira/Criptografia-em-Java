package cryptography;

import java.security.NoSuchAlgorithmException;

/*
 *	Arquivo  CryptographyMD5.java
 *	Classe Criptography
 *	Obtida em http://rodrigolazoti.com.br/2008/10/03/como-utilizar-criptografia-em-java/
 *	31/08/2015 12:43
 *	
 *	Data:       31/08/2015
 */
public class CryptographyMD5 extends CryptographyGeneric implements Cryptography {

	public String encrypt(String value) throws NoSuchAlgorithmException 
	{
		return encryptByAlgorithm("MD5", value);
	}
}