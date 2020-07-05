
/*
 * This is Assignment 2 - CIS 130
 * Farooq & Ahmed 
 * This program include 6 classes
 * 1- main
 * 2- BinarySearchTree
 * 3- AvlTree
 * 4-RunTimeTree
 * 5-Display
 * 6-Node
 * 
 *  
 * 
 * 
 * 
 * 
 */




import java.util.*;



public class main {

	
    private static Scanner in;

	static public void main(String[] args) throws InterruptedException{
    	boolean breakk=false;
    	int userInput = 0;
    	in = new Scanner(System.in); 
    	
    	while(!breakk){
    	System.out.print("What do you want to test?"
        			+ "\n  1) Binary Search Tree"
        			+ "\n  2) AVL Tree"
        			+ "\n  Enter Here:");
    	userInput = in.nextInt();
    	if(userInput==1){
    		System.out.print("You have selected - Binary Search Tree - Please Wait a moment");
    		new Display().printDots();
    		BSTrandGen();breakk=true;} // if user input =1 test BST Tree
    	else if(userInput==2) {
    		System.out.print("You have selected - AVL Tree - Please Wait a moment");
    		new Display().printDots();
    		AVLrandGen();breakk=true;} // if user input =2 test AVL Tree
    	else {
    		System.out.println("Please select either 1 OR 2");
    		}
    	}
 
    }
    
	
	// this function test BST. First it uses a random generated number between(0-9)
	//to insert. There is three different heights 3, 4, 5.
	// Also test contains method for each height 
	// test findmax and remove method for each height
	// ALL INPUTS ARE RANDMALLY GENERATED.

	public static void BSTrandGen() throws InterruptedException{
    	int minRange = 0;
        int maxRange = 9;
        int randNum = 0;
        Random rand = new Random();
        
    	BinarySearchTree tree= new BinarySearchTree(); // create an obj of BinarySearchTree
    	System.out.println("\n\nThis is BST tree. All the inputs were \n"
    			+ "generated using randmon generator.\n");
    	System.out.println("_________________________");
    	
    	// insert #'s of until you have height of 3, 4, and 5.
    	for(int i=3;i<=5;i++) {
    		System.out.println("BST Tree with level of "+ i);
	    	while (tree.height() != i){
	    		randNum = rand.nextInt(maxRange - minRange + 1) + minRange;
	    		tree.root = tree.insert(tree.root, randNum);
	        	}
	    	new Display().printLevel(tree.root); // level order display
	    	new RunTimeTree(); 
			RunTimeTree.runtimeTester(tree, i); // find how long contains method takes to search a number
	    	System.out.println("_________________________");
    	}
    	
    	System.out.print("\n\n\nTest the remaining functions");
    	new Display().printDots();
    	
    	// test the rest of the conditions 
    	BinarySearchTree tree2= new BinarySearchTree(); 
    	System.out.println("\nThe following tree is goning to test\n"
    			+ "*Remove, *contains *findMax Methods");	
      tree2.root = tree2.insert(tree2.root,1);
      tree2.root = tree2.insert(tree2.root,2);
      tree2.root = tree2.insert(tree2.root,3);
      tree2.root = tree2.insert(tree2.root,4);
      tree2.root = tree2.insert(tree2.root,5);
      new Display().printLevel(tree2.root);	
      
      // test remove and findMax methods
      System.out.println("\nTest contains Method: contains( 4 , tree.root ) = "+tree2.contains(4 ,tree2.root));
      tree2.remove(4 ,tree2.root);
      System.out.println("Test remove Method: remove( 4 , tree.root )");
      new Display().printLevel(tree2.root);
      System.out.println("Test remove Method: 4 was  removed as showed above");
      System.out.println("Test findMax Method: findMax( tree.root ) = "+ tree2.findMax(tree2.root).key);
    	
    }
    
	
	// this function test AVL. First it uses a random generated number between(0-9)
	//to insert. There is three different heights 3, 4, 5.
	// Also test contains method for each height 
	// test findmax and remove method for each height
	// ALL INPUTS ARE RANDMALLY GENERATED.
	
    public static void AVLrandGen() throws InterruptedException{
    	
    	int minRange = 0;
        int maxRange = 9;
        int randNum = 0;
        Random rand2 = new Random();
    	
    	
    	AvlTree tree3= new AvlTree(); // create an obj of AvlTree
    	
    	System.out.println("\n\nThis is AVL tree. All the inputs were \n"
    			+ "generated using randmon generator.\n");
    	System.out.println("_________________________");
    	
    	// insert #'s of until you have height of 3, 4, and 5.
    	for(int i=3;i<=5;i++) {
    		System.out.println("AVL Tree with level of "+ i); 
	    	while (tree3.height()!= i){
	    		randNum = rand2.nextInt(maxRange - minRange + 1) + minRange;
	    		tree3.root = tree3.insert(tree3.root, randNum);
	        	}
	    	new Display().printLevel(tree3.root); // level order display
	    	new RunTimeTree();
			RunTimeTree.runtimeTester(tree3, i); // find how long contains method takes to search a number
	    	System.out.println("\n_________________________");
    	}
    
    	System.out.print("\n\n\nTest the remaining functions");
    	new Display().printDots();
       
      // test the rest of the conditions 
      AvlTree tree4= new AvlTree();
      System.out.println("\n\nThe following tree is goning to test\n"
    			+ "*Remove, *contains *findMax Methods");	
      tree4.root = tree4.insert(tree4.root,1);
      tree4.root = tree4.insert(tree4.root,2);
      tree4.root = tree4.insert(tree4.root,3);
      tree4.root = tree4.insert(tree4.root,4);
      tree4.root = tree4.insert(tree4.root,5);

      new Display().printLevel(tree4.root);	
      
      
      // test remove and findMax methods
      System.out.println("\nTest contains Method: contains( 4 , tree.root ) = "+tree4.contains(4 ,tree4.root));
      tree4.remove(4 ,tree4.root);
      System.out.println("Test remove Method: remove( 4 , tree.root )");
      new Display().printLevel(tree4.root);
      System.out.println("Test remove Method: 4 was  removed as showed above");
      System.out.println("Test findMax Method: findMax( tree.root ) = "+ tree4.findMax(tree4.root).key);
    	
    }

   
    
}
