// Memoization
import java.util.HashMap;

public class fibonacci {
    
    public static void main(String[] args) {
        HashMap<Long, Long> memo = new HashMap<Long, Long>();    
        System.out.println(fib(6, memo));
        System.out.println(fib(7, memo));
        System.out.println(fib(50, memo));
        System.out.println(fib(50));
    }

    public static long fib(long n, HashMap<Long, Long> memo ) {
        if (n <= 2) return 1;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long result = fib(n-1, memo) + fib(n-2, memo);
        memo.put(n, result);

        return result;
    }

    public static long fib(long n) {
        if (n <= 2) return 1;

        return fib(n-1) + fib(n-2);
    }
}



