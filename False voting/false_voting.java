import java.util.Scanner;
class false_voting{
    private static int A=0;
    private static int B=0;
    private static int C=0;
    private static int D=0;
    private static int count=0;
private static void Vote_Casting_Process(int choice,Scanner sc,boolean isSpecialRound)
{
    switch(choice)
    {
        case 1:
        vote_casting(sc, isSpecialRound);
        break;
        case 2:
        CandidateWiseResult(sc);
        break;
        case 3:
        ComprehensiveReport();
        break;
        case 4:
        exitvotting();
        break;
        default:
        System.out.println("Invalud choice");
        count--;

    }
}
private static void vote_casting(Scanner sc,boolean isSpecialRound)
{
    System.out.println("Press 1 for A/n Press 2 for B /n Press 3 for C/n Press 4 for D");
    int input=sc.nextInt();
    if(isSpecialRound)
    {
        if(input==1)
        {
            C++;
            System.out.println("Voted for A");
        }
        else if (input==2) {
            C++;
            System.out.println("Voted for B");
        }
        else if (input==3) {
            C++;
            System.out.println("Voted for C");
        }
        else if (input==4) {
            C++;
            System.out.println("Voted for D");
        }
        else
        {
            count--;
            System.out.println("Individual that you have voted does not exists");
        }
    }
    else
    {
        switch(input)
        {
        case 1:
            A++;
            System.out.println("Voted for A");
            break;
        
       case 2:
            B++;
            System.out.println("Voted for B");
            break;
        case 3:
            C++;
            System.out.println("Voted for C");
            break;
        case 4:
            D++;
            System.out.println("Voted for D");
            break;
        default:
            count--;
            System.out.println("Individual that you have voted does not exists");
            return;
        }
    }
}

private static void CandidateWiseResult(Scanner sc)
{
    count--;
    System.out.println("Enter Candidate Name");
    String name=sc.next();
    switch(name)
    {
        case "A":
        System.out.println("Total Number of vote for A is "+A);
        break;
        case "B":
        System.out.println("Total Number of vote for B is "+B);
        break;
        case "C":
        System.out.println("Total Number of vote for C is "+C);
        break;
        case "D":
        System.out.println("Total Number of vote for D is "+D);
        break;
        default:
        System.out.println("Invaid choice");

    }
}
private static void ComprehensiveReport()
{
    count--;
    System.out.println("Vote for A is " + A + "\nVote for B is " + B +"\n Vote for C is "+C+"\n Vote for D is " + D);
}
private static void exitvotting()
{
    System.out.println("Exitting votting");
    System.exit(0);
}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Voting Started:");
        while(true)
        {
            count++;
            System.out.println("Press\n 1. for Vote Casting \n 2. for Candidate wise result \n 3. For Comprehensive report \n 4. for exit");
            int choice=sc.nextInt();
            if(count % 3==0 || count % 7==0)
            {
                Vote_Casting_Process(choice,sc,true);
            }
            else
            {
                Vote_Casting_Process(choice,sc,false);
            }
        }
    }
}