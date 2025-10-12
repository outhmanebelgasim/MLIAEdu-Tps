package Tp10.Ex2;

import java.util.*;

public class MultiTuple<T> {
    private final List<T> elements;

    public MultiTuple(T... elements) {
        this.elements = Arrays.asList(elements);
    }

    public List<T> toList() {
        return new ArrayList<>(elements);
    }

    public void affiche() {
        System.out.println("MultiTuple" + elements);
    }
}
