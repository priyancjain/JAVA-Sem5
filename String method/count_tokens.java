import java.util.*;
public class count_tokens {
    void tokenizer(String s,char ch)
    {
    
        int count=1;
    
        for(int i=0;i<s.length();i++)
        {
            char w=s.charAt(i);
            if(w==ch)
             count++; 
        }  
        System.out.println("total number of tokens in mainstring are "+count);
    }
    public static void main(String[] args)
    {
        count_tokens obj=new count_tokens();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string and the key element ");
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        obj.tokenizer(s,ch);
        sc.close(); 
    }
    
}