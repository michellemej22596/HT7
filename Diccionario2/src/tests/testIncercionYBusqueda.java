package tests;
import junit.framework.TestCase;
import model.AssociationFrenchToSpanish;
import model.BinaryTree;

public class testIncercionYBusqueda extends TestCase {
	
	public void testGivenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
	    
		//BinaryTree
		BinaryTree bt = new BinaryTree();
	  
		//Adding elements
		AssociationFrenchToSpanish  AssociationSpanish = new AssociationFrenchToSpanish ();
	    AssociationSpanish.setFrenchWord("loger");
        AssociationSpanish.setSpanishMeaning("casa");
        bt.add(AssociationSpanish);
        
        AssociationFrenchToSpanish  AssociationSpanish2 = new AssociationFrenchToSpanish ();
	    AssociationSpanish2.setFrenchWord("oui");
        AssociationSpanish2.setSpanishMeaning("si");
        bt.add(AssociationSpanish2);
	    
        //Contains elements
        assertTrue(bt.containsNode(bt.getRoot(), "oui"));
	    assertTrue(bt.containsNode(bt.getRoot(), "loger"));
	    
	}
}
