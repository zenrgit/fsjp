import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Valid Triangle");
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area = " + area);
        } else {
            System.out.println("Triangle cannot be formed.");
        }
        sc.close();
    }
}
