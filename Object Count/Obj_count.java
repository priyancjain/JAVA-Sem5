class Obj_count
{
    static int count=0; //to use it globally it is static
    Obj_count()
    {
        count++;
    }
    public static void main(String a[])
    {
        Obj_count o1=new Obj_count(); //object 1
        Obj_count o2=new Obj_count(); //Object 2
        Obj_count o3=new Obj_count();//Object 3
         
        System.out.println("The total number of object are "+count);

    }

}