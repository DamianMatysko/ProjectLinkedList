public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        Node<String> n1 = new Node("Filip");
        Node<String> n2 = new Node("Eva");
        Node<String> n3 = new Node("Jaro");
        Node<String> n4 = new Node("Jozef");
        Node<String> n5 = new Node("Pista");
        Node<String> n6 = new Node("add");
        linkedList.addToFront(n1);
        linkedList.addToFront(n2);
        linkedList.addToFront(n3);
        //linkedList.addToEnd(n2);//diasho
        linkedList.add(1, n6);
        //linkedList.add(1, n4);
        linkedList.remove(n1);
        System.out.println(linkedList.findByName("Eva").getData());


        linkedList.print();
        System.out.println(linkedList.getSize());
    }
}
