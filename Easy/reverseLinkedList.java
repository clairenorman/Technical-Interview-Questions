public class reverseLinkedList {
    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node next = null;
        Node curr = head;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(12);

        System.out.print("here is the current linked list: ");
        printList(head);
        head = reverseList(head);
        System.out.print("here is the reversed linked list: ");
        printList(head);
    }
}
