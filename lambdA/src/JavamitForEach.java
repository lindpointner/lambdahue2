import java.util.ArrayList;
import java.util.List;

public class JavamitForEach {
    ArrayList<String> liste = new ArrayList<>();

    public void showWithForEach(){
        for (int i = 0; i < liste.size(); i++){
            System.out.println(liste.get(i));
        }
    }

    public void showWithOldForEach(){
        liste.forEach(System.out::println);
    }


}
