import java.text.DecimalFormat;
import java.util.Random;

public class RunTimeTree {

	// this function will calculate how long the contains method 
	// takes to run in different situations & heights

    public static void runtimeTester( BinarySearchTree  tree, int i) throws InterruptedException{
    	  
    	
    	String search;
    	int minRange = 0;
        int maxRange = 9;
        int randNum = 0;
        Random rand = new Random();
        randNum = rand.nextInt(maxRange - minRange + 1) + minRange;
    	
    	long startTime,stopTime;
    	startTime = System.nanoTime();
    	search=tree.contains(randNum ,tree.root);
        stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        double k=elapsedTime/ 1000000.0;
        
        System.out.print("\nLooking For "+randNum+" in the above BST Tree. Please wait ");
        new Display().printDots();
        System.out.println("\n\nResult :  "+randNum+" was " + search +"\nTime took to run contains method (parameter of "+ randNum +" ) with hieght "
        		+ "of "+ i +" is :"+k);
    }
    
    public static void runtimeTester( AvlTree  tree, int i) throws InterruptedException{
    	String search;
    	int minRange = 0;
        int maxRange = 9;
        int randNum = 0;
        Random rand = new Random();
        randNum = rand.nextInt(maxRange - minRange + 1) + minRange;
    	
    	long startTime,stopTime;
    	startTime = System.nanoTime();
    	search=tree.contains(randNum ,tree.root);
        stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        double k=elapsedTime/ 1000000.0;
        
        System.out.print("\nLooking For "+randNum+" in the above AVL Tree. Please wait ");
        new Display().printDots();
        System.out.print("\n\nResult :  "+randNum+" was " + search +"\nTime took to run contains method (parameter of "+ randNum +" ) with hieght "
        		+ "of "+ i +" is :");
        System.out.println(new DecimalFormat(" #.#######").format(k));
    }
	
	
}
