import java.util.*;
public class CountAlphabet {
    void countalphabets(String s)
    {
        int digit=0;
        int alphabet=0;
        int uppercase=0;
        int lowercase=0;
        int space=0;
        int othersymbol=0;
    //    char[] arr=new char[s.length()];
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        if(Character.isUpperCase(ch))
          uppercase++;
        else if(Character.isLowerCase(ch))
          lowercase++;
        else if(Character.isDigit(ch))
          digit++;
        else if(Character.isWhitespace(ch))
          space++;
        else
          othersymbol++;
       }
       alphabet=uppercase+lowercase;
       System.out.println("total number of uppercase are "+uppercase);
       System.out.println("total number of lowercase are "+lowercase);
       System.out.println("total number of digits are "+digit);
       System.out.println("total number of whitespace are "+space);
       System.out.println("total number of other symbols are "+othersymbol);
       System.out.println("total number of Alphabets are "+alphabet);

    }
    public static void main(String[] args)
    {
       CountAlphabet c=new CountAlphabet();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s=sc.nextLine();  
      c.countalphabets(s);
      sc.close();
    }
}