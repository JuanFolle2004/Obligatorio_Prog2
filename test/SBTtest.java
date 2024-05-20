import org.junit.Test;
import uy.edu.um.prog2.adt.binarytree.*;

import static org.junit.Assert.*;

public class SBTtest {

    public MySearchBinaryTree<Integer, Integer> sbt = new MySearchBinaryTreeImpl<>();

    @Test
    public void addTest() {
        sbt.add(4,25);
        sbt.add(2,8);
        sbt.add(6,33);
        sbt.add(3,50);
        sbt.add(1,13);
        sbt.add(5,24);
        int s = sbt.getRoot().getKey();
        int d = sbt.getRoot().getLeft().getKey();
        int r = sbt.getRoot().getRight().getLeft().getKey();
        assertEquals(s,4);

    }






}
