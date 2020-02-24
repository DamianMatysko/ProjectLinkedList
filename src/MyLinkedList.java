public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public void addToFront(Node node) {
        if (node == null) {
            return;
        }
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void addToEnd(Node node) {
        if (node == null) {
            return;
        }
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public void add(int position, Node node) {
        if (node == null) {
            return;
        }
        if (position <= 0) {
            addToFront(node);
        } else if (position >= getSize()) {
            addToEnd(node);
        } else {
            Node tmp = head;
            for (int i = 1; i < position; i++) {
                tmp = tmp.getNext();
            }
                node.setNext(tmp.getNext());
                tmp.setNext(node);

        }

    }

    public int getSize() {
        Node temp = head;
        if (temp == null) {
            System.out.println("empty!");
            return 0;
        }
        int count = 0;
        while (temp != null) {
            temp = temp.getNext();
            count++;
        }
        return count;
    }

    public void print() {
        if (head == null) {
            System.out.println("Link list Is empty no item to print!");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
    }

    public boolean remove(Node node) {
        if (head == null || node == null) {
            return false;
        }
        if (head == node) {
            head = node.getNext();
            return true;
        }
        Node temp = head;
        while (temp.getNext() != node) {
            temp = temp.getNext();
            if (temp == null) {
                return false;
            }
        }
        temp.setNext(temp.getNext().getNext());
        return true;
    }

    public void removeAll() {
        head = null;
    }

    public Node findByName(String name) {
        if (name == null || head == null) {
            return null;
        }
        Node tmp = head;
        if (tmp.getData() instanceof  String){
            return null;
        }
        while (tmp != null) {
            if (tmp.getData().equals(name)) {
                return tmp;
            }
            tmp=tmp.getNext();
        }
        return null;
    }

}
