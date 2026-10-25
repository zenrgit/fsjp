import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee{
    int EmpID;
    String EmpName;
    double EmpSalary;

    void getInfo(int id, String name, double salary){
        EmpID = id;
        EmpName = name;
        EmpSalary = salary;
    }
    double calculateGrossSalary(){
        return EmpSalary+(0.1*EmpSalary)+(0.07*EmpSalary);
    }
    void display(){
        System.out.println("Employee Details:");
        System.out.println("Employee name:"+ EmpName);
        System.out.println("Employee ID:"+ EmpID);
        System.out.println("Employee Salary:"+ EmpSalary);
        System.out.println("Employee Gross Salary:"+ calculateGrossSalary());
    }

    public static void main(String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        Employee e = new Employee();

        System.out.println("Enter Employee ID:");
        int id = Integer.parseInt(bf.readLine());

        System.out.println("Enter Employee Name:");
        String name = bf.readLine();

        System.out.println("Enter Employee Salary:");
        double salary = Double.parseDouble(bf.readLine());

        e.getInfo(id, name, salary);
        e.display();
    }
}