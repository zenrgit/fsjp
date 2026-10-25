import java.util.Scanner;

class MatrixTranspose{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] Matrix = new int[rows][cols];
        int[][] Transpose = new int[cols][rows];
        
        System.out.println("Enter matrix elements:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                Transpose[i][j] = Matrix[j][i];
            }
        }

        System.out.println("Original Matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(Transpose[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}