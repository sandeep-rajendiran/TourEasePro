package crpyt1;
import java.util.Scanner;

public class Crpyt1 {

   public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
   
   public static String encrypt(String pt, int CryptKey)
{
pt=pt.toLowerCase(); String ct = "";
for (int i = 0; i < pt.length(); i++)
{
int charPosition = ALPHABET.indexOf(pt.charAt(i)); 
int keyVal = (CryptKey + charPosition) % 26;
char replaceVal = ALPHABET.charAt(keyVal);
ct += replaceVal;
}
return ct;
}
public static String decrypt(String ct, int CryptKey)
{
ct=ct.toLowerCase(); String pt = "";
for (int i = 0; i < ct.length(); i++)

{
     int charPosition = ALPHABET.indexOf(ct.charAt(i)); int keyVal = (charPosition - CryptKey) % 26;
if (keyVal < 0)
{
keyVal = ALPHABET.length() + keyVal;
}
char replaceVal = ALPHABET.charAt(keyVal); pt += replaceVal;
}
return pt;
}


   public static void main(String[] args) {
       System.out.println("Name : ROSHAN PK");
       System.out.println("RollNo : 18BCS108");
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter Plaintext :"); 
       String message = sc.next(); 
       System.out.println("Enter key :");
int key = sc.nextInt();
System.out.println("Encrypted message :" +encrypt(message, key)); 
System.out.println("Decrypted message :" +decrypt(encrypt(message, key), key));
    }
}
