//theta o^2
//the anwser for question 3.


/*
 *				   _____________________________
 *                 | ****** Question #4*******  |
 *                 |____________________________|
 * 
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

public class q4 { 
      
	static Stack<String> stkSort = new Stack<String>(); 
    static Stack<String> tempStkSort = new Stack<String>(); 

    static void sortStack(Stack<String> tempStkSort) 
    { 
        while (!tempStkSort.isEmpty())  
        { 
            							 
        	String temp = tempStkSort.pop(); // put the first element in temp 
      

            while (stkSort.size() != 0 && 			//a loop to go thru each
            		stkSort.peek().toCharArray()[0] //element of StkSort 
            				< temp.toCharArray()[0]){   // and if check if each
            											// element is grater than
            											// the string temp
                

            	tempStkSort.push(stkSort.pop());     // pop StkSort and push 
            } 										// to the temp stack
            
            stkSort.push(temp); // push temp to real stack which isStkSort
        } 
    } 
      
    static void Merge(Queue<String> stk1, Queue<String> stk2) 
    { 
    	
        
        while (!stk1.isEmpty()) {		// push both unsorted queues into stack. 
        	tempStkSort.add(stk1.remove());    
        } 
        while (!stk2.isEmpty()) { 
        	tempStkSort.add(stk2.remove()); 
        } 

        sortStack(tempStkSort);  // call tempsortStack to sort them 
    } 
    

    static String genRandLetter() {
    	
    	// this function generate a one random string and return it.
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder tempString = new StringBuilder();
        String randString =(tempString.append(letters.charAt(random.nextInt(letters.length())))).toString();
    	
		return randString;
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
        /*				   ____________________________
         *                | ****** Question #4*******  |
         *                |____________________________|
         *                
         *  Insert A bug that causes runtime exception.
         *  
         *  The runtime error I inserted into 
         *  my code is ** java.util.EmptyStackException**
         *  It occurs due to the line #140
         *  The runtime error occurs while printing the sorted stack
         *  since the stack has a length of n, the loop below is
         *  incrementing n (++n) with each time the loop repeat.
         *  It will increment and keep poping from stkSort till
         *  it reaches print everything on the stack and reaches
         *  the end and beyond. Therefore it will try to pop on
         *  empty stack which it **Runtime error**
         *  
         *  n starts with 6 then 7 then 8 then 9 then 10 then 11
         *  then 12 then at 13 it will try and pop on empty stack!Err
         *  
         *  		******	How To Fix ********
         *  To fix the error, the while loop has to decrement n with
         *  each repeat (--n).
         *  so that n starts with 6 then 5 then 4 then 3 then 2 then 1
         *  then 0 and exit because the it is equal to the condition.
         */
        int n=stkSort.size();
    	while (n!=0) { 
            System.out.print( stkSort.pop() + " ");
            ++n;      // WRONG! Should be --n. run time err
        } 
    } 
}
