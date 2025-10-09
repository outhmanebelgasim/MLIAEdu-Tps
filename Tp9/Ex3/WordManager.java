package Tp9.Ex3;

import java.util.*;

public class WordManager {
	private String rawText;
	private final Set<String> hashSet;
	private final Set<String> linkedSet;
	private final Set<String> treeSet;
	
	public WordManager(String word) {
		this.rawText = word;
		this.hashSet = new HashSet<>();
		this.linkedSet = new LinkedHashSet<>();
		this.treeSet = new TreeSet<>();
	}
	
	public void parseText() {
		String[] tokens = rawText.toLowerCase(Locale.ROOT).split("[^a-zA-Z]");
		for(String token : tokens) {
			if(token.isEmpty()) continue;
			hashSet.add(token);
			linkedSet.add(token);
			treeSet.add(token);
		}
	}
	
	public void displayAll() {
        System.out.println("--- HashSet (ordre indefini) ---");
        System.out.println(hashSet);
        System.out.println("\n--- LinkedHashSet (ordre d'insertion) ---");
        System.out.println(linkedSet);
        System.out.println("\n--- TreeSet (ordre alphabetique, case-insensitive) ---");
        System.out.println(treeSet);
    }
	
	public boolean contains(String word) {
        return hashSet.contains(word.toLowerCase(Locale.ROOT));
    }
	
	public boolean remove(String word) {
        String w = word.toLowerCase(Locale.ROOT);
        boolean removed = false;
        removed |= hashSet.remove(w);
        removed |= linkedSet.remove(w);
        removed |= treeSet.remove(w);
        return removed;
    }
}
