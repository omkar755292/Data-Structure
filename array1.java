import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array");
        n = scan.nextInt();
        int mark[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the " + i + " element of array");
            mark[i] = scan.nextInt();
        }
        System.out.print("the element are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            System.out.print(mark[i]);
        }
        System.out.println();
        int mark2[] = new int[n + 1];
        System.out.println("enter the new element to be inserted");
        int element = scan.nextInt();
        System.out.println("enter the index of element to inserted");
        int indexat = scan.nextInt();
        for (int i = 0; i < n + 1; i++) {
            if (i < indexat) {
                mark2[i] = mark[i];
            } else if (i == indexat) {
                mark2[i] = element;
            } else {
                mark2[i] = mark[i - 1];
            }
        }
        System.out.print("the new array of element is : ");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(" ");
            System.out.print(mark2[i]);
        }
        int mark3[]= new int [n];
        System.out.println();
        System.out.println("enter the index of deleting the element");
        int indexatdelete = scan.nextInt();
        for(int i = 0; i<n;i++){
            if(i<indexatdelete){
                mark3[i]=mark2[i];
            }
            else if(i==indexatdelete){
                mark3[i]=mark2[i+1];
            }
            else{ 
                mark3[i]=mark2[i+1];
            }
            
        }
        System.out.print("the element after the deletion is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            System.out.print(mark3[i]);
        }
        scan.close();

    }
}
