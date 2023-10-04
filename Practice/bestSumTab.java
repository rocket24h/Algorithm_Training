import java.util.List;
import java.util.ArrayList;

public class bestSumTab {
    public static void main(String args[]) {
        System.out.println(bestSumFunc(7, new int[] { 5, 3, 4, 7 })); // [7]
        System.out.println(bestSumFunc(8, new int[] { 2, 3, 5 })); // [3, 5]
        System.out.println(bestSumFunc(8, new int[] { 1, 4, 5 })); // [4, 4]
        System.out.println(bestSumFunc(100, new int[] { 1, 2, 5, 25 })); // [25, 25, 25, 25]
    }
    
    public static List<Integer> bestSumFunc(int targetSum, int[] numbers) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < targetSum + 1; i++)
            arr.add(null);
        arr.set(0, new ArrayList<>());
        for (int i = 0; i < targetSum + 1; i++) {
            if (arr.get(i) != null) {
                for (int num : numbers) {
                    if (i + num <= targetSum)
                    {
                        List<Integer> temp = new ArrayList<>(arr.get(i));
                        temp.add(num);
                        if (arr.get(i + num) == null || arr.get(i + num).size() > temp.size())
                            arr.set(i + num, temp);
                    }
                }
            }
        }
        return arr.get(targetSum);
    }
}
