import java.util.Scanner;

public class circularlinklist1 {
    Scanner scan= new Scanner(System.in);
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head=null;
    node tail=null;
    public void create() {
        int data ,n;
        // Scanner scan= new Scanner(System.in);
        do {
            System.out.println("enter the data");
            data=scan.nextInt();
            node newnode=new node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
                newnode.next=head;
            }else{

                newnode.next=head;
                head=newnode;
                tail.next=head;
            }

            System.out.println("if you want to add another element then #press 0");
            n=scan.nextInt();
        } while (n==0);
        scan.close();
    }
    public void traverse() {
        node temp=head;
        if(head==null){
            System.out.println("linked list does not exist");
        }
        else{
            System.out.print("the elment in linked list is : ");
            do {
                System.out.print(temp.data+" ");
                temp=temp.next;
            } while (temp!=head);
        }
    }
    public static void main(String[] args) {
        circularlinklist1 c1 =new circularlinklist1();
        c1.create();
        c1.traverse();
    }
}
