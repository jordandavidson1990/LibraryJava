import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book1;

    @Before
    public void setUp() throws Exception {
        borrower = new Borrower();
        book1 = new Book("Call Me By Your Name", "André Aciman", "Romance");
    }

    @Test
    public void canTakeABook() {
        borrower.takeBook(book1);
        assertEquals(1, borrower.amountOfBookInCollection());
    }

}
