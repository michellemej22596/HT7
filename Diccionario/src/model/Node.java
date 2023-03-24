package model;

public class Node {
		AssociationEnglishToSpanish  value;
	    Node left;
	    Node right;

	    Node(AssociationEnglishToSpanish  value) {
	        this.value = value;
	        right = null;
	        left = null;
	    }
}
