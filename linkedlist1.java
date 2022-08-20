import java.util.Scanner;
// This linked list is add element at the beging of a list
public class linkedlist1 {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

    public void create() {
        int data, n;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("enter the data");
            data = scan.nextInt();
            node newnode = new node(data);
            if (head == null) {
                head = newnode;
            } else {
                newnode.next = head;
                head = newnode;
            }
            System.out.println("do you want to add element in linked list. if yes: #press 1");
            n = scan.nextInt();
        } while (n == 1);
        scan.close();
    }

    
    public void traverse() {
        node temp = head;
        if (head == null) {
            System.out.println("the linked list does not exist");

        } 
        else {
            System.out.println("the element in linked list is : ");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist1 l1 = new linkedlist1();
        l1.create();
        l1.traverse();
    }
}
