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
            
        } else {
            System.out.print("the element in linked list is : ");
            while (temp != null) {
                System.out.print(" " + temp.data);
                temp = temp.next;
            }
        }
        System.out.println();
    }
    public void deletinglast() {
        // System.out.println();
        node temp = head;
        node ptr = head.next;
        System.out.println("after deleting the last element ");
        while (ptr.next!=null) {
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=null;
        traverse();
    }
    public void deletingbegining() {
        // System.out.println();
        node temp = head;
        System.out.print("after deleting from beging ");
        temp=temp.next;
        head=temp;
        traverse();
    }
    public void deletingspecific(int n) {
        System.out.print("after deleting from specific position ");
        node temp=head;
        node ptr=temp.next;
        for (int i = 0; i < n-1; i++) {
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=ptr.next;
        traverse();
    }

    public static void main(String[] args) {
        linkedlist1 l1 = new linkedlist1();
        l1.create();
        l1.traverse();
        l1.deletinglast();
        l1.deletingbegining();
        l1.deletingspecific(2);

    }
}
