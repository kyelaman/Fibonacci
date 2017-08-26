package fibonacci;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.stream.IntStream;

public class FibonacciNumbers {

     Map<Integer, Integer> series = new HashMap<Integer, Integer>(){
        {
            put(0, 1);
            put(1, 1);
        }
    };

    public int getValueIterative(int position) {
        Pair<Integer, Integer> initial = Pair.of(1, 1);
        return IntStream.rangeClosed(2, position)
						.mapToObj(i -> Pair.of(i, 0)) 
						.reduce(initial, (prev, ignore) -> Pair.of(prev.getRight(), prev.getLeft() + prev.getRight()))
						.getRight();
    }

    public int getValueRecursive(int position){
        if( position == 0 || position == 1 )
            return 1;
        return getValueRecursive(position - 1) + getValueRecursive( position - 2);
    }

    public int getValueMemoizedRecursion(int position){
       return series.computeIfAbsent(position, n -> (getValueMemoizedRecursion(n - 1)+ getValueMemoizedRecursion(n - 2)));
    }
}