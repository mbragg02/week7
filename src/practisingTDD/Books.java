package practisingTDD;

public class Books implements Book {
	
	private String author;
	private String title;
	
	public Books(String author, String title) {
		setAuthor(author);
		setTitle(title);
	}

	@Override
	public String getAuthor() {
		return this.author;
	}

	private void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String getTitle() {	
		return this.title;
	}

	private void setTitle(String title) {
		this.title = title;
		
	}

}
