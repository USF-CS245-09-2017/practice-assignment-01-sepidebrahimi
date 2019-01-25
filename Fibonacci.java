public class Fibonacci {
    public int fibonacci(int n, String type){
        if (type == "recursive"){
            return fibonacci_recursive(n);
        }
            return fibonacci_iterative(n);

    }

    public int fibonacci_iterative(int n) {
        if (n <= 1) {
            return n;
        }
        int x = 1;
        int before_x = 1;

        for (int i = 2; i < n; i++) {
            int temp = x;
            x += before_x;
            before_x = temp;
        }

        return x;
    }

    public int fibonacci_recursive(int n){
            if(n <= 1){
                return n;
            }
            return fibonacci_recursive(n-1)+fibonacci_recursive(n-2);
        }

    }
