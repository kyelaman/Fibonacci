package fibonacci;

public class RecursionFibonacciSeriesTest extends TestFibonacciSeries {
    
    public int getValue(int position){
        return  getFibonacciNumbers().getValueRecursive(position);
    }
}
