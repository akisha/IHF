import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertEquals;

public class MatrixTest {

    @Test
    public void mulDD(){
        DenseMatrix m1 = new DenseMatrix("D1.txt");
        DenseMatrix m2 = new DenseMatrix("D2.txt");
        DenseMatrix expected = new DenseMatrix("resultDD.txt");
        //assertEquals(expected, m1.mulDD(m2));
    }

}
