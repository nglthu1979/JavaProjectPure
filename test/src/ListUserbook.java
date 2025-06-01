import java.util.ArrayList;
import java.util.List;

public class ListUserbook {
    ArrayList<Userbook> ub = new ArrayList<Userbook>();

    public ArrayList<Userbook> addObject(Userbook u) {

        ub.add(u);

        return ub;

    };

    public void displayList() {
        for (int i = 0; i < ub.size(); i++) {

            System.out.println("book ID: " + ub.get(i).bookid);
            System.out.println("user ID: " + ub.get(i).userid);

        }
    }

    public static void displayList(List<Userbook> ub) {
        for (int i = 0; i < ub.size(); i++) {

            System.out.println("book ID: " + ub.get(i).bookid);
            System.out.println("user ID: " + ub.get(i).userid);

        }
    }

    public void shortList() {

        List<Userbook> list = ub.subList(0, 2);

        ListUserbook.displayList(list);

    }

    // Lamda Expression
    public List<Userbook> filterUserBook(String keyword) {
        List<Userbook> listub = ub.stream().filter(p -> p.bookid.contains(keyword) || p.userid.contains(keyword))
                .toList();

        return listub;
    }

    // Tradition Expression
    public ArrayList<Userbook> filterUserBookTradition(String keyword) {
        ArrayList<Userbook> newList = new ArrayList<Userbook>();

        for (Userbook u : ub) {
            if (u.bookid.contains(keyword) || u.userid.contains(keyword)) {
                newList.add(u);

            }
        }
        return newList;
    
}
}
