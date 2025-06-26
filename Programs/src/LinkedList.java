public class LinkedList {
    Node head;

    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;

    }

    public void delete(int data){
        if(head==null){
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }
        Node current=head;
        while(current.next!=null  &&current.next.data!=data){
            current=current.next;
        }
        if(current.next!=null){
            current.next=current.next.next;
        }
    }

    public void display(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println(" null");
    }


//    Basic Singllly Linkedlist Implementation

    //insert at beginning
    public void inserAtBeginnig(int data){
        ListNode node=new ListNode(data);
        node.next=head;
        head=newNode;

    }

    public void inssertAtEnd(int data){
         ListNode newNode=new ListNode(data);
         if(head==null){
             head=newNode;
             return;
         }
         Node current=head;
         while(current.next!=null){
             current=current.next;
         }
         current.next=newNode;
    }
    public void delete(int key){
        Node current=head;
        Node prev=null;

        if(current!=null  && current.data==key){
            head=current.next;
            return;
        }
    }
}
