package model;
//Código de referencia https://www.baeldung.com/java-binary-tree
public class BinaryTree {
	
	private Node root;
	
	private Node addRecursive(Node current, AssociationEnglishToSpanish  value) {
	    if (current == null) {
	        return new Node(value);
	    }

	    if (value.getEnglishWord().compareToIgnoreCase(current.value.getEnglishWord())< 0 ) {
	        current.left = addRecursive(current.left, value);
	    } else if (value.getEnglishWord().compareToIgnoreCase(current.value.getEnglishWord())> 0) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }

	    return current;
	}
	
	public void add(AssociationEnglishToSpanish  value) {
	    setRoot(addRecursive(getRoot(), value));
	}
	
	private boolean containsNodeRecursive(Node current, AssociationEnglishToSpanish  value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    return value.getEnglishWord().compareToIgnoreCase(current.value.getEnglishWord())< 0
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	
	public boolean containsNode(AssociationEnglishToSpanish  value) {
	    return containsNodeRecursive(getRoot(), value);
	}
	
	
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.value.getEnglishWord());
	        System.out.print(" " + node.value.getSpanishMeaning());
	        traverseInOrder(node.right);
	    }
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	
}
