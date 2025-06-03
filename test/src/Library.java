import java.util.ArrayList;

public class Library{
    ArrayList<Book> books = new ArrayList<>();

    public Library(Book b){
        this.books.add(b);

    }
    public void setBooks(Book books){
        this.books.add(books);

    }
    //display all books by author or publisher

    public ArrayList<Book> getBooks(String author, String publisher){
        ArrayList<Book> filterBooks = new ArrayList<>();
        String au = author.toLowerCase().trim().replaceAll("\\sc+", "") ;


        String pub = publisher.toLowerCase().trim().replaceAll("\\sc+", "");

        for(Book b : books) {
            if (b.author.toLowerCase().trim().replaceAll("\\sc+", "").equals(au) || b.publisher.toLowerCase().trim().replaceAll("\\sc+", "").equals(pub)
            || b.author.contains(au) || b.publisher.contains(pub)
            ) {

                filterBooks.add(b);


            }

        }
        return filterBooks;
    }
   // print library
    public static void printBooks(ArrayList<Book> listbooks){
        System.out.println("Danh sach book voi tac gia hoac Publisher");
        for(Book b : listbooks){
            System.out.println(" Book ID: " + b.bookID + " | Book name: " + b.bookName + " | Book Author: " + b.author + " | Book Publisher: " + b.publisher);

        }
    }

    public static int staticBooks(ArrayList<Book> listbooks, String author){
        int countBookbyAuthor =0;
        //so luong book theo tac gia
        for(Book b : listbooks){
            if(b.author.toLowerCase().trim().equals(author.toLowerCase().trim())
            || b.author.toLowerCase().trim().contains(author)

            ){
                countBookbyAuthor ++;
            }
        }
        return countBookbyAuthor;
    }


}
