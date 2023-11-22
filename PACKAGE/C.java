package P2;
public class C 
{
    public void func1(int a,String b)
    {
        System.out.println("The phone number "+a+" name is "+b);
    }
    public static void main(String a[])
    {
        System.out.println("This is package p2 and class C");
        C obj1=new C();
        obj1.func1(97847,"Priyanshi Jain");
    }
}