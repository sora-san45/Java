public class SLL{
    static class Node{
        int data;
        Node next;

        public Node(int d){
            data=d;
            next=null;
        }
    }

    static Node head;
    static Node tail;
    public static void addfront(int d){
        Node newnode= new Node(d);
        if (head==null){
            newnode.next=null;
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;      
        }

    }
    public static void addend(int d){
        Node newnode= new Node(d);
        if(head==null){
            newnode.next=null;
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=null;
            tail.next=newnode;
            tail=newnode;
        }
    }
    public static void delfront(){
        if(head==null){
            System.out.println("Empty");
        }
        else{
            Node temp=head;
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
            }
            System.out.println("Item deleted :"+temp.data);           
        }
    }
    public static void delend(){
        if(head==null){
            System.out.println("Empty");
        }
        else{
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
            }           
        }
    }
}
