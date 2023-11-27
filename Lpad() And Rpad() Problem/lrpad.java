import java.util.Scanner;
public class lrpad {
   
    static String input;
    lrpad()
    {
        System.out.println("Enter inputs inside constructor:-");
        Scanner sc=new Scanner(System.in);
        input=sc.next();
        }
    public static void main(String args[])
    {
        lrpad obj=new lrpad();
        System.out.println("enter value of a and ch");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char ch=sc.next().charAt(0);
        String lpadResult=lpad( a, ch);
        System.out.println("Left Padded Result: " + lpadResult);
        String rpadResult=rpad( a, ch);
        System.out.println("Right Padded Result: " + rpadResult);
    }
    
    public static String lpad(int length,char padchar)
    {
        int paddinglength=length-input.length();
        if(paddinglength<=0)
        {
            return input;
        }
        String padding =new String(new char[paddinglength]).replace('\0',padchar);
        return padding + input;


    }
    public static String rpad(int length,char padchar)
    {
        int paddinglength=length-input.length();
        if(paddinglength<=0)
        {
            return input;
        }
        
        String padding =new String(new char[paddinglength]).replace('\0',padchar);
        return input + padding ;

    }
}
