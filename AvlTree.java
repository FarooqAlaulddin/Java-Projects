class AvlTree extends BinarySearchTree { 
  
    Node root; 
  
    
    // insert function to AVL tree
    public Node insert(Node node, int key) {
    	
    	// Using BST method to insert a number then
    	// passing it to the balance method to check if
    	// the tree after the insertion satisfy  
    	// AVL rules.
    	return Balance(super.insert(node, key));
    }
    
    // Function to balance AVL Tree
    public Node Balance(Node node) { 

        node.height = 1 + (super.max(height(node.l), height(node.r))); // update height 

        
        // the following code will check every case of the four AVL rotation methods
        if (height(node.l) - height(node.r) > 1) {
        	 if ((super.height(node.l.l)) >= (super.height(node.l.r))) {
                 node = rightRotate(node); 
             } else {
                 node = doubleLeftRightRotation(node);
             }
        } else if(super.height(node.r) - super.height(node.l) > 1){
        	if ((height(node.r.r)) >= (height(node.r.l))) {
                node = leftRotate(node);
            } else {
                node = doubleRightLeftRotation(node);
            }
        }
        return node; 
    } 
    
    // contains method using super - BST method.
    public String contains(int key, Node n) {
		return super.contains(key, n);
		
	}
    // find max using super method
    public Node findMax(Node leafNode) {
		return super.findMax(leafNode);
	}
    
    
    // the next four functions are the four AVL rotation methods 
    // to put the node in its right place according to the AVL rules
    
    public Node rightRotate(Node y) { 
        Node x = y.l; 
        Node T2 = x.r; 
        
        // Perform rotation 
        x.r = y; 
        y.l = T2; 
  
        // Update heights 
        y.height = super.max(height(y.l), height(y.r)) + 1; 
        x.height = super.max(height(x.l), height(x.r)) + 1; 
  
        // Return new root 
        return x; 
    } 
    public Node leftRotate(Node x) { 
        Node y = x.r; 
        Node T2 = y.l; 
  
        // Perform rotation 
        y.l = x; 
        x.r = T2; 
  
        //  Update heights 
        x.height = super.max(height(x.l), height(x.r)) + 1; 
        y.height = super.max(height(y.l), height(y.r)) + 1; 
  
        // Return new root 
        return y; 
    } 
    
    public Node doubleLeftRightRotation (Node node){
        node.l = leftRotate(node.l); 
        return rightRotate(node); 
    }
    public Node doubleRightLeftRotation(Node node){
    	node.r = rightRotate(node.r); 
        return leftRotate(node); 
    }
    
    // helper using super - BST function
    public int height (Node leafNode){
		return super.height(leafNode);
	}
	
    // return height of the tree
	public int height(){
		return height(root);
	}
     
     
} 
    

  