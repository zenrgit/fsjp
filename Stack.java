import java.util.Scanner;

class Stack{
    int size;
    int stack[];
    int top = -1;

    void size(int size){
        this.size = size;
        stack = new int[size];
    }

    void push(int value){
        if (top==size-1){
            System.out.println("Stack Overflow");
        }else{
            top++;
            stack[top]=value;
            System.out.println(value + " Pushed Successfully");
        }
    }

    void pop(){
        if (top==-1){
            System.out.println("Stack Underflow");
        }else{
            System.out.println(stack[top] + " Popped");
            top--;
        }
    }

    void display(){
        if (top==-1){
            System.out.println("Stack is empty!");
        }else{
            System.out.println("Stack Element:");
            for(int i=top; i>=0; i--){
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();

        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        s.size(size);

        System.out.println("Enter element:");
        for(int i=0; i<size; i++){
            int value = sc.nextInt();
            s.push(value);
        }

        int choice;
        do{
            System.out.println("Stack Menu");
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter value to push:");
                    int value = sc.nextInt();
                    s.push(value);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }
        }while (choice!=4);
        sc.close();
    }
}