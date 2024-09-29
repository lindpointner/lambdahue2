import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavamitForEach {
    public static void main (String[]args){
        List<String> liste = Arrays.asList("Hello", "World");

        for (String s : liste){
            System.out.println(s);
        }

        liste.forEach((String s) -> System.out.println(s));

        liste.forEach(System.out::println);
    }
}
