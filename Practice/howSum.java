//package Practice;
import java.util.*;

public class howSum {
    public static void main(String args[]){
        HashMap<Integer, List<Integer>> memo = new HashMap<>();
        //System.out.println(howSumFunc(7, new int[] { 2, 3 }, memo));
        //System.out.println(howSumFunc(7, new int[] { 5, 3, 4, 7 }, memo));
        //System.out.println(howSumFunc(7, new int[] { 2, 4 }, memo));
        //System.out.println(howSumFunc(8, new int[] { 2, 3, 5 }, memo));
        //System.out.println(howSumFunc(300, new int[] { 7, 14 }, memo));
    }

    public static List<Integer> howSumFunc(int targetSum, int[] numbers, HashMap<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetSum))
            return memo.get(targetSum);
        if (targetSum == 0)
            return new ArrayList<>();
        if (targetSum < 0)
            return null;
        for (int num : numbers) {
            int remainder = targetSum - num;
            List<Integer> remainderResult = howSumFunc(remainder, numbers, memo);
            if (remainderResult != null) {
                remainderResult.add(num);
                memo.put(targetSum, remainderResult);
                return remainderResult;
            }
        }
        memo.put(targetSum, null);
        return null;
    }
}
