package patient;

public class person {
	private String name;
	private boolean healthStat;
	private int id;
	

	public person(String name, boolean healthStat, int id) {
		this.name = name;
		this.healthStat = healthStat;
		this.id = id;
	}
	
	public int getId () {
		return this.id;
	}
	
	public boolean getHealthStat () {
		return this.healthStat;
	}
	
	public String getName () {
		return this.name;
	}
	
}
