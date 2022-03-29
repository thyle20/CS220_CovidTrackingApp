package main;

import patient.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suspected list = new suspected();
		person p1 = new person("Hannah", 1);
		person p2 = new person ("Kane", 2);
		person p3 = new person("Lewis", 3);
		person p4 = new person ("Mark", 4);
		person p5 = new person ("Ngoc", 5);
		person p6 = new person("James", 6);
		
		CovidPatient cpt1 = new CovidPatient("Shane");
		cpt1.contact(p1);
		cpt1.contact(p3);
		cpt1.contact(p2);
		cpt1.contact(p1);
		list.addSuspect(cpt1.getCloseContact());
		
		CovidPatient cpt2 = new CovidPatient("Nathalie");
		cpt2.contact(p6);
		cpt2.contact(p1);
		cpt2.contact(p5);
		list.addSuspect(cpt2.getCloseContact());
		
		System.out.println("Total people need to be quarantined: " + list.numOfSuspects());
		System.out.println("Suspected Covid patients: ");
		for (Integer i : list.getList().keySet()) {
			String name = list.getList().get(i).getName();
			System.out.println(name);
		}
		
		
	}

}
