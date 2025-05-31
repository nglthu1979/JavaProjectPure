import java.util.ArrayList;

public class ListUserbook {
   ArrayList<Userbook> ub = new ArrayList<Userbook>();

    public ArrayList<Userbook> addObject(Userbook u){
        

        ub.add(u);

        return ub;
        
    };
    

    public void displayList(){
        for (int i =0; i <ub.size(); i++){

            System.out.println("book ID: "+ub.get(i).bookid);
             System.out.println("user ID: "+ub.get(i).userid);

        }
    }
}
