import java.util.Scanner;

public class gradeCalculator {
    public static void main(String [] agrs) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter 1 and Enter to Start\t\t Press any key and ENTER to exit");
            int num = sc.nextInt();

            if (num == 1) {
                grades();
                continue;
            }
            else
                break;
        }
    }

    public static void grades() {
        Scanner sc = new Scanner(System.in);

        System.out.println("****************************************************************");
        System.out.println("******************* Student Grade Calculator *******************");
        System.out.println("****************************************************************\n");

        int [] grades = new int[5];
        int totalGrades = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Marks of subject "+(i+1)+" :");
            grades[i] = sc.nextInt();
            totalGrades += grades[i];
        }

        int avgPercent = (totalGrades*100)/500;

        System.out.println("\n\nYour total Marks: "+totalGrades+"\nYour Average Percentage is: "+avgPercent+"\n");

        if (avgPercent < 35)
            System.out.println("Grade: F\nSorry you are Fail");
        else if (avgPercent < 50)
            System.out.println("Grade D\nYou need to imporve very much");
        else if (avgPercent < 60)
            System.out.println("Grade: C");
        else if (avgPercent < 75)
            System.out.println("Grade: B\nYou are doing good, can do better");
        else 
            System.out.println("Grade: A\nGood Result");
    }
}

