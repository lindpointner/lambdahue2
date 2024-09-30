import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[]args) throws IOException {
        /*NumberTester numberTester = new NumberTester("test.txt");

        numberTester.setOddEvenTester(number -> number % 2 == 0);
        numberTester.setPrimeTester(Main::isPrime);
        numberTester.setPalindromeTester(Main::isPalindrome);

        numberTester.testFile();*/
        calculator();
    }

    private static void calculator() {
        Scanner scanner = new Scanner(System.in);
        AbstractCalculator calculator = new RationalCalculator();

        while (true) {
            System.out.println("Choose calculator:");
            System.out.println("1 = Rational calculator");
            System.out.println("2 = Vector calculator");
            System.out.println("3 = Complex calculator");
            System.out.println("4 = Exit program");

            int choice = scanner.nextInt();
            if (choice == 4) {
                break;
            }


            System.out.print("Enter number x a> ");
            double a = scanner.nextDouble();
            System.out.print("Enter number x b> ");
            double b = scanner.nextDouble();
            Number x = new Number(a, b);

            System.out.print("Enter number y a> ");
            double c = scanner.nextDouble();
            System.out.print("Enter number y b> ");
            double d = scanner.nextDouble();
            Number y = new Number(c, d);

            System.out.println("Choose operation:");
            System.out.println("1 = add");
            System.out.println("2 = subtract");
            System.out.println("3 = multiply");
            System.out.println("4 = divide");

            int operation = scanner.nextInt();
            Number result = null;

            switch (operation) {
                case 1: result = calculator.add(x, y); break;
                case 2: result = calculator.subtract(x, y); break;
                case 3: result = calculator.multiply(x, y); break;
                case 4: result = calculator.divide(x, y); break;
            }

            System.out.println("_________________________");
            System.out.println("Solution:");
            System.out.println("a = " + result.getA());
            System.out.println("b = " + result.getB());
            System.out.println("_________________________");
        }
        //is working
    }


    public static boolean isPrime(int number){
        if (number <= 1) return false;

        for (int i = 2; i < Math.sqrt(number); i++){
            if (number%i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number){
        String s = String.valueOf(number);
        return s.contentEquals(new StringBuilder(s).reverse());
    }
}