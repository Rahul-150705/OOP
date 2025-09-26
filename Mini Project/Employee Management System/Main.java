package emp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select your role:");
        System.out.println("1. Manager");
        System.out.println("2. Developer");
        System.out.print("Enter 1 or 2: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        if (choice == 1) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Team Size: ");
            int teamSize = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            Manager mn = new Manager(name, id, salary, teamSize);
            mn.displayInfo();

        } else if (choice == 2) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // consume leftover newline

            System.out.print("Programming Language: ");
            String language = sc.nextLine();

            Developer dv = new Developer(name, id, salary, language);
            dv.displayInfo();

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
