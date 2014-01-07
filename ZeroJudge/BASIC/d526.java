package BASIC;

import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

public class d526 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			Integer[] M = new Integer[N];
			
			for(int i = 0; i < M.length; ++i){
				M[i] = input.nextInt();
			}
			
			BinaryTree<Integer> tree = new BinaryTree<Integer>(M);
			Iterator<Integer> iterate = tree.preorderIterator();
			while(iterate.hasNext()){
				if(N > 1){
				    System.out.print(iterate.next() + " ");
				}
				else{
					System.out.print(iterate.next());
				}
				
				--N;
			}

			System.out.println();
		}
	}
}

interface Tree<E extends Comparable<E>> {
    //Return true if element found.
	public boolean search(E e);
    
	//Insert element e into the tree
	//return true if insert successfully
    public boolean insert(E e);
    
    //return # of nodes in the tree
    public int getSize();
    
    //return true if the tree is empty
    public boolean isEmpty();
    
    //return an iterator to traverse elements in the tree
    public Iterator<E> iterator();
}

abstract class AbstractTree<E extends Comparable<E>> implements Tree<E> {
  //return true if the tree is empty
    public boolean isEmpty(){
    	return getSize() == 0;
    }
    
    //return an iterator to traverse elements in the tree
    public Iterator<E> iterator(){
    	return null;
    }
}

class BinaryTree<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;
    
    public BinaryTree(){
    }
    
    public BinaryTree(E[] objects){
    	for(int i = 0; i < objects.length; ++i){
    		insert(objects[i]);
    	}
    }
    
    public boolean search(E e){
    	TreeNode<E> current = root;
    	
    	while(current != null){
    		if(e.compareTo(current.element) < 0){
    			current = current.left;
    		}
    		else if(e.compareTo(current.element) > 0){
    			current = current.right;
    		}
    		else{
    			return true;
    		}
    	}
    	
    	return false;
    }

    public boolean insert(E e){
    	if(root == null){
    		root = createNewNode(e);
    	}
    	else{
    		TreeNode<E> parent = null;
    		TreeNode<E> current = root;
    		
    		while(current != null){
    			if(e.compareTo(current.element) < 0){
    				parent = current;
    				current = current.left;
    			}
    			else if(e.compareTo(current.element) > 0){
    				parent = current;
    				current = current.right;
    			}
    			else{
    				return false;
    			}
    		}
    		
    		if(e.compareTo(parent.element) < 0){
    			parent.left = createNewNode(e);
    		}
    		else{
    			parent.right = createNewNode(e);
    		}
    	}
    	
    	++size;
		
		return true;
    }
    
    protected TreeNode<E> createNewNode(E e){
    	return new TreeNode<E>(e);
    }
    
    public static class TreeNode<E extends Comparable<E>>{
    	E element;
    	TreeNode<E> left;
    	TreeNode<E> right;
    	
    	public TreeNode(E e){
    		element = e;
    	}
    }
    
    public int getSize(){
    	return size;
    }
    
    public TreeNode<E> getRoot(){
    	return root;
    }
    
    public ArrayList<TreeNode<E>> path(E e){
    	ArrayList<TreeNode<E>> list = new ArrayList<TreeNode<E>>();
    	TreeNode<E> current = root;
    	
    	while(current != null){
    		list.add(current);
    		
    		if(e.compareTo(current.element) < 0){
    			current = current.left;
    		}
    		else if(e.compareTo(current.element) > 0){
    			current = current.right;
    		}
    		else{
    			break;
    		}
    	}
    	
    	return list;
    }

    public boolean delete(E e){
    	TreeNode<E> parent = null;
    	TreeNode<E> current = root;
    	
    	while(current != null){
    		if(e.compareTo(current.element) < 0){
    			parent = current;
    			current = current.left;
    		}
    		else if(e.compareTo(current.element) > 0){
    			parent = current;
    			current = current.right;
    		}
    		else{
    			break;
    		}
    	}
    	
    	if(current == null){
    		return false;
    	}
    	
    	if(current.left == null){
    		if(parent == null){
    			root = current.right;
    		}
    		else{
    			if(e.compareTo(parent.element) < 0){
    				parent.left = current.right;
    			}
    			else{
    				parent.right = current.right;
    			}
    		}
    	}
    	else{
    		TreeNode<E> parentOfRightMost = current;
    		TreeNode<E> rightMost = current.left;
    		
    		while(rightMost.right != null){
    			parentOfRightMost = rightMost;
    			rightMost = rightMost.right;
    		}
    		
    		current.element = rightMost.element;
    		
    		if(parentOfRightMost.right == rightMost){
    			parentOfRightMost.right = rightMost.left;
    		}
    		else{
    			parentOfRightMost.left = rightMost.left;
    		}
    	}
    	
    	--size;
    	
    	return true;
    }
    
    public Iterator<E> iterator(){
    	return preorderIterator();
    }
    
    public Iterator<E> preorderIterator(){
    	return new PreorderIterator();
    }
    
    class PreorderIterator implements Iterator<E>{
    	private ArrayList<E> list = new ArrayList<E>();
    	private int current = 0;
    	
    	public PreorderIterator(){
    		preorder();
    	}
    	
    	private void preorder(){
    		preorder(root);
    	}
    	
    	private void preorder(TreeNode<E> root){
    		if(root == null){
    			return;
    		}
    		
    		list.add(root.element);
    		preorder(root.left);
    		preorder(root.right);
    	}
    	
    	public boolean hasNext(){
    		if(current < list.size()){
    			return true;
    		}
    		
    		return false;
    	}
    	
    	public E next(){
    		return list.get(current++);
    	}
    	
    	public void remove(){
    		delete(list.get(current));
    		list.clear();
    		preorder();
    	}
    }
}



