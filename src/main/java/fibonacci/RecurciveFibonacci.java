package fibonacci;

public class RecurciveFibonacci {

    /**
     * Часова складність: О(2^n).
     *
     * Просторова складність: О(n), де n - глибина рекурсії.
     * */
    public  int recursiveFibonacci(int n) {
        if (n <=1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

}
