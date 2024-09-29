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
    public void testFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            int tests = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < tests; i++) {
                String[] parts = bufferedReader.readLine().split(" ");
                int test = Integer.parseInt(parts[0]);
                int numbers = Integer.parseInt(parts[1]);


                switch (tests) {
                    case 1: {
                        System.out.println(oddTester.TestNumber(numbers) ? "ODD" : "EVEN");
                        break;
                    }
                    case 2:{
                        System.out.println(primeTester.TestNumber(numbers) ? "PRIME" : "NO PRIME");
                        break;
                    }
                    case 3:{
                        System.out.println(palindromeTester.TestNumber(numbers) ? "PALINDROME" : "NO PALINDROME");
                        break;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
