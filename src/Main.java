public class Main
{
    public static void main(String[] args) {
        System.out.println("Odd Numbers:");
        printOdds(20);

    }

    static int printOdds(int number) {
        if (number == 1) {
            System.out.println(number);
            return 0;
        }
        if (number%2!=0){
            System.out.println(number);
            printOdds(number-2);
        }
        if (number%2==0){
            printOdds(number-1);
        }
        return 1;
    }
}
