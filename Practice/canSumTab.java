public class canSumTab {
    public static void main(String args[]) {
        System.out.println(canSumFunc(7, new int[] { 2, 3 })); // true
        System.out.println(canSumFunc(7, new int[] { 5, 3, 4, 7 })); // true
        System.out.println(canSumFunc(7, new int[] { 2, 4 })); // false
        System.out.println(canSumFunc(8, new int[] { 2, 3, 5 })); // true
        System.out.println(canSumFunc(300, new int[] { 7, 14 })); // false
    }

    public static boolean canSumFunc(int targetSum, int[] numbers) {
        boolean[] arr = new boolean[targetSum + 1];
        arr[0] = true;
        for (int i = 0; i < targetSum + 1; i++) {
            if (arr[i] == true) {
                for (int num : numbers) {
                    if (i + num <= targetSum)
                        arr[i + num] = true;
                }
            }
        }
        return arr[targetSum];
    }
}
