import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void addToFront() {
    }

    @Test
    void addToEnd() {
    }

    @Test
    void add() {
        MyLinkedList myLinkedList = new MyLinkedList();
        Node<String> node1 = new Node<>("Test node 1");
        Node<String> node2 = new Node<>("Test");
        Node<String> node3 = new Node<>("");
        Node<Integer> node4 = new Node<>(10);
        Node<Date> node5 = new Node<>(new Date());
        Node<String> node6 = new Node<>("Test node 2");
        Node<String> node7 = new Node<>("Test node 7");

        assertEquals(0, myLinkedList.getSize(), "Has to be 0");
        myLinkedList.addToFront(node1);
        assertNotNull(myLinkedList.findByName("Test node 1"));
        assertNull(myLinkedList.findByName("Test node 2"));
        myLinkedList.addToFront(null);
        myLinkedList.addToEnd(null);
        myLinkedList.add(1, null);
        assertEquals(1, myLinkedList.getSize(),"Has to  be 1");
        myLinkedList.addToFront(node2);
        assertEquals(2,myLinkedList.getSize(),"Has to be 2");
        myLinkedList.addToFront(node5);
        assertEquals(node5,myLinkedList.getHead());
        myLinkedList.addToFront(node6);

        assertNotEquals(node5,myLinkedList.getHead());
        Node tmp=myLinkedList.getHead();
        while (tmp.getNext()!=null) {
            tmp = tmp.getNext();
        }
        myLinkedList.addToEnd(node7);
        tmp = myLinkedList.getHead();
        while (tmp.getNext() != null){
            tmp = tmp.getNext();
        }

        assertNotEquals(node4,tmp);
        assertEquals(node7,tmp);

        myLinkedList.removeAll();
        assertNull(myLinkedList.getHead());

        Node<String> node10 = new Node<>("Test node 10");
        Node<String> node11 = new Node<>("Test node 11");
        Node<String> node12= new Node<>("Test node 12");
        Node<String> node13 = new Node<>("Test node 13");
        Node<String> node14= new Node<>("Test node 14");
        Node<String> node15= new Node<>("Test node 15");

        myLinkedList.addToFront(node10);
        myLinkedList.addToFront(node11);
        myLinkedList.add(0,node12);
        assertEquals(node12,myLinkedList.getHead());
        myLinkedList.add(49812,node14);
        tmp=myLinkedList.getHead();
        while (tmp.getNext()!=null) {
            tmp = tmp.getNext();
        }
        assertEquals(node14,tmp);
        myLinkedList.add(2,node15);
        assertEquals(node15,myLinkedList.getHead().getNext().getNext());
    }

    @Test
    void getSize() {
        MyLinkedList myLinkedList = new MyLinkedList();
        assertEquals(0, myLinkedList.getSize(), "Has to be 0");
        Node<String> node1 = new Node<>("Test node 1");
        Node<String> node2 = new Node<>("Test node 2");
        Node<String> node3 = new Node<>("Test node 3");
        myLinkedList.addToFront(node1);
        assertEquals(1, myLinkedList.getSize(), "Has to be 1");
        myLinkedList.addToEnd(node2);
        assertEquals(2, myLinkedList.getSize(), "Has to be 2");
        myLinkedList.add(1, node3);
        assertEquals(3, myLinkedList.getSize(), "Has to be 3");
        myLinkedList.remove(node1);
        assertEquals(2, myLinkedList.getSize(), "Has to be 2");
        myLinkedList.removeAll();
        assertEquals(0, myLinkedList.getSize(), "Has to be 0");
    }

    @Test
    void print() {

    }

    @Test
    void remove() {
        MyLinkedList myLinkedList = new MyLinkedList();
        Node<String> node1 = new Node<>("Test node 1");
        Node<String> node2 = new Node<>("Test");
        Node<String> node3 = new Node<>("");
        Node<Integer> node4 = new Node<>(10);
        Node<Date> node5 = new Node<>(new Date());

        myLinkedList.addToFront(node1);
        assertTrue(myLinkedList.remove(node1));
        assertFalse(myLinkedList.remove(node1));

        myLinkedList.removeAll();
        myLinkedList.add(44193, node1);
        assertEquals(node1, myLinkedList.getHead());
    }

    @Test
    void removeAll() {
    }

    @Test
    void findByName() {
    }
}