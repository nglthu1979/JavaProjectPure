import java.util.ArrayList;
import java.util.List;

public class ListUser {

    public ArrayList<User> user = new ArrayList<User>();

    public ArrayList<User> addUser(User u){

        user.add(u);
        return user;


    }



    public static void displayList(List<User> ub){
        for (int i = 0; i < ub.size(); i++){

           
             System.out.println("userName: "+ub.get(i).userName);

        }
    }


     public List<User> searchUserNameInBook(String userId){

       



        List<User> listub = user.stream().filter(p->p.userId.contains(userId)).toList(); 

        
        return listub;


        }


    
    
}
