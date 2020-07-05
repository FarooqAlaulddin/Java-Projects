import java.util.*;

public class MyTest {
	
	static Scanner in = new Scanner(System.in); 
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(" Welcome to my program\n"
				+ "   Please select wnat you want to dispaly: "
				+ "type: (Stack) OR (queue) ");
		System.out.print("     Type here :");
		String Input = in.next();
		switch(Input) {
		
		case "stack": {myStackMethod(); break;}
		case "queue": {myQueMethod();   break;}
		default: System.out.println("Wrong! select: stack OR queue");
		}
		
	}

	
	
	
	
	
	private static void myStackMethod() {
		
		System.out.println("\t~~~~~~~~~_-MyStack-_~~~~~~~~~");
				   	
		
		System.out.println("\tusing the default constructor\n");
		MyStack stack = new MyStack();  // using the default constructor
		System.out.println("push items into the stack:");
		stack.push("jack");            // push one item into the stack
		stack.push("justin");         
		stack.push("lura");          
		stack.printStack();			// print the items in the stack
		System.out.println("___________________________");
		System.out.println("After one POP():");
		stack.pop();              // pop the top item on the stack
		stack.printStack();
		System.out.println("___________________________");
		System.out.println("After POP() every element in the stack:");
		stack.pop(); 			// pop the reminder items on the stack
		stack.pop();
		stack.printStack();    // print again. It should show that it is empty.
		System.out.println("___________________________");
		System.out.println("POP() on empty Stack:");
		stack.pop(); 			// if pop on empty stack. shows a warring message.
		
		System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
		
		System.out.println("\tusing the constructor with one item only\n");
		MyStack stack1 = new MyStack("cat");	//using the constructor with one item only
		stack1.push("dog");						// push directly
		stack1.push("buflow");					// push directly
		stack1.printStack();						//print
		System.out.println("___________________________");
		System.out.println("After one POP():");
		stack1.pop();              // pop the top item on the stack
		stack1.printStack();
		System.out.println("___________________________");
		System.out.println("After POP() every element in the stack:");
		stack1.pop(); 			// pop the reminder items on the stack
		stack1.pop();
		stack1.printStack();    // print again. It should show that it is empty.
		System.out.println("___________________________");
		System.out.println("POP() on empty Stack:");
		stack1.pop(); 			// if pop on empty stack. shows a warring message.
		
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		
		//using the constructor with multiple items (list)..
		System.out.println("\tusing the constructor with multiple items (list)..\n");
		String list[] = {"horse","bird","mouse"};
		MyStack stack2 = new MyStack(list); 		//passing an array of strings
		stack2.printStack();						//print
		System.out.println("___________________________");
		System.out.println("After one POP():");
		stack2.pop();              // pop the top item on the stack
		stack2.printStack();
		System.out.println("___________________________");
		System.out.println("After POP() every element in the stack:");
		stack2.pop(); 			// pop the reminder items on the stack
		stack2.pop();
		stack2.printStack();    // print again. It should show that it is empty.
		System.out.println("___________________________");
		System.out.println("POP() on empty Stack:");
		stack2.pop(); 			// if pop on empty stack. shows a warring message.

		System.out.println("\n\t\t\t\t__________________________________END OF MyStack__________________________________\n\n");
		
		}
		
	
	
	private static void myQueMethod() {
		
		// using the default constructor
		System.out.println("~~~~~~~~~MyQueue~~~~~~~~~");
		System.out.println("\tusing the default constructor\n");
		MyQueue q = new MyQueue();  // using the default constructor
		System.out.println("push items into the Queue:");
		q.enqueue("jack");            // push one item into the stack - first one entered 
		q.enqueue("justin");         
		q.enqueue("lura");          
		q.printQueue();				// print the items in the stack
		System.out.println("___________________________");
		System.out.println("After one Dequeue():");
		q.dequeue();              // pop the top item on the stack
		q.printQueue();
		System.out.println("___________________________");
		System.out.println("After POP() every element in the Queue:");
		q.dequeue();  			// pop the reminder items on the stack
		q.dequeue();  
		q.printQueue();	    // print again. It should show that it is empty.
		System.out.println("___________________________");
		System.out.println("Dequeue() on empty Stack:");
		q.dequeue(); 			// if pop on empty stack. shows a warring message.
		
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		
		//using the constructor with one item only
		System.out.println("\tusing the constructor with one item only\n");
		MyQueue q1 = new MyQueue("cat");  // first one entered
		q1.enqueue("dog");
		q1.enqueue("bufflow");
		q1.printQueue();
		System.out.println("___________________________");
		System.out.println("After one Dequeue():");
		q1.dequeue();              // pop the top item on the stack
		q1.printQueue();
		System.out.println("___________________________");
		System.out.println("After POP() every element in the Queue:");
		q1.dequeue();  			// pop the reminder items on the stack
		q1.dequeue();  
		q1.printQueue();	    // print again. It should show that it is empty.
		System.out.println("___________________________");
		System.out.println("Dequeue() on empty Stack:");
		q1.dequeue(); 			// if pop on empty stack. shows a warring message.
		
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		
		//using the constructor with multiple items (list)..
		System.out.println("using the constructor with multiple items (list)..\n");
		String[] list1 = {"horse","bird","mouse"};
		MyQueue q2 = new MyQueue(list1);
		q2.printQueue();
		System.out.println("___________________________");
		System.out.println("After one Dequeue():");
		q2.dequeue();
		q2.printQueue();
		System.out.println("___________________________");
		System.out.println("After POP() every element in the Queue:");
		q2.dequeue();  			// pop the reminder items on the stack
		q2.dequeue();  
		q2.printQueue();	    // print again. It should show that it is empty.
		System.out.println("___________________________");
		System.out.println("Dequeue() on empty Stack:");
		q2.dequeue(); 			// if pop on empty stack. shows a warring message.
		
		System.out.println("\n\t\t\t\t__________________________________END OF My Queue__________________________________\n\n");
		
		
		
		
	}

	
}



