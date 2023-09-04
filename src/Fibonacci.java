public class Fibonacci {
    public static void main(String[] args) {
        int inputNumber = 3;
        FibonacciSeries fibonacciseries = new FibonacciSeries();
        System.out.println(fibonacciseries.fibonacci(inputNumber));
    }
}

class FibonacciSeries {
    int fibonacci(int number) {
        if (number<=1){
            return number;
        }
        return fibonacci(number-1)+ fibonacci(number-2);

    }
}
