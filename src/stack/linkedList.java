package stack;

public class linkedList
{
	//Private variables
	private LinkedListNode head;		//Reference to the first Object in the list
	
	//LinkedList Constructor Method
	public linkedList()
	{
		head = null;		//Creates an empty list
	}
	
	public LinkedListNode getHead() {
		return head;
	}
	
	public void setHead(LinkedListNode b) {
		head = b;
	}
	
	//Name		: insertFront
	//Behavior	: insert a new Object in front of list
	//Parameters: a Object
	//Return	: nothing
	public void insertFront(Object c)
	{
		LinkedListNode v = new LinkedListNode(c);
		if (head == null)
			head = v;		
		else
		{					
			v.setNext(head);	
			head = v;
		}
	}
	
	//Name		: search
	//Behavior	: search for a Object in the list
	//Parameters: a String
	//Return	: a Object
	
	/*
	public String search(Object target)
	{
		//Start search at the front of the list
		Object current = head;
		
		//Check for reaching the end of the list
		while (current != null)
		{
			if (current.getData() == target.getData())
			{
				return current.getData();	//If target Object has been found
			}
			current = current.getNext();	//Advance to the next Object
		}
		return null;	//If target Object has not been found
	}
	*/
	
	//Name		: removeFirstObject
	//Behavior	: remove Object at front of list
	//Parameters: nothing
	//Return	: nothing
	public Object removeFirstObject()
	{
		//Check for if the list is empty
		if (head == null)
		{
			System.out.println("Error: List is empty.");
			return null; 
		}
		else
		{
			
			LinkedListNode t = head;
			head = head.getNext();	
			t.setNext(null);	
			return t.getData(); 
		}
	}
	
	/*
	public void removeAnyObject(Object target)
    {
        //Object variables to move through the list
        Object current = head;
        Object previous = null;

        //Check for end of list
        while ((current != null) && (current.getData() != target.getData()))
        {
            previous = current;
            current = current.getNext();
        }
        if (current == null)    //Failed to find target Object
            return;                //Stops method
        if (previous == null)
        {
            Object t = head;
            head = head.getNext();
            t.setNext(null);
            t = null;
        }
        else
        {
            previous.setNext(current.getNext());
            current.setNext(null);
            current = null;
        }
    }
    */
}
