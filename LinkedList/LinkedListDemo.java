import java.util.Scanner;

// class Node{
//     int data; // Node Data Part
//     Node next; // Node Reference / Next Node Reference store here
    
//     //Constructor
//     Node(int data){
//         this.data=data;
//         next=null;
//     }
// }

class Node<T>{
    T data; // Node Data Part
    Node next; // Node Reference / Next Node Reference store here
    
    //Constructor
    Node(T data){
        this.data=data;
        next=null;
    }
}

class LinkedListOperations<T>{

    // We need a start pointer (Reference of first Node)
    Node<T> start;

    //print LL
    void print(){
        Node<T> temp = start;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    //delete at begining
    void deleteAtBeg(){
        if(start==null){
            System.out.println("LL is Empty....");
            return;
        }
        if(start.next==null){
            //Single node
            start = null;
            return;
        }
        Node<T> temp = start;
        start=start.next;
        temp.next=null;
        temp=null;
    }
    // delete at middle
    void deleteAtMid(int pos){
        if(start==null){
            System.out.println("LL is Empty....");
            return;
        }
        if(start.next==null){
            //Single node
            start = null;
            return;
        }
        Node<T>temp = start;
        Node<T>temp2=start;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
            temp2=temp;
        }
        temp2=temp2.next;
        temp.next=temp.next.next;
        temp2.next=null;

    }
    //delete at end
    void deleteAtEnd(){
        if(start==null){
            System.out.println("LL is Empty....");
            return;
        }
        if(start.next==null){
            //Single node
            start = null;
            return;
        }
        Node<T> temp =start;
        Node<T> temp2 =start;
        while(temp.next!=null){
            temp2=temp;
            temp=temp.next;
        }
        temp2.next=null;
        temp=null;
    }
    
    //add new node at start in LL
    void AddAtBegin(Node<T> node){
        if(start==null){
            start=node;
        }
        else{
            node.next=start;
            start=node;
        }
    }

    //add at Middle in LL
    void addAtMid(Node<T> node,int position){
        //if position is add at Begining
        //reach till position then add it
        if(position==0){
            addAtEnd(node);
            return;
        }
        Node<T> temp = start;
        int i=1;
        while(i<position){
            temp=temp.next;
            i++;
        }
        node.next=temp.next;
        temp.next=node;
    }

    //add New Node at end in LL
    void addAtEnd(Node<T> node){
        if(start==null){
            //LinkedList is Empty
            start = node;// node reference will be copy to start node
        }
        else{
            //If LL is not empty
            Node<T> temp = start; // first node reference copy to the temp node
            //temp node is pointing to the first node
            while(temp.next!=null){
                temp=temp.next; // traverse node by node
            }
            temp.next=node;
        }
    }
}


public class LinkedListDemo{
    public static void main(String[] args) {
        // Node<String> node =new Node("Amit");
        // Node<Integer> node2 =new Node(3);
        Scanner scanner = new Scanner(System.in);
        LinkedListOperations<Integer> opr = new LinkedListOperations<>();
        while(true){
            System.out.println("1. Add a new Node at End in LL");
            System.out.println("2. Print LL");
            System.out.println("3. Add a new Node at Begining in LL");
            System.out.println("4. Add Position Wise in LL");
            System.out.println("5. Delete node at begining in LL");
            System.out.println("6. Delete node at end in LL");
            System.out.println("7. Delete node at Mid in LL");
            System.out.println("10 Exit");
            System.out.println("Enter the choice");
            int choice = scanner.nextInt();
            int data;
            Node<Integer> node;
            int pos;
            switch(choice){
                case 1:
                    System.out.println("Enter the Date for the node...");
                    data = scanner.nextInt();
                    node = new Node<>(data);
                    opr.addAtEnd(node);
                    break;
                case 2:
                    opr.print();
                    break;
                case 3:
                    System.out.println("Enter the Date for the node...");
                    data = scanner.nextInt();
                    node = new Node<>(data);
                    opr.AddAtBegin(node);
                    break;
                case 4:
                    System.out.println("Enter the Date for the node...");
                    data = scanner.nextInt();
                    System.out.println("Enter the position");
                    pos = scanner.nextInt();
                    node = new Node<>(data);
                    opr.addAtMid(node, pos);
                    break;
                case 5:
                    opr.deleteAtBeg();
                    break;
                case 6:
                    opr.deleteAtEnd();
                    break;
                case 7:
                    System.out.println("Enter the position");
                    pos = scanner.nextInt();
                    opr.deleteAtMid(pos);
                case 10:
                    return;
            }
        }
    }
}