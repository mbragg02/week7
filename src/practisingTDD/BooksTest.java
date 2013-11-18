package practisingTDD;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BooksTest {
	
	private Books myBook;
	
	@Before
	public void init() {
		myBook = new Books("harry", "my title");
		
	}
	
	@After
	public void close() {
		myBook = null;
	}
	
	@Test
	public void testBooks() {
		String actual = myBook.getAuthor();
		String expected = "harry";
		assertEquals(actual, expected);
	}

	@Test
	public void testGetAuthor() {
		testBooks();
	}

	@Test
	public void testGetTitle() {
		String actual = myBook.getTitle();
		String expected = "my title";
		assertEquals(actual, expected);
	}

}
