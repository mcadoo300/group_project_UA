package group_project2;

//generic LinkedList ADT
//
//METHODS:
/*
* int size() : returns the size of the list
* int numItems() : returns the number of items in the list
* boolean isFull() : will return true if the list is full || false if the list is not full
* int Find(E element) : will return the index value of the first occurrence of the element in the list || if not found will return -1
* E get(int index) : will return the element at the specified index || throws out of bounds exception when invalid index
* E getNext() : will return the next element in the list || throws out of bounds exception when exceeding the size of the list
* int getCurrPos() : will return current postion in lis
* 
*/

/*
* Private Data Members:
*Node<E> head; the reference to the first Node<E> || is null when empty
*int numItems; number of items in the list
*/

public class LinkedList<E extends Number> implements ListMathInterface<E> {
	
	private Node<E> head;
	
	private int numItems;
	
	private int currPos;
	
	//default constructor, creates empty list
	public LinkedList() {
		this.head=null;
		this.numItems=0;
		this.currPos=0;
	}
	
	public LinkedList(E[] dataSet) {
		
		this.currPos=0;
		this.head=new Node<E>(dataSet[0]);
		this.numItems=dataSet.length;
		for(int i=0;i<dataSet.length-1;i++) {
			this.goTo(i).setNode(new Node<E> (dataSet[i+1],null,this.goTo(i)));
		}
		
	}
	
	public Node<E> goTo(int position){
		
		int currPos=0;
		Node<E> currentNode=this.head;
		
		while(currPos!=position)
		{
			currPos++;
			currentNode=currentNode.getNext();
		}

		return currentNode;	
			
			
	}
	
	
	public int size() {
		return this.numItems;
	}
	
	public int numItems() {
		return this.numItems;
	}
	
	public boolean isFull(){
		return false;//will never be full
	}
	
	public int Find(E element) {
		for(int i=0;i<this.numItems;i++)
			if(this.goTo(i).getElement()==element)
				return i;
		
		return -1;//if not found return -1
	}
	
	public E get(int index) {
		return this.goTo(index).getElement();
	}
	
	public E getNext() {
		
		E returnValue = this.goTo(this.currPos+1).getElement();
		currPos++;
		return returnValue;
		
	}

}
