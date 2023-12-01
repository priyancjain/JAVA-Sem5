import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Pnr {
    int pnr;
    String Passenger_name;
    int age;
    String train = null;
    int bogie = -1;
    int seat = -1;

    static int pnrCount = 1;

    Pnr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        Passenger_name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        pnr = pnrCount;
        pnrCount += 1;
        System.out.println("Your Id(PNR) is: " + pnr);

    }

    public void selectTrain(int[][] train, String[] trainLocation, Scanner sc) {
        int count = 1;
        System.out.println("Enter: ");
        for (String s : trainLocation) {
            System.out.println("   --> " + count + ". for " + s);
            count = count + 1;
        }
        count = sc.nextInt();

        for (int i = 0; i < train[count - 1].length - 1; i++) {
            if (train[count - 1][i] > 0) {
                bogie = i + 1;
                seat = train[count - 1][i];
                train[count - 1][i] -= 1;
                this.train = trainLocation[count - 1];

                train[count - 1][train.length - 1] += 1;
                return;
            }
        }
        System.out.println("No seats available");
    }

    public void candidateInfo(Pnr person) {
        System.out.println("Name: " + Passenger_name);
        System.out.println("Age: " + age);
        System.out.println("Pnr" + pnr);
        System.out.println("Train: " + train);
        System.out.println("Bogie: " + bogie);
        System.out.println("Seat: " + seat);
    }

    public int getID() {
        return pnr;
    }
}

public class Train {

    static void displayTrain(int[][] train, String[] trainLocation, int bogieSize) {
        String[] headers = { "Train", "Bogie", "Remaining Seats ", "Total" };
        for (String header : headers) {
            System.out.printf("%-19s", header); // Adjust width as needed
        }

        for (int i = 0; i < headers.length - 1; i++) {

            System.out.println();
            System.out.printf("%-20s", trainLocation[i]);
            System.out.printf("%-20s", train[i].length - 1);

            System.out.printf("%-20s", (train[i].length - 1) * bogieSize - train[i][train.length - 1]);
            System.out.printf("%-10s", (train[i].length - 1) * bogieSize);

        }

    }

    public static void main(String[] args) {
        int[][] train = new int[3][3];
        String[] trainLocation = { "Indore", "Ujjain", "Dewas" };
        int bogieCapacity = 2;
        for (int i = 0; i < train.length; i++) {
            Arrays.fill(train[i], bogieCapacity);
            train[i][train[i].length - 1] = 0;
        }

        int choice;

        ArrayList<Pnr> personsArrayList = new ArrayList<>();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n-->1. Enter Profile \n-->2. Enter Train ");
            System.out.println("-->3. Display Candidate information\n" +
                    "-->4. Display Train Details\n" +
                    "-->5. Exit ");
            choice = sc.nextInt();

            loop: switch (choice) {
                case 1:
                    personsArrayList.add(new Pnr());
                    break;
                case 2:
                    System.out.print("Enter your ID(PNR): ");
                    choice = sc.nextInt();
                    for (Pnr person : personsArrayList) {
                        if (person.getID() == choice) {
                            person.selectTrain(train, trainLocation, sc);
                            break loop;
                        }
                    }
                    System.out.println("No such ID found!!");
                    break;

                case 3:
                    System.out.print("Enter ID(Pnr): ");
                    choice = sc.nextInt();
                    for (Pnr person : personsArrayList) {
                        if (person.getID() == choice) {
                            person.candidateInfo(person);
                            break loop;
                        }
                    }
                    break;

                case 4:
                    displayTrain(train, trainLocation, bogieCapacity);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nEnter a valid number");
                    break;
            }

        }
    }

}