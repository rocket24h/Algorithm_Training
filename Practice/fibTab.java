public class fibTab {
    public static void main(String args[]){
        System.out.println(fibFunc(6));
        System.out.println(fibFunc(7));
        System.out.println(fibFunc(8));
        System.out.println(fibFunc(50));
    }

    public static long fibFunc(int n){
        long[] arr = new long[n + 1];
        arr[1] = 1;
        for(int i = 0; i < n; i++){
            if(i + 1 <= n)
                arr[i + 1] += arr[i];
            if(i + 2 <= n)
                arr[i + 2] += arr[i];
        }
        return arr[n];
    }
    
}
