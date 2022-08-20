import java.util.Scanner;

public class twodarray1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("enter the " + (i +1)+ " th " + (j+1) + " th number of array : ");
                a[i][j] = scan.nextInt();
            }
        }
        System.out.print("the element in array is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" ");
                System.out.print(a[i][j]);
            }
        }
        scan.close();
    }
}
