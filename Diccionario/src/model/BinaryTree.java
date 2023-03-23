package model;
//Código de referencia https://www.baeldung.com/java-binary-tree
public class BinaryTree {
	
	Node root;
	
	private Node addRecursive(Node current, String value) {
	    if (current == null) {
	        return new Node(value);
	    }

	    if (value.compareToIgnoreCase(current.value)< 0 ) {
	        current.left = addRecursive(current.left, value);
	    } else if (value.compareToIgnoreCase(current.value)> 0) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }

	    return current;
	}
	
	public void add(String value) {
	    root = addRecursive(root, value);
	}
	
	private boolean containsNodeRecursive(Node current, String value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    return value.compareToIgnoreCase(current.value)< 0
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	
	public boolean containsNode(String value) {
	    return containsNodeRecursive(root, value);
	}
	
	public void traversePostOrder(Node node) {
	    if (node != null) {
	        traversePostOrder(node.left);
	        traversePostOrder(node.right);
	        System.out.print(" " + node.value);
	    }
	}
	
	
}
