package P2;
import P1.P11.B;
public class E extends B
{
    public void func2(int a)
    {
        System.out.println("The phone number "+a);
    }
    public static void main(String a[])
    {
        System.out.println("This is package p2 and class E");
        E obj2=new E();
        obj2.func2(97847);
        obj2.Display();
            }
}