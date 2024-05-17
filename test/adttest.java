import org.junit.Test;
import uy.edu.um.prog2.adt.binarytree.*;
import uy.edu.um.prog2.adt.linkedlist.*;
import uy.edu.um.prog2.adt.queue.*;
import uy.edu.um.prog2.adt.stack.*;

import static org.junit.Assert.*;

public class adttest {
    @Test
    public void SearchBinaryTreeTest() {
        MySearchBinaryTree<Integer, Integer> sbt = new MySearchBinaryTreeImpl<>();
        sbt.add(1,12);
        int s = sbt.getRoot().getKey();
        assertEquals(s,1);
    }

    @Test
    public void ListTest(){
        MyList<String> list = new MyLinkedListImpl<>();

    }

    @Test
    public void QueueTest(){
        MyQueue<String> queue = new MyLinkedListImpl<>();

    }

    @Test
    public void StackTest(){
        MyStack<String> stack = new MyLinkedListImpl<>();

    }
}
