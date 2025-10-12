package Tp10.Ex1;

import java.util.*;

public class Quadruplet<T> {
	private final T first;
	private final T second;
	private final T third;
	private final T fourth;
	
	public Quadruplet(T first, T second, T third, T fourth) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
	}
	
	public T getFirst() {
		return this.first;
	}
	
	public T getSecond() {
		return this.second;
	}
	
	public T getThird() {
		return this.third;
	}
	
	public T getFourth() {
		return this.fourth;
	}
	
	public void affiche() {
		System.out.println("Quadruplet[" + this.first + ", " + this.second + ", " + this.third + ", " + this.fourth + "]");
	}
	
	public Quadruplet<T> swap(int i, int j) {
		T[] elements = (T[]) new Object[] {first, second, third, fourth};
		
		T tmp = elements[i];
		elements[i] = elements[j];
		elements[j] = tmp;
		
		return new Quadruplet<>(elements[0], elements[1], elements[2], elements[3]);
	}
	
	public int hashCode() {
		return Objects.hash(this.first, this.second, this.third, this.fourth);
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || this.getClass() != obj.getClass()) return false;
		Quadruplet<?> other = (Quadruplet<T>) obj;
		
		return Objects.equals(this.first, other.first) && 
				Objects.equals(this.second, other.second) &&
				Objects.equals(this.third, other.third) &&
				Objects.equals(this.fourth, other.fourth);
	}
}
