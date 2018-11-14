import java.util.ArrayList;
import java.util.Collection;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public void takeBook(Book book) {
        this.collection.add(book);
    }

    public int amountOfBookInCollection() {
        return this.collection.size();
    }

    public ArrayList<Book> getCollection() {
        return collection;
    }
}

