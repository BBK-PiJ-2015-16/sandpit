import java.io.Serializable;

public class Person implements Serializable {
	private int id;
	private String name;
	
	public Person() {
		
	}
	
	public Person(int id, String name) {
		setId(id);
		setName(name);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("ID: %d, Name: %s",id,name);
	}
}
