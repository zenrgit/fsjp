import java.util.Scanner;

abstract class Number{
    double num;
    void getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextDouble();
        sc.close();
    }
    abstract void square();
    abstract void squareRoot();
    abstract void cube();
}
class Calculate extends Number{
    void square(){
        System.out.println("Square of the number is: "+(num*num));
    }
    void squareRoot(){
        System.out.println("Square root of the number is: "+Math.sqrt(num));
    }
    void cube(){
        System.out.println("Cube of the number is: "+(num*num*num));
    }
    public static void main(String[] args){
        Calculate c = new Calculate();
        c.getNumber();
        c.square();
        c.squareRoot();
        c.cube();
    }
}