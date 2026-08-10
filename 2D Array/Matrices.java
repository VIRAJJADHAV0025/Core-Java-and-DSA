import java.util.Scanner;
public class Matrices {
    public static void findLargestAndSmallest(int matrix[][]) {
        int largest = matrix[0][0];
        int smallest = matrix[0][0];
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length;j++) {
                if(matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
                
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }

    public static boolean findKey(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length;j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Key found at index " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not exits.");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner input = new Scanner(System.in);
        // input
        for(int i=0; i<n; i++) {
            for(int j=0; j<m;j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // ouput
        for(int i=0; i<n; i++) {
            for(int j=0; j<m;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter key to found - ");
        int key = input.nextInt();

        findKey(matrix, key);
        findLargestAndSmallest(matrix);
    }
}
