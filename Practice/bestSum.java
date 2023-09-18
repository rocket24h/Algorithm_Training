import java.util.*;

public class bestSum {
    public static void main(String args[]) {
        HashMap<Integer, List<Integer>> memo = new HashMap<>();;
        //System.out.println(bestSumFunc(7, new int[] { 5, 3, 4, 7 }, memo));
        //System.out.println(bestSumFunc(8, new int[] { 2, 3, 5 }, memo));
        //System.out.println(bestSumFunc(8, new int[] { 1, 4, 5 }, memo));
        System.out.println(bestSumFunc(100, new int[] { 1, 2, 5, 25 }, memo));
    }

    public static List<Integer> bestSumFunc(int targetSum, int[] numbers, HashMap<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetSum))
            return memo.get(targetSum);
        if(targetSum == 0)
            return new ArrayList<>();
        if(targetSum < 0)
            return null;
        
        List<Integer> shortestCombination = null;
        for (int num : numbers) {
            int remainder = targetSum - num;
            List<Integer> remainderCombination = bestSumFunc(remainder, numbers, memo);
            if (remainderCombination != null) {
                List<Integer> combination = new ArrayList<>(remainderCombination);
                combination.add(num);
                if (shortestCombination == null || combination.size() < shortestCombination.size()) {
                    shortestCombination = combination;
                }
            }
        }
        memo.put(targetSum, shortestCombination);
        return shortestCombination;
    }
}
