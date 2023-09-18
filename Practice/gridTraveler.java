//package Practice;
import java.util.HashMap;

public class gridTraveler {
        public static void main(String[] args){
            HashMap<String, Long> memo = new HashMap<String, Long>();
            System.out.println(gridTravelerFunc(1, 1, memo));
            System.out.println(gridTravelerFunc(2, 3, memo));
            System.out.println(gridTravelerFunc(3, 2, memo));
            System.out.println(gridTravelerFunc(3, 3, memo));
            System.out.println(gridTravelerFunc(18, 18, memo));
        }

        public static long gridTravelerFunc(int m, int n, HashMap<String, Long> memo) {
            if (m == 1 && n == 1) return 1;
            if (m == 0 || n == 0) return 0;
            String key = m + "," + n;
            if (memo.containsKey(key)) return memo.get(key);
            memo.put(key, gridTravelerFunc(m-1, n, memo) + gridTravelerFunc(m, n-1, memo));
            return gridTravelerFunc(m-1, n, memo) + gridTravelerFunc(m, n-1, memo);
        }

}
