package group_project2;
//created 11/3/21
//List group project

//generic interface for a basic list class math
//
//METHODS:
/*
 * int size() : returns the size of the list
 * int numItems() : returns the number of items in the list
 * boolean isFull() : will return true if the list is full || false if the list is not full
 * int Find(E element) : will return the index value of the first occurrence of the element in the list || if not found will return -1
 * E get(int index) : will return the element at the specified index || throws out of bounds exception when invalid index
 * E getNext() : will return the next element in the list || throws out of bounds exception when exceeding the size of the list
 */

//This project utilizes two ADT's that implement this interface
//ADT's:
/*
 * LinkedList
 * ArrayList
 */

//This interface will serve as a reference variable to a class called ListMath<E>
//either ADT may be used in the ListMath class
//the combination of generic interfaces and a reference variable creates a robust class
//any subclass of Number or any type of list
//meaning the method to calculate the sum is only needed once, not in each individual ADT

//Example's of different data types and ADT's with respective use cases:
/*
 * 1.)The number of students in a class:
 * 			the classroom size is constant so you can use an ArrayList.
 * 			if the classroom is 127 or less than  you can use a byte, if more than that a short could be used
 * 
 * 2.)the number of students enrolled at UA:
 * 			the number changes often, and the list is larger a use of LinkedList would be preferable
 * 			and int will be sufficient for size AND accuracy, there arnt any "half students" or any fractional amount of students
 * 
 * 3.)average miles per gallon spent commuting to work:
 * 			the number of trips to work is consistent through the week so an ArrayList is preferable
 * 			you want something more accurate that could calculate fractions so you would implement a float here
 */
public interface ListMathInterface<E> {
	
	
	public int size();
	
	public int numItems();
	
	public boolean isFull();
	
	public int Find(E element);
	
	public E get(int index);
	
	public E getNext();

}
