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
                System.out.println("enter 1 if you want to add element at the begining \nEnter 2 if you want to add element at end \nenter 3 if you want to add element in betweent of linked list");
                int m = scan.nextInt();
                switch (m) {
                    case 1:
                    newnode.next=head;
                    head=newnode;
                    tail.next=head; 
                        break;
                
                    case 2:
                        tail.next=newnode;
                        tail=newnode;
                        newnode.next=head;
                        break;
                
                    case 3:
                        System.out.println("enter the index which you want to add element");
                        int index = scan.nextInt();
                        node temp1=head;
                        for(int i=0;i<index-1;i++){
                            temp1=temp1.next;
                        }
                        newnode.next=temp1.next;
                        temp1.next=newnode;
                        break;
                
                    default:
                    System.out.println("item not valid");
                    newnode.next=head;
                    head=newnode;
                    tail.next=head; 
                        break;
                }
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
