import java.util.*;
public class count_string_char {
    static Scanner sc=new Scanner(System.in);
    static String s;
    count_string_char()
    {
        System.out.println("enter the string ");
        s=sc.nextLine();
    }
    void find_char(char ch)
    {
        int character=0;
        for(int i=0;i<s.length();i++)
        {
          char n=s.charAt(i);
          if(n==ch){
            character++;
          }   
        }
        System.out.println("total number of character "+ch+" in string "+s+" are "+character);
    }
    void find_string(String str)
    {
        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = s.indexOf(str, lastIndex);
            // System.out.println(lastIndex+"..");

            if (lastIndex != -1) {
                count++;
                lastIndex += 1;
                // System.out.println(lastIndex);
            }
        }
        System.out.println("total number of substrings in mainstring are "+count);
    }
    
    public static void main(String[] args)
{
        count_string_char obj=new count_string_char();
        boolean condition=true;
        while(condition)
    {
        System.out.println("enter 1 to count total number of occurance of a character or 2 to find occurance of string within the given string");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("enter the character ");
                char ch=sc.next().charAt(0);
                obj.find_char(ch);
            }
            break;

            case 2:
            {
                System.out.println("enter the string ");
                sc.nextLine(); 
                String str1=sc.nextLine();
                obj.find_string(str1);
            }
            break;

            default:
            System.out.println("please enter the valid number..... ");
        } 
        System.out.println("enter 1 to continuee...");
        int f=sc.nextInt();
        if(f!=1)
          condition=false;
    }
}
    // sc.close(); 
}