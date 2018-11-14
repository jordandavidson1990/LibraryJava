import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int getTotalOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.books.size() < capacity) {
            this.books.add(book);
        }
    }

    public void removeBook(Book book) {
        if(this.books.contains(book)){
            this.books.remove(book);
        }
    }

    public void loanOutBook(Book book, Borrower borrower) {
        if(this.books.contains(book)){
        this.removeBook(book);
        borrower.takeBook(book);
        }
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
}
