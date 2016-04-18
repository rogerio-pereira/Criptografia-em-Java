package cryptography;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;


/*
 *	Arquivo  Cryptography.java
 *	Classe Criptography
 *	Obtida em http://rodrigolazoti.com.br/2008/10/03/como-utilizar-criptografia-em-java/
 *	31/08/2015 12:43
 *	
 *	Data:       31/08/2015
 */
public abstract class CryptographyGeneric 
{
	private MessageDigest messageDigest;
	private BASE64Encoder encoder;

	protected void useAlgorithm(String algorithm) throws NoSuchAlgorithmException 
	{
		if (messageDigest == null || messageDigest.getAlgorithm() != algorithm) 
		{
			messageDigest = MessageDigest.getInstance(algorithm);
		}

		if (encoder == null) 
		{
			encoder = new BASE64Encoder();
		}
	}

	protected String encryptByAlgorithm(String algorithm, String value) throws NoSuchAlgorithmException 
	{
		if (value == null) 
		{
			throw new IllegalArgumentException("The value is null.");
		}

		useAlgorithm(algorithm);
		byte[] hash = messageDigest.digest(value.getBytes());
		return encoder.encode(hash);
	}
}
