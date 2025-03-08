package applicantion;

import java.util.Locale;
import java.util.Scanner;
import entities.employee;

public class funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        employee f1 = new employee();

        System.out.print("Name: ");
        f1.name = sc.nextLine();
        System.out.print("Gross salary: ");
        f1.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        f1.tax = sc.nextDouble();
        System.out.println(f1.toString());

        System.out.println("Which percentage increase salary");
        double percentage = sc.nextDouble();
        f1.incressSalary(percentage);
        System.out.println("Updated data: " + f1.toString());


        sc.close();
    }
}
