import java.util.Iterator;

public abstract class AbstractTree<E extends Comparable<E>> implements Tree<E> {
	//Inorder traversal from the root
    public void inorder(){
    }
    
    //Postorder traversal from the root
    public void postorder(){
    }
    
    //Preorder traversal from the root
    public void preorder(){
    }

  //return true if the tree is empty
    public boolean isEmpty(){
    	return getSize() == 0;
    }
    
    //return an iterator to traverse elements in the tree
    public Iterator<E> iterator(){
    	return null;
    }
}
