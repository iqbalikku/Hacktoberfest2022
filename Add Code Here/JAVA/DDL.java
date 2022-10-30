import java.util.Scanner;

class Node {
    int data;
    Node previous;
    Node next;
}

public class DLL {
    static Node head, tail = null;

    static void addNode(int data) {
        Node n = new Node();
        n.data = data;
        if (head == null) {
            head = tail = n;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = n;

            n.previous = tail;

            tail = n;

            tail.next = null;
        }

    }

    static void deleteNode(int data) {
        Node pre = head;
        Node current = head.next;
        if (head.data == data) {
            if (head.next == null) {
                System.out.println(head.data + " is deleted!");
                head = null;
            }
            else {
                System.out.println(head.data + " is deleted!");
            head = head.next;
            head.previous = null;
        }
    } else {
        while (current!= null) {
            if (current.data == data) {
                System.out.println(current.data + " is deleted!");
                pre.next = current.next;
                return;
            }
            pre = pre.next;
            current = current.next;
        }
        System.out.println(data + "is not found");
        }
    }

    static void display() {
        System.out.print("\nDouble Linked List : ");
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        int data,ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Operations \n1.Insertion\n2.Deletion\n3.Display\n4.EXIT");

        do{
            System.out.print("\nChoose the operation : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:System.out.print("Enter the data of the new node : ");
                    data = sc.nextInt();
                    addNode(data);
                    break;
                case 2:
                    if (head == null)
                        System.out.println("LIST IS EMPTY!");
                    else
                        {System.out.print("Enter the data of to be deleted : ");
                        data = sc.nextInt();
                        deleteNode(data);
                    }
                    break;
                case 3:display();
                    break;
                case 4:
                    System.out.println("C U SOON!");
                    System.exit(0);
                default:
                    System.out.println("Wrong input!");
            }
        } while (ch != 4);

    }
}
