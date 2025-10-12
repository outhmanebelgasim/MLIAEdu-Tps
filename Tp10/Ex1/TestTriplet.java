package Tp10.Ex1;

public class TestTriplet {
	public static void main(String[] args) {
		Triplet<String> tripletString = new Triplet<>("A", "B", "C");
		Triplet<Integer> tripletInteger = new Triplet<>(1, 2, 3);
		
		tripletString.affiche();
		tripletInteger.affiche();
		
		System.out.println("Affiche premier String: " + tripletString.getFirst());
		System.out.println("Affiche premier Integer: " + tripletInteger.getFirst());
		
		//swap A avec C 
		Triplet<String> swapped1 = tripletString.swap(0, 2);
		swapped1.affiche();
		
		System.out.println("Hash code tripletString: " + tripletString.hashCode());
		System.out.println("tripletString equal to tripletInteger: " + (tripletString.equals(tripletInteger) ? "Yes" : "No"));
		
		// Quadruplet
		
		Quadruplet<String> qd1 = new Quadruplet<>("D", "E", "F", "G");
		Quadruplet<Integer> qd2 = new Quadruplet<>(4, 5, 6, 7);
		
		System.out.println("Hash code Quadruplet1: " + qd1.hashCode());
		System.out.println("Hash code Quadruplet2: " + qd2.hashCode());
		
		//swap 5 avec 6
		Quadruplet<Integer> swapped2 = qd2.swap(1, 2);
		swapped2.affiche();
	}
}
