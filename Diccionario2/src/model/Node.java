package model;

public class Node {
		AssociationFrenchToSpanish  value;
	    Node left;
	    Node right;

	    Node(AssociationFrenchToSpanish  value) {
	        this.value = value;
	        right = null;
	        left = null;
	    }
}
