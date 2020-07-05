
public class BinarySearchTree{
	
	Node root;  // create a root node
	
	// insert function
	public Node insert( Node n, int key) {
		
		if(n==null) {
			return new Node(key);
		}
		if(key>n.key) {
			n.r= insert(n.r, key);
		}else
			n.l = insert(n.l,key);
		n.height = max(height(n.l), height(n.r))+1;
		
		return n;
	}
	
	
	// remove
	public Node remove(int key, Node leafNode) {
		if (leafNode == null) {
			return leafNode;
		}
		if (key != leafNode.key) {
			if (key > leafNode.key){
				leafNode.r = remove(key, leafNode.r);
			}else{
				leafNode.l = remove(key, leafNode.l);
			}
		}

		else if (leafNode.l != null && leafNode.r != null) {

			leafNode.key = findMax(leafNode.l).key;
			leafNode.l = remove(leafNode.key, leafNode.l);
		} else {
			leafNode = (leafNode.r !=null) ? leafNode.r : leafNode.l;
		}

		return leafNode;
	}
	
	// find the maximum number in the tree
	public Node findMax(Node leafNode) {
		if (leafNode.r != null)
			return findMax(leafNode.r);
		return leafNode;
	}
	
	
	// search a number in the tree
	public String contains(int key, Node n) {
		
		if(n==null) return "NOT Found";
		
		// contain method - return 1 or -1 or zero depending on key
		int compareResult=compereTo(key, n); 
		
		if (compareResult <0) 
			return contains(key, n.l);
		else if(compareResult>0) 
			return contains(key, n.r);
		else

			return "Found";

		

	}
	
	
	// helper method to return int 1 if input in larger than the current node
	// or -1 if less. or 0 if equal.
	public int compereTo(int key, Node n) {
		
		if(n.key>key) {return -1;}
		if(n.key<key) {return 1;}
		
		return 0;
	}
	
	// helper method to return the height of leaf node
	public int height (Node leafNode){
		if (leafNode == null)
			return (0); // or set it to be -1
		return leafNode.height;
	}
	
	//  helper method to return the height of tree
	public int height(){
		return height(root);
	}
	
	
	// helper method - compare to two values and return max
	public int max(int leftHeight, int rightHeight){
		if(leftHeight > rightHeight)
			return leftHeight;
		return rightHeight;
	}
	
	
	// get hold of root node
	public Node getRoot() {
		return root;
	}
	

}