//	Question 2.


//theta nlogn 


/*
 * Runtime of O(n Log n)
 * 
 * 
 * 
 *		   	   	   _____________________________
 *                 | ****** Question #2*******  |
 *                 |____________________________|
 * 
 * 
 * 
 *      ***** What the program does && purpose ?*****
 *  The program is simply a merge sort. It takes a randomly 
 *  generated numbers and arrange them from the highest to the lowest
 *  using merge sort technique which is basically divide the array
 *  recursively each time. /2. And merge after sorting. Then it pushes
 *  the sorted array into a ** STACK **. Then we have a sorted stack from 
 *  unsorted random array of numbers.
 *  
 * **Each parameter is commented next to the code.
 * **Returns a sorted stack. Highest to lowest.
 *   
 * 
 */
import java.util.*;

public class MergeSort {
    
    static Stack<Integer> stk = new Stack<Integer>();
    
    
    void merge(int low, int middle, int high, int arrRand[]) { // merge and sort
 
    	 int[] temp=new int[arrRand.length];	// temp
    	 
    	 int i = low;
         int j = middle + 1;
         int k = low;
    	
        for (int x = low; x <= high; x++){	// move to temp arr
        	temp[x] = arrRand[x];
        }
        for(;i <= middle && j <= high;k++){  // Merge temp arr
        	
            if(temp[i] <= temp[j]) {arrRand[k] = temp[i];i++;}
            else{arrRand[k] = temp[j];j++;}   
            
        }for(;i <= middle;) { // move rest
        	arrRand[k] = temp[i];
        	k++;
            i++;
        }
    }
    
    void Sort(int low, int high,int arrRand[]) {
        
    	// this is the recur function of the Merge sort

        if (low < high) { 						// do while low less than high
            int middle =  (high + low) / 2; 	// find the middle of the array
            Sort(low, middle, arrRand);			// call sort and pass from low and mid
            Sort(middle + 1, high, arrRand);	// call sort and pass from after mid to end
            merge(low, middle, high, arrRand);	// call merge to sort them highest num to lowest
        }
    }

    static void ToStack(int inputArr[]){
    	// push the array into a stack
    	for(int i=0; i<inputArr.length;i++) {
    		stk.push(inputArr[i]);
    	}
    }

    static int getRandNumbers() {
    	// Function to generate random numbers
    	Random rand = new Random();
    	int randomNum = rand.nextInt(9+1) + 0;
    	return randomNum;
    }
    
    static void printStack() {
    	//function to print the stack
    	System.out.print("The random Set Numbers AFTER  storting: ");
        while(!stk.isEmpty()) {
    		System.out.print(stk.pop()+ " ");
    	}
    }
    
    public static void main(String a[]){
        
    	int st1,st2,st3,st4,st5,st6;
    	
        System.out.println("This program uses Merge sort method with a STACK"
        		+ " to SORT a random generated numbers from the highest to the lowest!\n");
        
        st1=getRandNumbers();st2=getRandNumbers();st3=getRandNumbers();  // Generate random numbers
        st4=getRandNumbers();st5=getRandNumbers();st6=getRandNumbers();  // and assign them to vars(int).
        
        System.out.println("The random Set Numbers BEFORE storting: "					// Display the numbers
        							+ st1+" "+st2+" "+st3+" "+st4+" "+st5+" "+st6);		// before sorting
        
        int[] arrRand= {st1,st2,st3,st4,st5,st6};	// put the array in an array
   
        MergeSort obj = new MergeSort();           // Object type of MergeSort
        obj.Sort(0, arrRand.length-1, arrRand);	   // pass low as 0 and high as array of length and array itself
        
        ToStack(arrRand); // push the sorted array into Stack
        printStack();	// print the stack
        
        
        
    }  
}