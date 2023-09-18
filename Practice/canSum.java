import java.util.HashMap;

public class canSum {
    public static void main(String[] args) {
        HashMap<Integer, Boolean> memo = new HashMap<>();
        //System.out.println(canSumFunc(7, new int[] { 2, 3 }, memo));
        //System.out.println(canSumFunc(7, new int[] { 5, 3, 4, 7 }, memo));
        //System.out.println(canSumFunc(7, new int[] { 2, 4 }, memo));
        //System.out.println(canSumFunc(8, new int[] { 2, 3, 5 }, memo));
        System.out.println(canSumFunc(300, new int[] { 7, 14 }, memo));
    }

    public static boolean canSumFunc(int targetSum, int[] numbers, HashMap<Integer, Boolean> memo) {
        if (memo.containsKey(targetSum))
            return memo.get(targetSum);
        if (targetSum == 0)
            return true;
        if (targetSum < 0)
            return false;
        for (int num : numbers) {
            int remainder = targetSum - num;
            if (canSumFunc(remainder, numbers, memo) == true) {
                memo.put(targetSum, true);
                return true;
            }
        }
        memo.put(targetSum, false);
        return false;
    }

}
