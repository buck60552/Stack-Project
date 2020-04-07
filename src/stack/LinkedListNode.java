package stack;


public class LinkedListNode 
{
	private Object data;
	private LinkedListNode next;
	
	//LinkedListNode Construct
	public LinkedListNode(Object d)
	{
		data = d;
		next = null;
	}
    
	//Name: getData
	//Behavior: gets data
	//Parameters: na
	//Return: Object
	public Object getData()
	{
	return data;
	}
	
	//Name: getNext
	//Behavior: gets next
	//Parameters: na
	//Return: LinkedListNode
	public LinkedListNode getNext()
	{
    return next;
	}
	
	//Name: setData
	//Behavior: sets data
	//Parameters: Object 
	//Return: na
	public void setData(Object d)
	{
	data = d;
	}
	
	//Name: setNext
	//Behavior: sets data
	//Parameters: LinkedListNode 
	//Return: na
	public void setNext(LinkedListNode n)
	{
	next = n;
	} 
	
	//Name: toString
	//Behavior: converts data into a string
	//Parameters: na
	//Return: String
	public String toString()
    {
        String node;
        node = data + " ";
        return node;
    }
}
