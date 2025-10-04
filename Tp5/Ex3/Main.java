package Tp5.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Personne> p = new ArrayList<>();
		p.add(new Developpeur("Ali", 2000));
	    p.add(new Manager("Hamid",      3000));
	    p.add(new Developpeur("Hanane", 2200));

	    Utils.listerPersonne(p);
	}
}
