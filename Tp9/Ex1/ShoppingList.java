package Tp9.Ex1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
	private final List<String> items = new ArrayList<>();
	
	public void add(String item) {
		items.add(item);
		System.out.println(item + " est ajoute. ");
	}
	
	public void remove(String item) {
		boolean test = items.remove(item);
		if(test) System.out.println(item + " est supprime. ");
		else System.out.println(item + " n'est pas trouve. ");
	}
	
	public void contains(String item) {
		boolean test = items.contains(item);
		if(test) System.out.println(item + " est trouve. ");
		else System.out.println(item + " n'est pas dans la list. ");
	}
	
	public void display() {
		if(items.isEmpty()) {
			System.out.println("Vide. ");
		}else {
			for(String item: items) {
				System.out.println(item);
			}
		}
		
	}
}
