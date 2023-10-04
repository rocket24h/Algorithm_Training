import java.util.ArrayList;
import java.util.List;

public class howSumTab {
    public static void main(String args[]){
        System.out.println(howSumFunc(7, new int[] { 2, 3 })); // [3, 2, 2]
        System.out.println(howSumFunc(7, new int[] { 5, 3, 4, 7 })); // [4, 3]
        System.out.println(howSumFunc(7, new int[] { 2, 4 })); // null
        System.out.println(howSumFunc(8, new int[] { 2, 3, 5 })); // [2, 2, 2, 2]
        System.out.println(howSumFunc(300, new int[] { 7, 14 })); // null
    }

    public static List<Integer> howSumFunc(int targetSum, int[] numbers) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < targetSum + 1; i++)
            arr.add(null);
        arr.set(0, new ArrayList<>());
        for (int i = 0; i < targetSum + 1; i++) {
            if (arr.get(i) != null) {
                for (int num : numbers) {
                    if (i + num <= targetSum) {
                        List<Integer> temp = new ArrayList<>(arr.get(i));
                        temp.add(num);
                        arr.set(i + num, temp);
                    }
                }
            }
        }
        return arr.get(targetSum);
    }
    
}
