import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Borrower borrower;

    @Before
    public void setUp(){
        library = new Library(10);
        book1 = new Book("Call Me By Your Name", "André Aciman", "Romance");
        book2 = new Book("The Catcher in the Rye", "J.D. Salinger", "Coming of Age");
        borrower = new Borrower();
    }

    @Test
    public void canGetTotalOfBooks() {
        assertEquals(0, library.getTotalOfBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.getTotalOfBooks());
        assertTrue(library.getBooks().contains(book1));
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book1);
        assertEquals(1, library.getTotalOfBooks());
    }

    @Test
    public void canLoanOutBookToBorrower() {
        library.addBook(book1);
        library.loanOutBook(book1, borrower);
        assertEquals(0, library.getTotalOfBooks());
        assertEquals(1, borrower.amountOfBookInCollection());
        assertFalse(library.getBooks().contains(book1));
        assertTrue(borrower.getCollection().contains(book1));
    }
}
