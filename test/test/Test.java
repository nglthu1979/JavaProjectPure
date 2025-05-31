import java.util.ArrayList;

public class Test {
    public static void test(){

        System.out.println("test");
        Userbook ub0 = new Userbook("123", "abc");
        Userbook ub1 = new Userbook("1233", "4563");
        Userbook ub2 = new Userbook("12333", "456333");
        Userbook ub3 = new Userbook("123333", "456333");

        ListUserbook ub = new ListUserbook();
         
         ub.addObject(ub0);
         ub.addObject(ub1);
         ub.addObject(ub2);
         ub.addObject(ub3);

        

         System.out.println("test short");

         ub.shortList();
         
        System.out.println("test filter:");
         ub.displayList(ub.filterUserBook("abc"));

        

        

         
    }
}
