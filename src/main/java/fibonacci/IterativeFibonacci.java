package fibonacci;

public class IterativeFibonacci {

    /**
     * Часова складність: O(n), де n - номер числа Фібоначчі, для якого потрібно знайти значення.
     *
     * Просторова складність: O(1).
     * */

    public  int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}
