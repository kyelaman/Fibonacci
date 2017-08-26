package fibonacci;

public class IterativeFibonacciSeriesTest extends TestFibonacciSeries {

    public int getValue(int position){
        return getFibonacciNumbers().getValueIterative(position);
    }
}
