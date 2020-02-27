package test;
import main.Solution;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class SwapTest {

    public Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void testBubbleSortGetsCorrectNumberOfSwaps(){
        int[] arr = {7,1,3,2,4,5,6};
        assertEquals(5, solution.minSwaps(arr));
    }

    @Test
    public void testMinNumberOfSwaps(){
        int[] arr = {1};
        assertEquals(0, solution.minSwaps(arr));
    }

    

}
