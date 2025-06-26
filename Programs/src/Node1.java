public class Node1 {
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }

    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
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
        newNode.prev=current;
    }

    public void delete(int data){
        if(head==null){
            return;
        }
        Node current=head;
        if(current.data==data){
            head=current.next;
            if(head!=null){
                head.prev=null;
            }
            return;
        }
        while(current!=null  && current.data!=data){
            current=current.next;
        }
        if(current==null){
            return;
        }

        if(current.next!=null){
            current.next.prev=current.prev;
        }
        current.prev.next=current.next;
    }
    public void displayForward(){
        Node current=head;
        System.out.println(" ");
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println("unull");
    }
}
