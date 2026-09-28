import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLists {

    static Node createList(Scanner sc, int n) {
        Node head = null;
        Node current = null;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }

        return head;
    }

    static Node merge(Node list1, Node list2) {

        Node dummy = new Node(0);
        Node current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    static void display(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first list: ");
        int n1 = sc.nextInt();

        System.out.println("Enter first sorted list:");
        Node list1 = createList(sc, n1);

        System.out.print("Enter size of second list: ");
        int n2 = sc.nextInt();

        System.out.println("Enter second sorted list:");
        Node list2 = createList(sc, n2);

        System.out.println("\nList 1:");
        display(list1);

        System.out.println("List 2:");
        display(list2);

        Node result = merge(list1, list2);

        System.out.println("Merged list:");
        display(result);

        sc.close();
    }
}