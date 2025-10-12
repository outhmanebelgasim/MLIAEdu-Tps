package Tp10.Ex2;

public class TestTripletH {
    public static void main(String[] args) {
        TripletH<Integer, String, Double> th1 = new TripletH<>(1, "Outhmane", 15.65);
        TripletH<String, Integer, Boolean> th2 = new TripletH<>("Hanaa", 2, true);

        System.out.println("Premier argument th1: " + th1.getFirst());
        System.out.println("Deuxieme argument th1: " + th1.getSecond());
        System.out.println("Troisieme argument th1: " + th1.getThird());
        th1.affiche();

        System.out.println();

        System.out.println("Premier argument th2: " + th2.getFirst());
        System.out.println("Deuxieme argument th2: " + th2.getSecond());
        System.out.println("Troisieme argument th2: " + th2.getThird());
        th2.affiche();

        System.out.println("\nTripletH as list: ");
        System.out.println(th1.toList());

        MultiTuple<Object> tuple = new MultiTuple<>("Ali", 20, 18.5, "Java");
        tuple.affiche();
        System.out.println(tuple.toList());
    }
}
