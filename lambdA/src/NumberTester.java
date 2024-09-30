import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester {
    private  String fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }
    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }
    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester =primeTester;
    }
    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester =palindromeTester;
    }
    public void testFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int i= Integer.parseInt(reader.readLine().trim());

        for (int y = 0; y < i; y++) {
            String[] parts = reader.readLine().split(" ");
            int test = Integer.parseInt(parts[0].trim());
            int number = Integer.parseInt(parts[1].trim());

            switch (test) {
                case 1:
                    System.out.println(oddTester.TestNumber(number) ? "EVEN" : "ODD");
                    break;
                case 2:
                    System.out.println(primeTester.TestNumber(number) ? "PRIME" : "NO PRIME");
                    break;
                case 3:
                    System.out.println(palindromeTester.TestNumber(number) ? "PALINDROME" : "NO PALINDROME");
                    break;
                default:
                    System.out.println("Ungültiger Test: " + test);
            }
        }
        reader.close();
    }
}
