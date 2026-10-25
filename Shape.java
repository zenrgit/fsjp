import java.util.Scanner;

public class Shape {
    void calculateArea(double r){
        double area = 3.14*r*r;
        System.out.println("Area of Circle is: "+area);

    }    
    void calculateArea(int l, int b){
        double area = l*b;
        System.out.println("Area of Rectangle is: "+area);
        
    }   
    void calculateArea(double b, double h){
        double area = 0.5*b*h;
        System.out.println("Area of Triangle is: "+area);
        
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();

        System.out.println("Enter the radius of Circle:");
        double radius = sc.nextDouble();
        s.calculateArea(radius);

        System.out.println("Enter the length and breadth of Rectangle:");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        s.calculateArea(length, breadth);

        System.out.println("Enter the base and height of Triangle:");   
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        s.calculateArea(base, height);

        sc.close();
    }
}
