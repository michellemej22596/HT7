package tests;
import junit.framework.TestCase;
import model.AssociationEnglishToSpanish;
import model.BinaryTree;

public class testIncercionYBusqueda extends TestCase {
	
	public void testGivenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
	    
		//BinaryTree
		BinaryTree bt = new BinaryTree();
	  
		//Adding elements
		AssociationEnglishToSpanish  AssociationSpanish = new AssociationEnglishToSpanish ();
	    AssociationSpanish.setEnglishWord("HI");
        AssociationSpanish.setSpanishMeaning("HOLA");
        bt.add(AssociationSpanish);
	    
        //Contains elements
        assertTrue(bt.containsNode("HI"));
	    assertTrue(bt.containsNode("hi"));
	    
	}
}
