import java.util.Scanner;

class Shape{
    int r;
    void getr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the Circle:");
        r = sc.nextInt();
    }
}
class Circle extends Shape{
    double calArea(){
        float pi = 3.14f;
        float area = pi*r*r;
        return area;
    }
}
class Sphere extends Circle{
    void volume(){
        System.out.println("Volume of Sphere is" + (4*(calArea()*r))/3);
    }
    public static void main(String[] args){
        Sphere s = new Sphere();
        s.getr();
        s.volume();
    }
}