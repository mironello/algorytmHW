package fibonacci;

public class DynamicFibonacci {
    /**
     * Часова складність: O(n).
     *
     * Просторова складність: O(n), де n - кількість чисел Фібоначчі, для яких створюється таблиця
     * */
    public int dynamicFibonacci(int n){
        if (n==1) {
            return 0;
        }
        int[]fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <=n ; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}
