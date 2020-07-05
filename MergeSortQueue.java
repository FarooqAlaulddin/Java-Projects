//theta o^2
//the anwser for question 3.




/*
 *		   	   	   _____________________________
 *                 | ****** Question #3*******  |
 *                 |____________________________|
 * 
 * ******What the algorithm does?********
 * The program generate random letters and place them
 * into 2 queues, unsorted. Then takes the two queues
 * and merge them into one stack. then it used a temp
 * stack to arrange them alphabetically.
 * ----------------------------------------------------
 * ******The program purpose*********
 * Arrange a randomly generated letters alphabetically
 * 
 * **Each parameter is commented next to the code
 * **Returns letter in the correct order.
 * 
 * 
 * 
 */




import java.util.*; 

public class MergeSortQueue { 
      
	static Stack<String> stkSort = new Stack<String>(); 
    static Stack<String> tempStkSort = new Stack<String>(); 

    static void sortStack(Stack<String> tempStkSort) 
    { 
        while (!tempStkSort.isEmpty())  //sort
        { 
            							 
        	String temp = tempStkSort.pop(); // put the first element in temp
      
            // while temporary stack is not empty and 
            // top of stack is greater than temp 
            while (stkSort.size() != 0 && 			//a loop to go thru each
            		stkSort.peek().toCharArray()[0] //element of StkSort 
            				< temp.toCharArray()[0]){   // and if check if each
            											// element is grater than
            											// the string temp
                

            	tempStkSort.push(stkSort.pop());     // pop StkSort and push
            } 										// to the temp stack
            
            stkSort.push(temp); // push temp to the rea stack which is StkSort
        } 
    } 
      
    static void Merge(Queue<String> stk1, Queue<String> stk2) 
    { 
    	
        
        while (!stk1.isEmpty()) {		// push both unsorted queues into temp stack. 
        	tempStkSort.add(stk1.remove());    
        } 
        while (!stk2.isEmpty()) { 
        	tempStkSort.add(stk2.remove()); 
        } 

        sortStack(tempStkSort);  // call temp Stack to sort them 
    } 
    

    static String genRandLetter() {
    	
    	// this function generate a one random string and return it.
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder tempString = new StringBuilder();
        String randString =(tempString.append(letters.charAt(random.nextInt(letters.length())))).toString();
    	
		return randString;
    }

    static void print() { // print the sorted stack
    	
    	while (!stkSort.isEmpty()) { 
            System.out.print(stkSort.pop() + " ");  
        } 
    }
    
    static void essentials(Queue<String> stk1, Queue<String> stk2){
    	
    	// This function was made to clear up the main method.
    	// Display the welcome message
    	// Generate the random letters and assigned them to strings.
    	
    	
    	String st1,st2,st3,st4,st5,st6;
        
        System.out.println("This program Takes TWO unsorted ~Queue of Strings~"
        		+ " and SORT them alphabetically!\n"
        		+ " * The Letters are randomly generated.\n"
        		+ " * The program uses two Queues and merge them into one Stack.\n * Then it will use two Stacks to implement the sorting.");
        st1=genRandLetter();st2=genRandLetter();st3=genRandLetter();
        st4=genRandLetter();st5=genRandLetter();st6=genRandLetter();
        
        System.out.println("\n	The random Letters BEFORE storting: "
        							+ st1+" "+st2+" "+st3+" "+st4+" "+st5+" "+st6);
        
        System.out.print("	The random Letters AFTER  storting: ");

        stk1.add(st1);
        stk1.add(st2);
        stk1.add(st3);
        stk2.add(st4);
        stk2.add(st5);
        stk2.add(st6);
    }
    
    public static void main(String args[]){ 
        
    	Queue<String> stk1 = new LinkedList<String>(); // queue1
        Queue<String> stk2 = new LinkedList<String>(); // queue2

    	essentials(stk1,stk2); // pass stk1 and stk2
        Merge(stk1,stk2); 	  // pass stk1 and stk2
        print();

    } 
}

