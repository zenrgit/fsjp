import java.util.Scanner;

class Rectangle{
    double length, breadth;

    void setDim(double l, double b){
        length = l;
        breadth = b;
    }

    double calculateArea(){
        return length*breadth;
    }

    double calculatePerimeter(){
        return 2*(length+breadth);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();

        System.out.println("Enter length of Rectangle:");
        double l = sc.nextDouble();
        System.out.println("Enter breadth of Rectangle:");
        double b = sc.nextDouble();

        r.setDim(l, b);
        System.out.println("Area of Rectangle is "+r.calculateArea());
        System.out.println("Perimeter of Rectangle is "+r.calculatePerimeter());

        sc.close();
    }
}