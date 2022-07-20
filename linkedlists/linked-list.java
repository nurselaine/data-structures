class MyLinkedList {

    Node head;
    int size = 0;

    static class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }


    public MyLinkedList() {
        this.head = new Node(-1);
    }

    public int get(int index) {
        Node current = this.head.next;
        System.out.print("size"+this.size);
        if(index <= this.size -1){
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
        } else {
            return -1;
        }
        System.out.print("get");
        this.displayLinkedList();

        return current.val;
    }

    public void displayLinkedList() {
        Node curr = head.next;
        String display = "head -> ";
        while (curr != null) {
            display += curr.val + " -> ";
            curr = curr.next;
        }
        System.out.println(display);
    }

    public void addAtHead(int val) {
        Node current = new Node(val);
        current.next = head.next;
        this.head.next = current;
        this.size++;
        System.out.print("addAtHead");
        this.displayLinkedList();

    }

    public void addAtTail(int val) {
        if(this.head.next == null){
            System.out.println("true");
            this.head.next = new Node(val);
        } else {
            Node current = this.head.next;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(val);
            this.size++;
        }
        System.out.print("addAttail");
        this.displayLinkedList();

    }

    public void addAtIndex(int index, int val) {
        Node current = this.head.next;
        // System.out.println("size "+this.size);

        if (index > this.size) {
            return;
        } else if (index == this.size) {
            addAtTail(val);
        } else {
            int i = 0;
            // set current to node preceding index
            while (i < index - 1){
                current = current.next;
                i++;
            }
            if(index - 1 == 0){
                Node next = current.next;
                current.next = new Node(val);
                current.next.next = next;
                this.size++;
            } else {
                Node next = current.next;
                current.next = new Node(val);
                current.next = next;
                this.size++;
            }
        }
        System.out.print("addAtIndex");
        this.displayLinkedList();
    }

    public void deleteAtIndex(int index) {
        if (index < this.size) {
            Node current = this.head.next;
            int i = 0;
            while(i < index - 1){
                current = current.next;
                i++;
            }
            Node next = current.next;
            next = next.next;
            current.next = next;
            this.size--;
        }
        System.out.print("deleteAtIndex");
        this.displayLinkedList();
    }
}