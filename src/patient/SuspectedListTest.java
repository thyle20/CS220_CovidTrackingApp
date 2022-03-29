package patient;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SuspectedListTest {
	suspected ls;
	@BeforeEach
	void setUp() throws Exception {
		ls = new suspected();
	}

	@Test
	void test() {
		CovidPatient pt = new CovidPatient("Hoa");
		CovidPatient pt1 = new CovidPatient ("Juan");
		person p = new person("Lien", 1);
		person p1 = new person ("Hung", 2);
		person p2 = new person ("Hoang", 3);
		person p3 = new person ("Mai", 4);
		pt.contact(p);
		pt.contact(p3);
		pt1.contact(p3);
		pt1.contact(p2);
		pt1.contact(p3);
		ls.addSuspect(pt1.getCloseContact());
		ls.addSuspect(pt.getCloseContact());
		Map<Integer, person> expected = new HashMap<Integer, person> ();
		expected.put(p.getId(), p);
		expected.put(p2.getId(), p2);
		expected.put(p3.getId(), p3);
		assertEquals(3, ls.numOfSuspects());
		assertEquals(expected, ls.getList());
		//fail("Not yet implemented");
	}

}
