
public class Display extends AvlTree{
	
	// this class is to display the tree in level order using recursion.
	
	public void printLevel(Node root) {

        for (int i = 1; i <= heightAVL(root); i++) {
            System.out.print("Level " + i + " : ");
            printLevelRecur(root, i);
            System.out.print("\n");

        }
    }
    public int heightAVL(Node root) {
        if (root != null)
        	return super.max(heightAVL(root.l), heightAVL(root.r)) + 1;
        return 0;
    }

    public void printLevelRecur(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.key + " ");
        else if (level > 1) {
        	printLevelRecur(root.l, level - 1);
        	printLevelRecur(root.r, level - 1);
        }
    }
    
    
    // this function make the program hold for few seconds. Just for fun!!!
    public void printDots() throws InterruptedException {
    	for(int i=0;i<5;i++) {
    		System.out.print(".");
    		Thread.sleep(1000);
    		
    	}
    }
	
}
