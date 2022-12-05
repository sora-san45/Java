import java.util.*;

public class DLL {

    class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            data=d;
            prev=null;
            next=null;
        }
    }

    Node head;
    Node tail;

    void insertfront(int d){
        Node n = new Node(d);
        if(head==null){
            n.data=d;
            head=tail=n;
        }
        else{
            Node temp=head;
            head=n;
            temp.prev=n;
            head.next=temp;
        }
    }

    void insertend(int d){
        Node n = new Node(d);
        if(head==null){
            n.data=d;
            head=tail=n;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }
    void insertb(int d1,int d){
        Node n= new Node(d);
        if(head==null){
            System.out.println("Empty List");
        }
        else{
            Node i = head;
            while(i.data!=d1){
                i=i.next;
            }
            Node temp=i.next;
            temp.prev=n;
            n.next=temp;
            n.prev=i;
            i.next=n;
        }
    }
    void delete(int d){
        Node i=head;
        while(i.data!=d){
            i=i.next;
        }
        Node temp=i.next;
        temp.prev=i.prev;
        i.prev.next=temp;
    }
    void display(){
        Node i=head;
        if(head==null){
            System.out.println("Empty list");
        }
        else{
            while(i!=null){
                System.out.println(i.data);
                i=i.next;
            }
        }
    }
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        DLL obj= new DLL();
        while(true){
            System.out.println("1. Insert at front"); 
            System.out.println("2. Insert at back"); 
            System.out.println("3. Insert at bet"); 
            System.out.println("4. Delete"); 
            System.out.println("5.Display");
            int op=sc.nextInt();
            if(op==1){
                System.out.println("Enter data for node");
                int num=sc.nextInt();
                obj.insertfront(num);
            }
            else if(op==2){
                System.out.println("Enter data for node");
                int num=sc.nextInt();
                obj.insertend(num);
            }
            else if(op==3){
                System.out.println("Enter data for node");
                int num=sc.nextInt();
                System.out.println("Enter node data after which new node should be added");
                int num1=sc.nextInt();
                obj.insertb(num1,num);
            }
            else if(op==4){
                System.out.println("Enter node to be deleted");
                int num=sc.nextInt();
                obj.delete(num);
            }
            else if(op==5){
                obj.display();
            }
            else if(op==6){
                break;
            }else{
                System.out.println("Invalid option");
            }
        }
    }
}
