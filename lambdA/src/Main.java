import java.util.Scanner;

public class Main {
    public static void main (String[]args){

    }

    private static void calculator() {
        Scanner scanner = new Scanner(System.in);


        RationalCalculator rationalCalculator = new RationalCalculator(
                (x, y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB()),
                (x, y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB()),
                (x, y) -> new Number(x.getA() * y.getA(), x.getB() * y.getB()),
                (x, y) -> new Number(x.getA() / y.getA(), x.getB() / y.getB())
        );


        while (true) {
            System.out.println("Choose calculator:");
            System.out.println("1 = Relational calculator");
            System.out.println("2 = Vector calculator");
            System.out.println("3 = Complex calculator");
            System.out.println("4 = Exit program");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:{

                }
                case 2:{

                }
                case 3:{

                }
            }
        }
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