import java.util.*;

public class ListUserbook {
    ArrayList<Userbook> ub = new ArrayList<Userbook>();


    public ArrayList<Userbook> addObject(Userbook u) {


        ub.add(u);

        return ub;

    }


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

    public List<Userbook> filterUserBookLamda(String keyword) {
        List<Userbook> listbook = ub.stream().filter(p -> p.bookid.toLowerCase().trim().contains(keyword.toLowerCase().trim()) || p.userid.toLowerCase()
                .trim().contains(keyword.toLowerCase().trim())).toList();

        return listbook;
    }

    public ArrayList<Userbook> filterUserBookTradition(String keyword) {
        ArrayList<Userbook> newList = new ArrayList<Userbook>();

        for (Userbook p : ub) {
            if (p.bookid.contains(keyword) || p.userid.contains(keyword)) {
                newList.add(u);
            }
        }
        return newList;

    }
}
