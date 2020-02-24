public class Node<T> {
    private String data;
    private Node next;

    public Node(String n) {
        this.data = n;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
