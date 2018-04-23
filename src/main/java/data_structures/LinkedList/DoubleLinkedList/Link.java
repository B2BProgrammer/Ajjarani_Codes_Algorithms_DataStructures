package data_structures.LinkedList.DoubleLinkedList;

public class Link {
	
	// Value of the Node
	public int value;
	
	// Pointing to Front Node
	public Link next;
	
	// Pointing to Previous node
	public Link previous;
	
	
	/**
	 * Constructor of Link, 
	 * When the Link is called, Constructor is executed & value is always initialized
	 * 
	 * @param lValue
	 */
	public Link(int lValue) {
		this.value = lValue;
	}	

}
