package practisingTDD;

public class Libary {
	
	private String name;
	private int maxBooksBorrowed;
	
	public Libary(String name) {
		setName(name);
		maxBooksBorrowed = 3;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMaxBooksPerUser() {
		return maxBooksBorrowed;
	}
	
	public void setMaxBooksPerUser(int x) {
		this.maxBooksBorrowed = x;
	}
	
	public int getId(String userName) {
		
		int id = Users.idCreator(getName() + userName);
		return id;
//		Users.getID()
	}

}
