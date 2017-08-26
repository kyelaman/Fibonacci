package fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public abstract class TestFibonacciSeries {

    private FibonacciNumbers fibonacciNumbers;

    public abstract int getValue(int position);

    public FibonacciNumbers getFibonacciNumbers(){
        return fibonacciNumbers;
    }

    @Before
    public void setup(){
        fibonacciNumbers = new FibonacciNumbers();
    }

    @Test
    public void CanaryTest()
    {
        assertTrue(true);
    }

    @Test
    public void testFor0thNumberInSeries()
    {
        assertEquals( 1, getValue(0));
    }

    @Test
    public void testFor1stNumberInSeries()
    {
        assertEquals( 1,  getValue(1));
    }

    @Test
    public void testFor2ndNumberInSeries()
    {
        assertEquals( 2,  getValue(2));
    }

    @Test
    public void testFor3rdNumberInSeries()
    {
        assertEquals( 3,  getValue(3));
    }

    @Test
    public void testFor4thNumberInSeries()
    {
        assertEquals( 5,  getValue(4));
    }

    @Test
    public void testFor5thNumberInSeries()
    {
        assertEquals( 8, getValue(5));
    }

}