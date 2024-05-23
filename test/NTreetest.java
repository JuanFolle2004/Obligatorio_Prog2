import org.junit.Before;
import uy.edu.um.prog2.adt.ntree.TreeImpl;

public class NTreetest {

    public TreeImpl<Integer> ntree = null;

    @Before
    public void initntree() {

        ntree = new TreeImpl<>(1);
        ntree.add(2,1);
        ntree.add(4,1);
        ntree.add(10,1);
        ntree.add(20,1);
    }




}
