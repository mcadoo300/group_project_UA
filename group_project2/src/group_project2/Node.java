package group_project2;


public class Node<E> {
	
	
	// element of node
		private E element;

		// link to next node
		private Node<E> next;

		// link to previous
		private Node<E> previous;

		// default constructor
		//creates empty node
		public Node() {
			this.element = null;
			this.previous = null;
			this.next = null;
		}

		// construct a node with element
		// @parameter element element for the specified Node
		public Node(E element) {
			this.element = element;
			this.previous = null;
			this.next = null;
		}

		// create a node from another node
		//@parameter copy is the node to be copied
		public Node(Node<E> copy) {
			this.element = copy.element;
			this.previous = copy.previous;
			this.next = copy.next;
		}

		// construct a node of specified element and specified next and previous node
		// @parameter element is the String character for the specified Node
		// @parameter next is the next Node
		// @parameter previous is the previous node
		public Node(E element, Node<E> next, Node<E> previous) {
			this.element = element;
			this.previous = previous;
			this.next = next;
		}

		// return element of this node
		// @return the element of this node
		public E getElement() {
			return this.element;
		}

		// set element of a specific node
		// @parameter element is the String character for the specified Node
		public void setElement(E element) {
			this.element = element;
		}

		// returns the next node
		// @return the next node
		public Node<E> getNext() {
			return this.next;
		}

		// set new next node
		// @param node in the new node
		public void setNode(Node<E> next) {
			this.next = next;
		}

		// returns the previous node
		// @return the previous node
		public Node<E> getPrevious() {
			return this.previous;
		}

		// set new previous node
		// @param node in the new node
		public void setPrevious(Node<E> previous) {
			this.previous = previous;
		}

		// return string representation of this node
		// @return string
		public String toString() {
			return this.element.toString();
		}

}
