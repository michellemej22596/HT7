package model;
//Código de referencia https://www.baeldung.com/java-binary-tree
public class BinaryTree {
	
	private Node root;
	
	private Node addRecursive(Node current, AssociationFrenchToSpanish  value) {
	    if (current == null) {
	        return new Node(value);
	    }

	    if (value.getFrenchWord().compareToIgnoreCase(current.value.getFrenchWord())< 0 ) {
	        current.left = addRecursive(current.left, value);
	    } else if (value.getFrenchWord().compareToIgnoreCase(current.value.getFrenchWord())> 0) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }

	    return current;
	}
	
	public void add(AssociationFrenchToSpanish  value) {
	    setRoot(addRecursive(getRoot(), value));
	}
	
	public boolean containsNodeRecursive(Node current, String value) {
	    if (current == null) {
	        return false;
	    } 
	    
	    int comparisonResult = value.compareToIgnoreCase(current.value.getFrenchWord());
	    
	    if (comparisonResult == 0) {
	        System.out.println(current.value.getSpanishMeaning());
	        return true;
	    } 
	    
	    if (comparisonResult < 0) {
	        return containsNodeRecursive(current.left, value);
	    } else {
	        return containsNodeRecursive(current.right, value);
	    }
	}
	
	public boolean containsNode(Node root, String  value) {
	    return containsNodeRecursive(root, value);
	}
	
	
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(node.value.getFrenchWord()+":");
	        System.out.print(" " + node.value.getSpanishMeaning());
	        System.out.print(", ");
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
