class SumAvgLen{
    public static void main(String args[])
    {
        float sum=0;
        for(String s :args){
            sum+=Float.parseFloat(s);

        }
        System.out.println("The total count of numbers supplied from Command line "+args.length);
        System.out.println("The sum of given number is "+sum);
        System.out.println("The average of given number are "+sum/args.length);
    }
}