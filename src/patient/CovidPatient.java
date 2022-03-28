package patient;

import java.util.HashSet;
import java.util.Set;

public class CovidPatient {
	private String name;
	private Set<person> closeContact;
	
	public CovidPatient (String name){
		this.name = name;
		this.closeContact = new HashSet<person>();
	}
	
	public Set<person> getCloseContact () {
		return this.closeContact;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	
}
