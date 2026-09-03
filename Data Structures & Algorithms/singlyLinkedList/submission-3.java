class LinkedList {
    Node tail, head;
    int size;

    private class Node {
        int val;
        Node next;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public LinkedList() {
        this.head = new Node(-1, null);
        this.tail = head;
        this.size = 0;
    }

    public int get(int index) {
        if (index >= this.size) {
            return -1;
        }
        if (index == this.size-1) {
            return this.tail.val;
        }

        Node cur = this.head.next;
        int count = 0;
        while (count < index) {
            cur = cur.next;
            count++;
        }
        return cur.val;
    }

    public void insertHead(int val) {
        Node n = new Node(val, this.head.next);
        if (this.tail == this.head) {
            this.tail = n;
        }
        this.head.next = n;
        this.size++;
    }

    public void insertTail(int val) {
        Node n = new Node(val, null);
        this.tail.next = n;
        this.tail = n;
        this.size++;
    }

    public boolean remove(int index) {
        System.out.println("index: " + index);
        if (index < 0 || index >= this.size) {
            return false;
        }
        Node prev = this.head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        if (prev.next == this.tail) {
            this.tail = prev;
        }

        prev.next = prev.next.next;
        this.size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> a = new ArrayList<>(this.size);
        Node n = this.head.next;
        while (n != null) {
            a.add(n.val);
            n = n.next;
        }
        return a;
    }
}
