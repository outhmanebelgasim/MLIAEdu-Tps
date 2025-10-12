package Tp10.Ex2;

import java.util.*;

public class TripletH<A, B, C> {
    private final A first;
    private final B second;
    private final C third;

    public TripletH(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() { return this.first; }
    public B getSecond() { return this.second; }
    public C getThird() { return this.third; }

    public void affiche() {
        System.out.println("TripletH[" + first + ", " + second + ", " + third + "]");
    }

    public List<Object> toList() {
        return Arrays.asList(this.first, this.second, this.third);
    }
}