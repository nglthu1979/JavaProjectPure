public class Book {
    public String bookID;
    public String bookName;
    public String author;
    public String publisher;
    public String ISBN;

    Book(String bookID, String bookName, String author, String publisher, String ISBN) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;

    }
   public void display(){
        System.out.println("Book Name: " + bookName);
   }
}
