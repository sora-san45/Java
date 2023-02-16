import java.util.Scanner;

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

    void insertfront(int d){
        Node n = new Node(d);
        if(head==null){
            n.data=d;
            head=n;
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
            head=n;
        }
        else{
            Node i = head;
            while(i.next!=null){
                i=i.next;
            }
            n.prev=i;
            i.next=n;
        }
    }
    void insertbetween(int d1,int d){
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
        if(head.data==d){
            head=head.next;
            head.prev=null;
        }
        else{
            Node i=head;
            while(i.data!=d){
                i=i.next;
            }
            
            if(i.next==null){
                Node temp=i.prev;
                temp.next=null;
            }
            else{
                Node temp=i.next;
                temp.prev=i.prev;
                i.prev.next=temp;
            }
        }
    }
    void display(){
        Node i=head;
        if(head==null){
            System.out.println("Empty list");
        }
        else{
            while(i!=null){
                System.out.print(i.data+" ");
                i=i.next;
            }
            System.out.println("");
        }
    }
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        DLL obj= new DLL();
        int num;
        do{
            System.out.println("1. Insert at front"); 
            System.out.println("2. Insert at back"); 
            System.out.println("3. Insert between"); 
            System.out.println("4. Delete"); 
            System.out.println("5. Display");
            System.out.println("6. Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter data for node");
                num=sc.nextInt();
                obj.insertfront(num);
                break;

                case 2:
                System.out.println("Enter data for node");
                num=sc.nextInt();
                obj.insertend(num);
                break;

                case 3:
                System.out.println("Enter data for node");
                num=sc.nextInt();
                System.out.println("Enter node data after which new node should be added");
                int num1=sc.nextInt();
                obj.insertbetween(num1,num);
                break;

                case 4:
                System.out.println("Enter node to be deleted");
                num=sc.nextInt();
                obj.delete(num);
                break;

                case 5:
                obj.display();
                break;

                case 6:
                System.exit(0);

                default:
                System.out.println("Inavlid choice");
                break;

            }
           
        }while(true);
    }
}


