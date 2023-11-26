import java.util.Scanner;

public class EncryptDecrypt {
    static String message;
    EncryptDecrypt()
    {
        Scanner sc =new Scanner(System.in);
        message=sc.nextLine();

    }
    public static void main(String args[])
    {
        EncryptDecrypt obj=new EncryptDecrypt();
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        String EncryptedMesssage=encrypt(key);
        System.out.println("The Encrpyted message is "+EncryptedMesssage);
        String DecryptedMessage=decrypt(EncryptedMesssage,key);
        System.out.println("The Decrypted Message is "+DecryptedMessage);
    }
    private static String encrypt(int key)
    {
        char[] encrypt=new char[message.length()];
        for(int i=0;i<message.length();i++)
        {
            char c=message.charAt(i);
            if(Character.isLetter(c))
            {
                char ch=(char)(c+key);
                encrypt[i]=ch;
            }
            else
            {
                encrypt[i]=c;
            }
        }
        return new String(encrypt);
    }
   private static String decrypt(String EncryptedMesssage,int key)
   {
     char[] decrypt=new char[EncryptedMesssage.length()];
     for(int i=0;i<EncryptedMesssage.length();i++)
     {
        char c=EncryptedMesssage.charAt(i);
        if(Character.isLetter(c))
        {
            char ch=(char)(c-key);
            decrypt[i]=ch;
        }
        else
        {
            decrypt[i]=c;
        }
        

     }
    return new String(decrypt);
   }
}
