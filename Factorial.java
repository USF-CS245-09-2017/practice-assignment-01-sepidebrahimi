public class Factorial {

    public int factorial(int n, String type) {
        if (type == "recursive") {
            return factorial_recursive(n);
        }
        return factorial_iterative(n);

    }

    public int factorial_recursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial_recursive(n - 1);

    }

    public int factorial_iterative(int n) {
        int total = n;
        for (int i = 1; i < n; i++) {
            total *= i;
        }
        return total;



    }

}
