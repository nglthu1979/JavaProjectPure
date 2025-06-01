import java.util.ArrayList;
import java.util.List;

public class ListUser {

    public ArrayList<User> user = new ArrayList<User>();

    public ArrayList<User> addUser(User u) {

        user.add(u);
        return user;

    }

    public static void displayList(List<User> ub) {
        for (int i = 0; i < ub.size(); i++) {

            System.out.println("userName: " + ub.get(i).userName);

        }
    }
    //Lamda Expression
    public List<User> searchUserName(String userId) {

        List<User> listub = user.stream().filter(p -> p.userId.contains(userId)).toList();

        return listub;

    }

    //Cach viet truyen thong
    public ArrayList<User> searchUserNameTradition(String userId) {
        ArrayList<User> newList = new ArrayList<User>();
        for (User u : user) {
            if (u.userId.contains(userId)) {
                newList.add(u);

            }
        }

        return newList;

    }

}
