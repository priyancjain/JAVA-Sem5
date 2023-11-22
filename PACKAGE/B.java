package P1.P11;
import P1.A;
public class B extends A{
    public void func(String name)
    {
        System.out.println("This is method func  of class B and printing name "+name);
    }
    public static void main(String args[])
    {
        System.out.println("Hello this is B class which is a Child Class of A");
        B obj=new B();
        obj.Display();
        obj.func("Priyanshi Jain");
    }
}