package data_structures.LinkedList.SingleLinkedList;

import java.util.ArrayList;

/**
 * 
 * Implementation Class : Single Linked List (SLL)
 * 
 * NOTE : ONLY 1 way Traversal
 *  ----     ----     ----
 *  |  |---->|  |---->|  |----
 *  ----     ----     ----
 * 
 * Important Properties :
 * 
 * 1. Single Linked List is similar to Arrays, as it holds value/data
 * 2. Single Linked List is dynamic, extends/grows OR shrinks/decreases as data is added/deleted
 * 3. Addition/Deletion of data only from Head or Front of Single Linked List 
 * 
 * 
 * @author A.Ajjarani
 *
 */
public class SingleLinkedList {
	
	// 1. Only 1 Data Variable, i.e Node
	private Node headNode;
	
	/**
	 * Constructor : Always/Only Executed, when Object for SinglyLinkedList is created
	 *  i.e : headNode = null, this means Head Node is instantiated/created with NULL
	 */
	public SingleLinkedList() {
		super();		
		this.headNode = null;
	}
	
	/*
	 * Below following properties/characteristics of this Single Linked List are implemented
	 * 1. Insert Head Node
	 * 2. Insert nth Node
	 * 3. Delete Head Node
	 * 4. Delete all Nodes behind Nth Node
	 * 5. Display SLL
	 * 6. IsEmpty
	 * 
	 * Need to Do:
	 * 
	 * 6. Length
	 */
	
	
	/**
	 * @methodName : insertHeadNode :
	 * Inserts the element/Node at the start/Head of the SLL (Single Linked List)
	 * 
	 * 
	 * @param insNode
	 */
	public void insertHeadNode(int newValue) {
		// 1. Create a New Node, with the supplied Value, which will be part of SLL
		Node firstNode = new Node(newValue);
		
		// 2. For the new Created Node, Get the address of headNode,so 
		firstNode.next = headNode;
		
		// 3. Now the newNode created is part of SLL, as it is attached to as HEAD
		this.headNode = firstNode;
	}
	
	
	/**
	 * MethodName : insertNthNode
	 * Inserts the element/Node at the nth Position of the SLL (Single Linked List)
	 * 
	 * @param headNode
	 * @param newValue
	 * @param position
	 */
	public Node insertNthNode( int newValue, int position) {
		// 1. Create a New Node, with the supplied Value, which will be part of SLL
		   Node newNode = new Node(newValue);
	    
		   // 2.a Create a Link between a created Node & earlier present Node in SLL 
		   if (position == 0) {
			   newNode.next = headNode;
			   return newNode;
		   } else {
			   // 2.b Using currentNode or headNode as reference,where SLL will start navigating
			   Node currentNode = headNode;
			   
			   // 2.b.b Traverse until the position to add the Node is reached, starting from headNode
			   while(--position > 0) {
				   currentNode = currentNode.next;
			   }
			   
			   // 3. Exit condition, for above While is met - when position is reached, So add the newNode to SLL
			   newNode.next = currentNode.next;
			   currentNode.next = newNode;
			   return headNode;
		   }
	}
	
	
	/**
	 * MethodName : displaySLL :
	 * 
	 * Prints the complete Values stored in the SLL
	 * 
	 * 1. Starts Traversing from the head Node 
	 * 2. Access the value at each Node & prints
	 * 3. until Exit Condition, End of SLL( i.e Node have address/next == null)
	 *  
	 */
	public void displaySLL() {
		
		// 1. Start Traversing from Head Node		
		Node eachNode = this.headNode;
		
		// 2. Loop through the complete SLL & access eachNode 
		int i = 0;
		while(eachNode != null) {
			// 3. Print the value of corresponding node
			System.out.println("The "+i +"th Position : "+ eachNode.getValue()+" ");
			i++;
			// 4. Get the next Node address, which is stored in next NODE
			eachNode = eachNode.next;
		}
	}
	
	
	
	/**
	 * MethodName : deleteHead()
	 * 
	 * : Deletes the Head Node of SLL
	 * 
	 * 1. As, SLL would be referencing the first/Head node always.
	 * 2. Just remove the reference, Point the second node in SLL as HeadNode
	 * 3. This will, internal unlink/remove the First/Head Node from SLL
	 * 
	 */
	public void deleteHead() {		
		// 1. Making the second node in the SLL, as First Node by derefercing the Head
		this.headNode = this.headNode.next; 
	}
	
	
	
	/**
	 * deleteAllNodesBehindN
	 * 
	 * 1. Delete all teh nodes behind the nth Element	 * 
	 * 
	 * @param position
	 */
	public void deleteAllNodesBehindN(int position) {		
		Node refNode = this.headNode;		
		while(--position > 0) {			
			refNode = refNode.next;
		}
		
		this.headNode = refNode.next;
	}
	
	
	/**
	 * 1. Checks if the HeadNode is NULL [ i.e SLL is empty]
	 * @return
	 */
	public boolean isSLLEmpty() {
		if(headNode == null) {
			return true;
		} else {
			return false;
		}			
	}
	


	
	
	/**
	 * 
	 * Static Main Method : Start of Thread:
	 * 
	 * 1. For Testing purpose of above implemented SLL
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		SingleLinkedList  SLL1 = new SingleLinkedList();
		
		
		/*
		 * SLL Creation & Adding Values
		 */
		//  500 -> 11 -> 8 -> 6 -> 4 -> 10
		SLL1.insertHeadNode(10); //5th Position
		SLL1.insertHeadNode(4); //4th Position
		SLL1.insertHeadNode(6); //3th Position
		SLL1.insertHeadNode(8); //2th Position
		SLL1.insertHeadNode(11); //1th Position
		SLL1.insertHeadNode(500);  //0th Position
		
		// SLL Adding at Specific Location
		//  500 -> 11 -> 8 -> 6 ->32 -> 4 -> 10
		SLL1.insertNthNode(32, 4);
		
		//  500 -> 11 -> 8 -> 6 ->32 -> 4 -> 10 ->5000
		SLL1.insertNthNode(5000, 7);
		
		
		// Deleting the head Node
		SLL1.deleteHead();
		
		// Deleting all the Nodes in SLL, behind the specific "n"
		SLL1.deleteAllNodesBehindN(3);
		
		// Print the Single Linked List	
		SLL1.displaySLL();
		
	}	

}



 