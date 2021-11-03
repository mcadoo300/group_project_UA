package group_project2;
//generic ArrayList ADT
//
//METHODS:
/*
* int size() : returns the size of the list
* int numItems() : returns the number of items in the list
* boolean isFull() : will return true if the list is full || false if the list is not full
* int Find(E element) : will return the index value of the first occurrence of the element in the list || if not found will return -1
* E get(int index) : will return the element at the specified index || throws out of bounds exception when invalid index
* E getNext() : will return the next element in the list || throws out of bounds exception when exceeding the size of the list
* int getCurrPos() : will return current postion in list
*/

/*
* Private Data Members:
* E[] numbers; an array of elements E
* int size; the size of the array
* int numItems; number of items currently in the list
* boolean isFull; true if full || false if not full
* int currPos; current position in list
*/
public class ArrayList<E extends Number> implements ListMathInterface<E>{
	
	//PDM's
	private E[] numbers;//list of numbers
	
	private int size;//size of array
	
	private int numItems;//number of items currently in list
	
	private boolean isFull;
	
	private int currPos;
	
	//default constructor, creates empty list
	public ArrayList(){
		
		this.numbers =null;
		
		this.size=0;
		
		this.numItems=0;
		
		this.isFull=false;
		
		this.currPos=0;
		
	}
	
	public ArrayList(E[] dataSet) {
		
		//create a copy of the list
		
		this.numbers=dataSet;
		
		this.size=dataSet.length;
		
		this.numItems=dataSet.length;
		
		this.isFull=true;
		
		this.currPos=0;//always start currPos at 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public int numItems() {
		return this.numItems;
	}
	
	public boolean isFull() {
		return this.isFull;
	}
	
	public int Find(E element) {
		
		//create a for loop to iterate through the array
		for(int i=0;i<this.numItems;i++)
			if(this.numbers[i]==element)
				return i;
		//if element is not found return -1
		return -1;
	}
	
	public E get(int index) {
		//remember to throw exception here
		return this.numbers[index];
	}
	
	public E getNext() {
		E returnValue;
		//remember to throw exception here
		returnValue = this.numbers[currPos+1];
			currPos++;
		
		return returnValue;
	}
	
	public int getCurrPos() {
		return this.currPos;
	}
	
	

}
