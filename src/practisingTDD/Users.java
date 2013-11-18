package practisingTDD;

public class Users implements User {
	
	private String name;
	private int id;
	
	public Users(String userName) {
		this.name = userName;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getID() {
		return this.id;
	}

	@Override
	public void setID(int ID) {
		this.id = ID;
	}
	
	public void register(Libary libaryName) {
		String libName = libaryName.getName();
		int id = idCreator(getName() + libName);
		setID(id);
	}
	
	public String getLibary() {
			
		
		return "hkh";
		
	}
	
	
	public static int idCreator(String str) {
		int hash = str.hashCode();
		int x = Math.abs(hash);
		return x = x % 99;
	}

}
