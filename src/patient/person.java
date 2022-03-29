package patient;

public class person {
	private String name;
	private int id;
	

	public person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public int getId () {
		return this.id;
	}
	
	public String getName () {
		return this.name;
	}
	
}
