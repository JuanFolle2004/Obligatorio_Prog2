import org.junit.Before;
import org.junit.Test;
import uy.edu.um.prog2.adt.binarytree.*;

import static org.junit.Assert.*;

public class SBTtest {

    public MySearchBinaryTree<Integer, Integer> sbt = null;

    @Before
    public void initsbt() {
        sbt = new MySearchBinaryTreeImpl<>();
        sbt.add(4,25);
        sbt.add(2,8);
        sbt.add(6,33);
        sbt.add(3,50);
        sbt.add(1,13);
        sbt.add(5,24);
    }

    @Test
    public void addTest() {
        int s = sbt.getRoot().getKey();
        int d = sbt.getRoot().getLeft().getKey();
        int r = sbt.getRoot().getRight().getLeft().getValue();
        assertEquals(s,4);
        assertEquals(d,2);
        assertEquals(r,24);
    }

    @Test
    public void findTest() {
        int s = sbt.find(3);
        int d = sbt.find(4);
        assertEquals(s,50);
        assertEquals(d,25);
        assertEquals(sbt.find(8),null);
    }


    @Test
    public void containsTest() {
        assertTrue(sbt.contains(2));
        assertFalse(sbt.contains(8));
    }


    @Test
    public void removeTest() {
        assertTrue(sbt.contains(2));
        assertFalse(sbt.contains(8));
    }


    public void orderTest(){
        assertArrayEquals(sbt.preOrder(), [4,2,1,3,6,5]);
        assertArrayEquals(sbt.inOrder(), );
        assertArrayEquals(sbt.postOrder(), );
    }

}
