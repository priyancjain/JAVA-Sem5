class SumAvgLen{
    public static void main(String args[])
    {
        float sum=0;
        for(String s :args){
            sum+=Float.parseFloat(s);

        }
        System.out.println(args.length);
        System.out.println(sum);
        System.out.println(sum/args.length);
    }
}