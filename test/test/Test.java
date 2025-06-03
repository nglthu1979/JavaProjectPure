import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;
public class Test {
    public static void test() {


        //book

        //Database
        Book book = new Book("D000001", "Database Design for Mere Mortals: 25th Anniversary Edition", " Michael J Hernandez ", "Addison-Wesley Professional", "0136788041");
        Book book2 = new Book("D000002", "Fundamentals of Data Engineering: Plan and Build Robust Data Systems", " Joe Reis", "O'Reilly Media", "1098108302");

        //Mobile Application
        Book book3 = new Book("M000001", "Agile Project Management for Mobile Application Development", "John Estrella ", "Agilitek Corporation", "978-1544922478");
        Book book4 = new Book("M000002", "Building Mobile Apps at Scale: 39 Engineering Challenges", "Gergely Orosz ", "Primedia E-launch LLC", "1638778868");

        //Web
        Book book5 = new Book("W000001", "Full Stack Web Development: A Comprehensive, Hands-On Guide to Building Modern Websites and Applications", "Philip Ackermann", "Thanh Nien", "1493224379");
        Book book6 = new Book("W000002", "Web Technology", "Shraddha N. Zanjat", "Lambert", "620747029X");
        //Java
        Book book7 = new Book("J000001", "Thinking in Java", "Bruce Eckel", "Rheinwerk Computing", "0131872486");
        Book book8 = new Book("J000002", "Head First Java: A Brain-Friendly Guide Edition", "Kathy Sierra","O'Reilly", "ISBN98349098");

        //add to library
        Library lib1 = new Library(book);
        lib1.setBooks(book2);
        lib1.setBooks(book3);
        lib1.setBooks(book6);
        lib1.setBooks(book4);
        lib1.setBooks(book5);
        lib1.setBooks(book6);
        lib1.setBooks(book7);
        lib1.setBooks(book8);

        //Tim tat ca sach theo id or author
        System.out.println("Begin search book by author and publisher");
        String author = UserInput.inputString("Author");
        String publisher = UserInput.inputString("Publisher");

        //check here 2 conditions to add book
        lib1.getBooks(author, publisher);
        Library.printBooks(lib1.getBooks(author, publisher));

        //thong ke: So luong sach theo tac gia vua nhap
        System.out.println(" Author : " + author + " co  " +  Library.staticBooks(lib1.getBooks(author, publisher), author)  + " books");

        System.out.println("end search book by author and publisher");
        //



        // user List

        User u1 = new User("u00001", "Nguyen Thi Van");
        User u2 = new User("u00002", "Tran van Nguyen");
        User u3 = new User("u00003", "Hoang Thi Lan");
        User u4 = new User("u00004", "Nguyen Thi Van Lan");

        ListUser listuser = new ListUser();
        listuser.addUser(u2);
        listuser.addUser(u1);
        listuser.addUser(u3);
        listuser.addUser(u4);

        System.out.println("Books borrowed by Users");
        LocalDate currentDate = LocalDate.now();

        Userbook ub0 = new Userbook("u00001", "M000001", currentDate);
        Userbook ub1 = new Userbook("u00002", "M000001", currentDate);
        Userbook ub2 = new Userbook("u00001", "J000001", currentDate);
        Userbook ub3 = new Userbook("u00002", "D000001", currentDate);
        Userbook ub4 = new Userbook("u00003", "D000001", currentDate);
        Userbook ub5 = new Userbook("u00004", "D000001", currentDate);

        ListUserbook ub = new ListUserbook();

        ub.addObject(ub0);
        ub.addObject(ub1);
        ub.addObject(ub2);
        ub.addObject(ub3);
        ub.addObject(ub4);
        ub.addObject(ub5);



        System.out.println("Test filter book by any keyword matching to user id or userbook:");

        String keyword = UserInput.inputString("keyword");
        System.out.println("keyword : " + keyword);

        //ub.displayList(ub.filterUserBook(keyword));

        // Userbook filter
        //List sau khi search
        //search in Lamda expression
        //keyword userid or book id
        List<Userbook> listUserbook = ub.filterUserBookLamda(keyword);
        System.out.println("This book has been brrowed by : " + listUserbook.size() + " users");

        // search in traditional expression

       //List<Userbook> listUserbook = ub.filterUserBookTradition(keyword);

        // Hien thi name theo Lamda code
        // todo: ListUserbook: already filtered list with key word

        for (int i =0 ; i <listUserbook.size(); i++)
        {
         listuser.searchUserName(listUserbook.get(i).userid);
         //Hien thi username
          listuser.displayList(listuser.searchUserName(listUserbook.get(i).userid));

         //hien thi info book
            String book_id = listUserbook.get(i).bookid;
            System.out.println("Borrowed the Book of " +lib1.getBookInfo(book_id).bookName);

        }
      

       //hien thi name theo cach viet truye thong
/*
        for (int i =0 ; i<listUserbook.size(); i++)
        {
            listuser.searchUserName(listUserbook.get(i).userid);
            listuser.searchUserNameTradition(listUserbook.get(i).userid);
            listuser.displayList(listuser.searchUserNameTradition(listUserbook.get(i).userid));
        }

*/

      //getBookInfo: return book
      //input bookid

    }
}
