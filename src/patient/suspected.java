package patient;

import java.util.HashMap;
import java.util.Map;

public class suspected {
	private Map<Integer, person> listSuspects = new HashMap<Integer, person>();
	
	public void addSuspect ( Map<Integer, person> list) {
		for (Integer n : list.keySet()) {
			if (!listSuspects.containsKey(n)) {
				listSuspects.put(n, list.get(n));
			}
		}
	}
	
	public Map<Integer, person> getList (){
		return this.listSuspects;
	}
	public int numOfSuspects () {
		return this.listSuspects.size();
	}
}
