public class DLL {
    Node head;
    private int size;

    DLL() {   ///faltu hai
        size = 0;
    }

    class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;    //---------<
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.prev = currNode;  //--------<
    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
        if (head != null) {
            head.prev = null;  //---------<
        }
    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        if (currNode.prev != null) {
            currNode.prev.next = null;
        } else {
            head = null;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " <--> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void insertAtIndex(String data, int index) {
        Node newNode = new Node(data);
        Node temp = head;

        if (index == 1) {
            addFirst(data);
        } else {
            for (int i = 2; i <= index - 1; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Invalid location");
            } else {
                newNode.next = temp.next;
                newNode.prev = temp;
                if (temp.next != null) {
                    temp.next.prev = newNode;
                }
                temp.next = newNode;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        DLL list = new DLL();

        list.addFirst("vishal");
        list.addFirst("vijay");
        list.addFirst("chetan");
        list.addFirst("roshni");
        list.addLast("jalaj");

        list.printList();

        list.deleteAtFirst();
        list.deleteAtLast();

        list.printList();

        list.insertAtIndex("jayveer", 3);
        list.printList();

        System.out.println(list.getSize());
    }
}
