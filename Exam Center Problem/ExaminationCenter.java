import java.util.Scanner;
import java.util.ArrayList;

class Profile {
    String name;
    int rollno;
    String DOB;
    String CentreChoice[] = { null, null, null };
    String CentralAllocated = null;

    Profile() {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = ip.nextLine();
        System.out.print("\nEnter Roll number: ");
        rollno = ip.nextInt();
        System.out.print("\nEnter Date of Birth (DD/MM/YYYY): ");
        DOB = ip.next();

    }

    public void CentreChoice(String[] centres, int[] seats) {
        System.out.println("\nChoose 3 centre priority wise:");
        int count = 1;
        for (String centre : centres) {
            System.out.println(count + ". " + centre);
            count += 1;
        }

        Scanner ip = new Scanner(System.in);

        int index;

        System.out.println("First priority: ");
        index = ip.nextInt() - 1;
        CentreChoice[0] = centres[index];
        if (seats[index] > 0) {
            CentralAllocated = centres[index];
            seats[index] -= 1;
        }
        System.out.println("Second priority: ");
        index = ip.nextInt() - 1;
        CentreChoice[1] = centres[index];
        if (seats[index] > 0 && CentralAllocated == null) {
            CentralAllocated = centres[index];
            seats[index] -= 1;
        }

        System.out.println("Third priority: ");
        index = ip.nextInt() - 1;
        CentreChoice[2] = centres[index];
        if (seats[index] > 0 && CentralAllocated == null) {
            CentralAllocated = centres[index];
            seats[index] -= 1;
        }

        System.out.println(CentralAllocated);

    }

    public void DisplayCandidateStatus() {
        System.out.println("-->Name: " + name);
        System.out.println("-->Roll Number: " + rollno);
        System.out.println("-->Date of Birth: " + DOB);
        System.out.println(
                "-->Center Choosed: " +
                        "\n   -->" + CentreChoice[0] +
                        "\n   -->" + CentreChoice[1] +
                        "\n   -->" + CentreChoice[2]);
        System.out.println("-->Center Allocated: " + CentralAllocated);

    }

    public boolean isRoll(int roll) {
        if (roll == rollno) {
            return true;
        }
        return false;
    }

}

public class ExaminationCenter {
    public static void main(String[] args) {
        ArrayList<Profile> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        final String[] centers = { "Indore", "Gwalior", "Ujjain" };
        int[] totalSeats = { 2, 2, 3 };
        int[] array = totalSeats.clone();

        int choice;

        while (true) {

            System.out.println("\n-->1. Enter Profile \n-->2. Enter Center Choice ");
            System.out.println("-->3. Display Candidate status\n" +
                    "-->4. Display Complete Status\n" +
                    "-->5. Display Center\n" +
                    "-->6. Exit ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Profile p1 = new Profile();
                    students.add(p1);
                    break;

                case 2:
                    System.out.print("Enter Roll Number: ");
                    choice = sc.nextInt();

                    for (Profile p : students) {
                        if (p.isRoll(choice)) {
                            p.CentreChoice(centers, array);
                            break;
                        }
                    }
                    // if roll not find
                    break;

                case 3:
                    System.out.print("Enter Roll Number: ");
                    choice = sc.nextInt();

                    for (Profile p : students) {
                        if (p.isRoll(choice)) {
                            p.DisplayCandidateStatus();
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("===========================");
                    for (Profile p : students) {
                        p.DisplayCandidateStatus();
                        System.out.println("\n");
                    }
                    System.out.println("===========================");
                    break;

                case 5:
                    String[] headers = { "Center", "Total Filled", "Total Remaining", "Total" };
                    for (String header : headers) {
                        System.out.printf("%-19s", header); // Adjust width as needed
                    }

                    for (int i = 0; i < headers.length - 1; i++) {

                        System.out.println();
                        System.out.printf("%-20s", centers[i]);
                        System.out.printf("%-20s", totalSeats[i] - array[i]);
                        System.out.printf("%-20s", array[i]);
                        System.out.printf("%-10s", totalSeats[i]);

                    }
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("\nEnter a valid number");
                    break;
            }

        }
    }
}