package Tp9.Ex3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String sample = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
		
		WordManager manager = new WordManager(sample);
		manager.parseText();
		manager.displayAll();
		
		Scanner sc = new Scanner(System.in);
        while (true) {
        		System.out.println("Entrer le mot pour rechercher: (ou exit)");
        		String input = sc.nextLine().trim();
        		if(input.equalsIgnoreCase("exit")) break;
        		
        		boolean found = manager.contains(input);
        		System.out.printf("Presence de %s ? %b\n", input, found);
        		
        		System.out.print("Souhaitez-vous supprimer ce mot ? (y/n) ");
                String confirm = sc.nextLine().trim();
                if(confirm.equalsIgnoreCase(confirm)) {
                	boolean removed = manager.remove(input);
                	System.out.printf(removed
                            ? "Le mot '%s' a ete supprime.%n"
                            : "Le mot '%s' n'existait pas.%n", input);
                    manager.displayAll();
                }
         }
        sc.close();
        System.out.println("Fin du programme.");
	}
}
