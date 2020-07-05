public class MyQueue {
	
	MyStack stack = new MyStack();
	
	public MyQueue(){
		super();
	}
	
	public MyQueue(String item){
		this();
		enqueue(item);
	}
	
	public MyQueue(String list[]){
		this();
		for(int i=0;i<list.length;i++){
	        enqueue(list[i]);
	    }
	}
	
	public void enqueue(String item) {
		MyStack tempstack= new MyStack();
		while(!stack.isEmpty()) {
			tempstack.push(stack.pop());
			}
		tempstack.push(item);
		while(!tempstack.isEmpty()) {
			stack.push(tempstack.pop());
		}
		
	}
	
	public void dequeue() {
		stack.pop();	
	}
	
	public void printQueue() {
		stack.printStack();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
}

















/*
if(stack.isEmpty()) {
			stack.push(item);
		}else{
			while(stack.isEmpty()) {
				temp.push(stack.pop());
				}
			stack.push(item);
			while(stack.isEmpty()) {
				stack.push(temp.pop());
			}
			
		}
		
		
String x,y;
			for(int i=0;i<MyStack.count;i++) {
				x=(stack.pop());
				temp[i]=x;
			}
			stack.push(item);
			for(int i=0;i<MyStack.count;i++) {
				y=temp[i];
				stack.push(y);
				
			}
			
			
			
//String[] temp = new String[1];
		if(stack.isEmpty()) {
			stack.push(item);
		}else{
			
			String x=(stack.pop());
			stack.push(item);
			stack.push(x);
			
		}
		
		
	MyStack temp = new MyStack();
		int c=0;
		MyStack.Node n=new MyStack.Node();
		n=MyStack.last;
		while(n!=null) {
			temp.push(stack.pop());
			c++;
			n=n.next;
		}
		temp.push(stack.pop());
		c++;
		System.out.println(c);
		temp.printStack();
*/