package in.sagar.core.entity;

public class User {
	
	private String name;
	private long id;
	private String email;
	
	
	
	public User(String name, long id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
