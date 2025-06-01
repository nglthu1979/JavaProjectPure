import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void test() {

        // user List
        User u1 = new User("gfz", "Nguyen Thi Van");
        User u2 = new User("123333", "tran van Nguyen");

        ListUser listuser = new ListUser();
        listuser.addUser(u2);
        listuser.addUser(u1);

        System.out.println("test");
        Userbook ub0 = new Userbook("123", "abc");
        Userbook ub1 = new Userbook("1233", "4563");
        Userbook ub2 = new Userbook("gfz", "456333");
        Userbook ub3 = new Userbook("123333", "gfz");

        ListUserbook ub = new ListUserbook();

        ub.addObject(ub0);
        ub.addObject(ub1);
        ub.addObject(ub2);
        ub.addObject(ub3);

        System.out.println("test short");

        ub.shortList();

        System.out.println("test filter:");
        ub.displayList(ub.filterUserBook("gfz"));

        // Userbook filter
        //List sau khi search
        //search in Lamda expression
        //List<Userbook> listUserbook = ub.filterUserBook("gfz");

        // search in traidtional expression
        List<Userbook> listUserbook = ub.filterUserBookTradition("gfz");



        // Hien thi name theo Lamda code
        //todo: ListUserbook: already filtered list with key word
        /*
        for (int i =0 ; i<listUserbook.size(); i++)
        {
         listuser.searchUserName(listUserbook.get(i).userid);
          listuser.displayList(listuser.searchUserName(listUserbook.get(i).userid));
        }
      
        */
       //hien thi name theo cach viet truye thong

        for (int i =0 ; i<listUserbook.size(); i++)
        {
            listuser.searchUserName(listUserbook.get(i).userid);
            listuser.searchUserNameTradition(listUserbook.get(i).userid);
            listuser.displayList(listuser.searchUserNameTradition(listUserbook.get(i).userid));
        }



    }
}
