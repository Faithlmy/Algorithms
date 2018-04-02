package April.a01;

// Definition the type of single link list.
class SNode{
	public int data;
	public SNode next;
	public SNode(int data) {
		this.data = data;
	}
}

public class LinkList {
	public SNode head;
	public int length = 0;
	
	// print the linked list
	public void printLinklist() {
		SNode p = head;
		while(p != null) {
			System.out.println(p.data);
			p = p.next;
//			length += 1;
		}
		System.out.println("the length is: " + length);
	}
	
	// Determine whether or not it is empty. 
	public Boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}
	
	// build the linked list using the last insertion method
	public void addLastNode(int data) {
		SNode n = new SNode(data);
		if(head == null) {
			head = n;
			length++;
			return ;
		}
		SNode q = head;
		while(q.next != null)
			q = q.next;
		q.next = n;
		length++;
	}
	
	// build the linked list using the head insertion method
	public void addHeadNode(int data) {
		SNode n = new SNode(data);
		if(head == null) {
			head = n;
			length++;
			return ;
		}
		n.next = head;
		head = n;
		length++;
	}
	
	// delete node
    public Boolean deleteNode(int index)  
    {  
        if(index<1||index>length)  
            return false;  
        int i=1;  
        SNode p=head;  
        while(i!=(index-1))  
        {  
            p=p.next;  
            i++;  
        }  
          
        (p.next)=(p.next.next);  
        length--;  
        return true;  
    } 
    
    // modify node
    public Boolean updateNode(int index,int data)  
    {  
        if(index<1||index>length)  
            return false;  
        int i=1;  
        SNode p=head;  
        while(i<index)  
            {p=p.next;i++;}  
        p.data=data;  
        return true;  
    }

}
