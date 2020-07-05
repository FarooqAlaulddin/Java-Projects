
	
public class MyStack {
	
	static public class Node { 
		String data;
		Node next;
	}
	Node last; // will point to the last one to enter
	Node first; // will point to the first one to enter
	
	
	MyStack(){
		super();
	}
	MyStack(String item){
		super();
		push(item);
	}
	public MyStack(String[] list) {
		super();
	    for(int i=0;i<list.length;i++){
	        this.push(list[i]);
	    }
	}
	
	// Add value to the beginning of the list. Stack is LIFO.
	public void push(String item) {
		
		Node node = new Node();
		node.data=item;
		node.next=last;
		last=node;
	}
	
	
	public String pop() {
		if(!isEmpty()) {
		String value = last.data;
		last=last.next;
		return value;
		}else
			System.out.println("Can not pop! Empty");
			return "";
	}
	
	
	public boolean isEmpty() {
		if(last==null) 
			return true;
		else 
			return false;}
	
	
	public void printStack() {
		
		if(last!=null) {
			Node node= last;
			while(node.next!=null) {
				System.out.println(node.data);
				node=node.next;
			}
			System.out.println(node.data);
		}else
			System.out.println("Nothing to print!");
	}
		
}
