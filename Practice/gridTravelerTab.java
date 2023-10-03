public class gridTravelerTab {
    public static void main (String args[]){
        System.out.println(gridTravelerFunc(1, 1));
        System.out.println(gridTravelerFunc(2, 3));
        System.out.println(gridTravelerFunc(3, 2));
        System.out.println(gridTravelerFunc(3, 3));
        System.out.println(gridTravelerFunc(18, 18));
    }

    public static long gridTravelerFunc(int m, int n){
        long[][] arr = new long[m + 1][n + 1];
        arr[1][1] = 1;
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i + 1 <= m)
                    arr[i + 1][j] += arr[i][j];
                if(j + 1 <= n)
                    arr[i][j + 1] += arr[i][j];
            }
        }
        return arr[m][n];
    }
}