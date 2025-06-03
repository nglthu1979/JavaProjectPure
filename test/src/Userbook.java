import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Userbook {

    public String userid;
    public String bookid;
    public LocalDate dateborrow;
    public LocalDate datereturn;
    Userbook(String uid, String bid) {
        this.userid = uid;
        this.bookid = bid;
    }
    Userbook(String uid, String bid, LocalDate dateborrow) {
        this.userid = uid;
        this.bookid = bid;
        this.dateborrow = dateborrow;

    }

    public void displayUserbook() {

        System.out.println(userid);
    }

}
