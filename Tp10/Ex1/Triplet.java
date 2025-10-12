package Tp10.Ex1;

import java.util.*;

public class Triplet<T> {
	private final T first;
	private final T second;
	private final T third;
	
	public Triplet(T first, T second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public T getFirst() {
		return this.first;
	}
	
	public T getSecond() {
		return this.second;
	}
	
	public T getThird() {
		return this.getFirst();
	}
	
	public void affiche() {
		System.out.println("[Triplet=" + this.first + ", " + this.second + ", " + this.third + "]");
	}
	
	public Triplet<T> swap(int i, int j) {
		T[] elements = (T[]) new Object[] {first, second, third};
		
		T tmp = elements[i];
		elements[i] = elements[j];
		elements[j] = tmp;
		
		return new Triplet<>(elements[0], elements[1], elements[2]);
	}
	
	public int hashCode() {
		return Objects.hash(this.first, this.second, this.third);
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(this.getClass() != obj.getClass() || obj == null) return false;
		
		Triplet<?> other = (Triplet<?>) obj;
		return Objects.equals(this.first, other.first) &&
				Objects.equals(this.second, other.second) && 
				Objects.equals(this.third, other.third);
	}
}
