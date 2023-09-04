public class Factorial {
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
}
