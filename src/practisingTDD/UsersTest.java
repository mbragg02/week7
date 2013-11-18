package practisingTDD;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UsersTest {
	
	private Users testUser;
	private Libary testLibary;
	private String name;
	private String libaryName;
	private int id;
	
	@Before
	public void init() {
		this.name = "Michael";
		this.id = 12345;
		testUser = new Users(name);
		
		libaryName = "Birkbeck";
		testLibary = new Libary(libaryName);
		
		
		
	}
	
	@After
	public void close() {
		testUser = null;
	}

	@Test
	public void testUsers() {
		String actual = testUser.getName();
		String expected = name;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetName() {
		testUsers();
	}

	@Test
	public void testGetID() {
		testSetID();
		
	}

	@Test
	public void testSetID() {
		testUser.setID(id);
		int actual = testUser.getID();
		int expected = id;
		assertEquals(actual, expected);
	}
	
	@Test
	public void registerTest() {
		testUser.register(testLibary);
		
	}
	
	
	@Test
	public void getLibary() {
		
		String actual = testUser.getLibary();
		String expected = libaryName;
		assertEquals(actual, expected);
		
	}

}
