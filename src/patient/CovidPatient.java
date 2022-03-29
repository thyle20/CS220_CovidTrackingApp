package patient;

import java.util.HashMap;
import java.util.Map;

public class CovidPatient {
	private String name;
	private Map<Integer, person> closeContact;
	
	public CovidPatient (String name){
		this.name = name;
		this.closeContact = new HashMap<Integer, person>();
	}
	
	public void contact (person p) {
		this.closeContact.put(p.getId(), p);
	}
	
	public Map<Integer, person> getCloseContact () {
		return this.closeContact;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	
}
