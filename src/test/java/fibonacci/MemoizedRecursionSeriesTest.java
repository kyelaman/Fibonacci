package fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MemoizedRecursionSeriesTest extends TestFibonacciSeries {

    public int getValue(int position){
        return getFibonacciNumbers().getValueMemoizedRecursion(position);
    }

    @Test
    public void testPerformance(){
		int position = 45;
        long recursiveTime = computeTime(() -> getFibonacciNumbers().getValueRecursive(position)); 
        long memoizedTime = computeTime(() -> getFibonacciNumbers().getValueMemoizedRecursion(position)); 
        assertTrue(recursiveTime > 10 * memoizedTime);
    }

    private long computeTime(Runnable code) {
        long startTime = System.nanoTime();
        code.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
     }
}