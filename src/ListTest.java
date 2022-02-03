import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<Integer> listExample = new ArrayList();
        listExample.add(1);
        listExample.add(2);
        listExample.add(3);
        System.out.println("listExample");
        for(int i=0; i < listExample.size(); i++) {
            System.out.println(listExample.get(i));
        }
    }
}
