package applicantion;

import java.util.Scanner;
import entities.rectangle;

public class retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rectangle r1 = new rectangle();

        System.out.print("Enter rectangle width and height: ");
        r1.height = sc.nextDouble();
        r1.width = sc.nextDouble();

        System.out.println("AREA: " + r1.area());
        System.out.println("PERIMETER: " + r1.perimeter());
        System.out.println("DIAGONAL: " + r1.diagonal());

        sc.close();
    }
}
