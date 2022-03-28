package patient;

//import java.util.HashMap;
import java.util.HashSet;
//import java.util.Map;
import java.util.Set;
//import java.time.Clock;
//import java.time.Instant;

public class suspected {
	private Set<person> listSuspects = new HashSet<person>();
	//Clock c = Clock.systemUTC();
	//private Map<person, Instant> check = new HashMap<person, Instant>(); 
	public void addSuspect ( Set<person> list) {
		for (person p : list) {
			if (!listSuspects.contains(p)) {
				listSuspects.add(p);
			}
		}
		
		
	}
	
	/*public void addSuspectAndTime (Set<person> list) {
		for (person p : list) {
			if (!check.containsKey(p)) {
				check.put(p, c.instant());
			}
		}
	}*/
	public Set<person> getList (){
		return this.listSuspects;
	}
	
	
	
	

}
