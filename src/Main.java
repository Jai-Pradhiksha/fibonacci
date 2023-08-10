// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*

//factorial
public class Main {
    public static void main(String[] args) {
        int inputNumber=5;
        FactorialFinder factorialFinder=new FactorialFinder();
        System.out.println(factorialFinder.factorial(inputNumber));
    }
}

class FactorialFinder{
    int factorial(int number)
    {
        if (number==1)
        {
            return 1;
        }
        return number*factorial(number-1);
    }
}*/

//fibonacci to print nth number
public class Main {
    public static void main(String[] args) {
        int inputNumber = 3;
        FibonacciSeries fibonacciseries = new FibonacciSeries();
        System.out.println(fibonacciseries.fibonacci(inputNumber));
        //greet();
    }
        /*
        //static example
        static void greet()
        {
            System.out.println("Hello");
        }*/

}

class FibonacciSeries {
    int fibonacci(int number) {
        if (number<=1){
            return number;
        }
        return fibonacci(number-1)+ fibonacci(number-2);

    }
}