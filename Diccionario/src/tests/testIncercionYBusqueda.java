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
	    AssociationSpanish.setEnglishWord("hi");
        AssociationSpanish.setSpanishMeaning("hola");
        bt.add(AssociationSpanish);
        
        AssociationEnglishToSpanish  AssociationSpanish2 = new AssociationEnglishToSpanish ();
	    AssociationSpanish2.setEnglishWord("world");
        AssociationSpanish2.setSpanishMeaning("mundo");
        bt.add(AssociationSpanish2);
	    
        //Contains elements
        assertTrue(bt.containsNode(bt.getRoot(), "HI"));
	    assertTrue(bt.containsNode(bt.getRoot(), "WORLD"));
	    
	}
}
