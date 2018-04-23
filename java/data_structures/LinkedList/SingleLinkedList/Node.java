package data_structures.LinkedList.SingleLinkedList;


/**
 * Node :
 * 
 *  ----
 *  |  |----
 *  ----
 *  
 *  Integral part of each LinkedList.
 *  a. Node (Value Data + Link)
 *  b. Link
 *  
 *   
 *  
* @author A.Ajjarani
*
*/



class Node {
	
	// 1. Value to be stored in the Node of the List 
	public int value;	
	// 2. Pointer for the next Node - Link between each nodes
	public Node next;
	
	
	
	/**
	 * Constructor : 
	 * When the Node is called, Constructor is executed & value is always initialized
	 * 
	 * @param value
	 * @param next
	 */
	public Node(int value) {
		super();
		this.value = value;
		
	}
	
	
	/**
	 * getValue - Utilized to return the stored value in the Node
	 * 
	 * @return
	 */
	public int getValue() {
		return this.value;
	}
	
	
}
