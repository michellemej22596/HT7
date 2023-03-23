package tests;
import junit.framework.TestCase;
import model.BinaryTree;

public class testBusqueda extends TestCase {
	
	public void testGivenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
	    BinaryTree bt = new BinaryTree();
	    bt.add("Hola");
	    assertTrue(bt.containsNode("Hola"));
	    
	}
}
