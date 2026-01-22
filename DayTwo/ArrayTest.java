import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ArrayTest{

    @Test
    public void testThatGetMaximumMethodExist(){
        int[][] array = {{2,3,4},{5,6,5}};
        Assertions.assertNotNull(Array.getMaximum(array)); 
    }

    @Test
    public void testThatGetMaximumMethodReturnsCorrectValue(){
        int[][] array = {{2,3,4},{5,6,5}};

        int actual = Array.getMaximum(array);
        int expected = 16;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testSingleRowArray(){
        int[][] array = {{2,3,4}};

        int actual = Array.getMaximum(array);
        int expected = 9;
        Assertions.assertEquals(actual,expected);
    }
}
