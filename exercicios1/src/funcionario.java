import java.util.Locale;
import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int number = sc.nextInt();
        int hours = sc.nextInt();
        double dolarPerHours = sc.nextDouble();
        double salary = hours * dolarPerHours;

        System.out.println(number);
        System.out.println(salary);
    }
}
