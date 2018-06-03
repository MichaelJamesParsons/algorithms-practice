package LinkedList;

class Node {
    public int val;
    public Node next;

    Node(int val) {
        this.val = val;
    }
}

public class LinkedList {
    private Node head;

    private Node getNode(int index) {
        Node n = this.head;
        int i = 0;

        if (index < 0) {
            return null;
        }

        while(n != null) {
            if (i == index) {
                return n;
            }

            n = n.next;
            i++;
        }

        return null;
    }

    public int get(int index) {
        Node n = this.getNode(index);

        if (n != null) {
            return n.val;
        }

        return -1;
    }

    public void addAtHead(int val) {
        Node n = new Node(val);

        if (this.head != null) {
            n.next = this.head;
        }

        this.head = n;
    }

    public void addAtTail(int val) {
        Node n = this.head;

        if (n == null) {
            this.head = new Node(val);
            return;
        }

        while(n.next != null) {
            n = n.next;
        }

        n.next = new Node(val);
    }

    public void addAtIndex(int index, int val) {
        Node nodeToAdd = new Node(val);

        if (index == 0) {
            if (this.head != null) {
                nodeToAdd.next = this.head;
            }

            this.head = nodeToAdd;
            return;
        }

        Node n = this.getNode(index - 1);

        if (n != null) {
            nodeToAdd.next = n.next;
            n.next = nodeToAdd;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (this.head != null) {
                this.head = this.head.next;
            }

            return;
        }

        Node n = this.getNode(index - 1);

        if (n != null && n.next != null) {
            n.next = n.next.next;
        }
    }
}
