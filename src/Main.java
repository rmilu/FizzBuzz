import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Write your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 3 == 0 && number%5!=0) {
            System.out.println("Fizz");
        } else {
            if (number % 5 == 0 && number%3!=0) {
                System.out.println("Buzz");
            } else {
                if (number % 5 == 0 && number%3==0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println(number);
                }
            }
        }

        if (number % 3 == 0) {
            System.out.print("Fizz");
        }

        if(number % 5 == 0) {
            System.out.print("Buzz");
        }

        if (!(number % 5 == 0 || number % 3 == 0)) {
            System.out.println(number);
        }
    }
}