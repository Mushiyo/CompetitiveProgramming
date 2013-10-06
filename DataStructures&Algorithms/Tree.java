import java.util.Iterator;

public interface Tree<E extends Comparable<E>> {
    //Return true if element found.
	public boolean search(E e);
    
	//Insert element e into the tree
	//return true if insert successfully
    public boolean insert(E e);
    
    //Delete element e from the tree
    //return true if delete successfully
    public boolean delete(E e);
    
    //Inorder traversal from the root
    public void inorder();
    
    //Postorder traversal from the root
    public void postorder();
    
    //Preorder traversal from the root
    public void preorder();
    
    //return # of nodes in the tree
    public int getSize();
    
    //return true if the tree is empty
    public boolean isEmpty();
    
    //return an iterator to traverse elements in the tree
    public Iterator iterator();
}
