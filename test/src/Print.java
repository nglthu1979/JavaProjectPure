import javax.naming.Binding;
import java.util.ArrayList;

public class Print {

    public static void test(ArrayList<Object> list) {
        //binding name and object
        String name = list.getClass().getName();


        for (Object o : list){
            System.out.println(o);

        }
    }
}
