
class myLinkedList {

    class node {
        node preveous;
        String data;
        node next;
        
        node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    private myLinkedList.node head;
    
    public void addFirst(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
    }
    public void addLast(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newnode;

    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        node currentNode= head;
        while(currentNode.next!=null){
            System.out.println(currentNode +"->");
            currentNode = currentNode.next;
            System.out.println("Null"); 
        }
    }
    public static void main(String[] args) {
        myLinkedList list = new myLinkedList();
        list.addFirst("omkar");
        list.addFirst("is");
        list.printList();
        list.addLast("boy");

    }
}
