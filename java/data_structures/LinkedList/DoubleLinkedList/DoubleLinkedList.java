package data_structures.LinkedList.DoubleLinkedList;

/**
 * 
 * Implementation Class : Double Linked List (SLL)
 * 
 * NOTE : Bidirectional Traversal possible
 *  ----      ----      ----
 *  |  |<---->|  |<---->|  |----
 *  ----      ----      ----
 * 
 * Important Properties :
 * 
 * 1. Double Linked List is similar to Arrays, as it holds value/data
 * 2. Double Linked List is dynamic, extends/grows OR shrinks/decreases as data is added/deleted
 * 3. Addition/Deletion of data only from Head or Front of Single Linked List 
 * 
 * 
 * @author A.Ajjarani
 *
 */

/*

-------------           ------------
|   Prev    |          |   Prev    |
|           |          |           |
|           |          |           |
|-----------           |-----------
|	  Value	|<-------> |  Value	   |									
|           |          |           |
|		    |          |		   |
------------           ------------
|   Next    |          |   Next    |
|           |          |           |
|           |          |           |
------------           ------------


*/
public class DoubleLinkedList {
	// Front Link of the DLL
	private Link Head;
	
	// Tail Link of the DLL
	private Link Tail;
	
	
	/**
	 * Constructor : Always/Only Executed, when Object for DoubleLinkedList is created
	 *  i.e : Head = null, this means Head Link is instantiated/created with NULL
	 *  	  Tail = null, this means Tail Link is instantiated/created with NULL
	 */	
	public DoubleLinkedList() {
		this.Head = null;
		this.Tail = null;
	}
	
	
	
	/*
	 * Below following properties/characteristics of this Double Linked List are implemented
	 * 1. Insert Head Link
	 * 2. Insert Tail Link
	 * 
	 * 5. Display DLL
	 * 6. IsEmpty
	 * 
	 * Need to Do:
	 * 
	 * 6. Length
	 */
	
	
	/**
	 * Method Name : InsertHeadLink : Add Values at the Front of DLL
	 * 1. Create Link with Value
	 * 2. If DLL is Empty - Add the new Link as Tail
	 * 2.a If DLL is Not empty - access the Head & It's previous address & equate to newLink
	 * 
	 * 
	 * 
	 * @param headValue
	 */
	public void insertHeadLink(int headValue) {
		
		//1. Link is created with Value as "headValue",
		Link newLink = new Link(headValue);
		
		//2. Setting the Link into DLL
		if(isDLLEmpty()) {
			this.Tail = newLink;
		} else {
			// 2.a When adding an Link to existing DLL, get the
			// Earlier Head of DLL & Traverse to it's Previous Link Value
			this.Head.previous = newLink;
		}
		
		newLink.next = this.Head;
		this.Head = newLink;
	}
	
	
	

	/**
	 * Method Name : InsertHeadLink : Add Values at the Tail of DLL
	 * 1. Create a newLink with Value
	 * 
	 * Set the Following to back this as Tail
	 * 2. newLink/next -null
	 * 3. Current Existing Tail/next = newLink
	 * 4. newLink/previous = Current Existing Tail address
	 * 
	 * 5. Lastly - make Tail = newLink	 * 
	 * 
	 * @param headValue
	 */
	public void insertTailLink(int tailValue) {
		
		//1. Link is created with Value as "tailValue",
		Link newLink = new Link(tailValue);
		
		// 2. As this is the Last Link, Therefore Next will be Null
		newLink.next = null;
		
		//3. As The DLL is existing, get teh address of the newLink/Previous & make it Tail/next 
		this.Tail.next = newLink;
		newLink.previous = this.Tail;
		this.Tail = newLink;
		
	}
	
	
	
	/**
	 * MethodName : displayDLL :
	 * 
	 * Prints the complete Values stored in the DLL
	 * 
	 * 1. Starts Traversing from the head Link
	 * 2. Access the value at each Link & prints
	 * 3. until Exit Condition, End of DLL( i.e reference Link have == null)
	 *  
	 */
	public void displayDLL() {
		
		// 1. Start Traversing from Head Link	
		Link refLink = this.Head;
		
		// 2. Loop through the complete DLL & access Link 
		int i = 0;
		while(refLink != null) {
			System.out.println("The "+i +"th Position : "+refLink.value);
			refLink = refLink.next;
			i++;
		}
	}
	
	
	
	
	
	
	
	
	private boolean isDLLEmpty() {
		// TODO Auto-generated method stub
		return(Head == null);
	}



	/**
	 * 
	 * Static Main Method : Start of Thread:
	 * 
	 * 1. For Testing purpose of above implemented DLL
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		DoubleLinkedList  DLL1 = new DoubleLinkedList();
		
			
		DLL1.insertHeadLink(15);
		DLL1.insertHeadLink(12);
		
		DLL1.displayDLL();
		
		DLL1.insertTailLink(30);
		DLL1.displayDLL();
	}
}
