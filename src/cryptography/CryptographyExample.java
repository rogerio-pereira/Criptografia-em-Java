package cryptography;


import java.security.NoSuchAlgorithmException;


/*
 *	Arquivo  CryptographySHA512.java
 *	Classe Criptography
 *	Obtida em http://rodrigolazoti.com.br/2008/10/03/como-utilizar-criptografia-em-java/
 *	31/08/2015 12:43
 *	
 *	Data:       31/08/2015
 */
public class CryptographyExample 
{
	public static void main(String[] args) throws NoSuchAlgorithmException 
	{
		Cryptography cryptography;
 
		//Criptografia usando MD5
		cryptography = new CryptographyMD5();
		System.out.println("MD5: " + cryptography.encrypt("Java Cryptography Architecture") + "\nUsage: new CryptographyMD5().encrypt(STRING)\n");

		//Criptografia usando SHA-256
		cryptography = new CryptographySHA256();
		System.out.println("SHA-256: " + cryptography.encrypt("Java Cryptography Architecture") + "\nUsage: new CryptographySHA256().encrypt(STRING)\n");

		//Criptografia usando SHA-512
		cryptography = new CryptographySHA512();
		System.out.println("SHA-512: " + cryptography.encrypt("Java Cryptography Architecture") + "\nUsage: new CryptographySHA512().encrypt(STRING)\n");
	}
}
