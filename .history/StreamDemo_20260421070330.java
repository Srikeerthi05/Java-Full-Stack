import java.util.*;
import java.util.stream.*;

class StreamDemo {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int res=list.stream()
            .filter(n-> n%2==0)
            .map(n->n*2)
            .reduce(0,(a,b)->a+b);
    }
}