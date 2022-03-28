package main;
import java.util.*;

import patient.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suspected list = new suspected();
		person p1 = new person("Hannah", false, 1);
		person p2 = new person ("Kane", false, 2);
		person p3 = new person("Lewis",false, 3);
		person p4 = new person ("Mark", false, 4);
		person p5 = new person ("Ngoc", false, 5);
		person p6 = new person("James", false, 6);
		
		CovidPatient cpt1 = new CovidPatient("Shroyer");
		cpt1.getCloseContact().add(p1);
		cpt1.getCloseContact().add(p3);
		list.addSuspect(cpt1.getCloseContact());
		
		CovidPatient cpt2 = new CovidPatient("Nathalie");
		cpt2.getCloseContact().add(p6);
		cpt2.getCloseContact().add(p1);
		list.addSuspect(cpt2.getCloseContact());
		
		for (person p : list.getList()) {
			System.out.println(p.getName());
		}
		
		
		
		
		
	}

}
