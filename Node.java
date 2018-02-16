package binaryTreeAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Node {


	/**
	 * 
	 * @author ruman
	 * 
	 * Node is a class which has left node and right node and root node
	 *
	 */


		int value;
		Node left;
		Node right;
		Node root;
		
		/**
		 * 
		 * @node set  value to right node or left node
		 * this.value set the root node
		 */
		
		Node(int value){
			this.value = value;
			right = null;
			left = null;
		}
		//Starting node of our tree as root
		
		/**
		 * addRecursive is a function to add in a bianary tree passing the node current
		 * current can be root, right child or left child
		 * @node current
		 * @nodeValue value
		 * @return
		 */
		private Node addRecursive(Node current, int value) {
			if(current == null) {
			return new Node(value);
			}
			if(value < current.value) {
			current.left = addRecursive(current.left, value);
			}else if(value > current.value) {
			current.right = addRecursive(current.right, value);
			}else {
			return current;
			}
			return current;
		}
		
		
		



		/**
		 * creates binary tree and add root value
		 * @author root
		 *
		 */
		
		public class BinaryTree{
			Node root;
			public void add(int value) {
				root = addRecursive(root, value);
			}
			
		}
		/**
		 * creates a binary tree btree and add 6 as root node
		 * @return a binary tree
		 */
		public BinaryTree createBinaryTree() {
			BinaryTree btree = new BinaryTree();
			btree.add(6);
			btree.add(9);
			btree.add(3);
			btree.add(2);
			

		return btree;
		

		}
		/**
		 * checks the tree contains the value ata node current recursively
		 * Finding an element in binary tree
		 * @param current
		 * @param value
		 * @return
		 */
		private boolean containsNodeRecursive(Node current, int value) {
			if(current == null) {
				return false;
			}
			if(value == current.value) {
				return true;
			}
			return value< current.value
					? containsNodeRecursive(current.left, value)
					: containsNodeRecursive(current.right, value);
		}
		
		/**
		 * checks node value in boolean
		 * @param value
		 * @return
		 */
		public boolean containsNode(int value) {
			return containsNodeRecursive(root, value);
		}
		
		/**
		 * delete the value and the current node
		 * @node current
		 * @nodeValue value
		 * @return 
		 */
		private Node deleteRecursive(Node current, int value) {
			
			if(current == null) {
				return null;
			}
			if(value == current.value) {
				/**
				 * code to delete node
				 */
				if(current.left == null && current.right == null) {
					return null;
				}
				if(current.right == null) {
					return current.left;
				}
				if(current.left == null) {
					return current.right;
				}
				int smallestValue = findSmallestValue(current.right);
				current.value = smallestValue;
				current.right = deleteRecursive(current.right, smallestValue);
				return current;
				
			}
			if(value < current.value) {
				current.left = deleteRecursive(current.left, value);
				return current;
			}
			current.right = deleteRecursive(current.right, value);
			return current;
		}
		/**
		 * it finds which is the smallest value 
		 * @node root
		 * @return the smallest integer value in binary tree
		 */
		private int findSmallestValue(Node root) {
			return root.left == null ? root.value : findSmallestValue(root.left);
		}
		/**
		 * function to delete the value
		 * @nodeValue value
		 */
		public void delete(int value) {
			deleteRecursive(root, value);
		}

		
		/**
		 * Traversing the tree
		 * Tree traversing can be done in two ways:
		 * 1. Depth-first Search [goes deep as much as possible before going to next]
		 * 		It has 3 traversal
		 * 		i.   In-order   [left, root, right]
		 * 		ii.  Pre-order  [root, left, right]
		 * 		iii. Post-order [left, right, root]
		 * 2. Breadth- first Search
		 * 		visit all nodes of a level
		 * @param args
		 */
		
		/**
		 * In order traversal first goes to left print left value
		 * the check root value and then right value
		 * @node node
		 */
		public void traverseInOrder(Node node) {
			if(node != null) {
				traverseInOrder(node.left);
				System.out.print(" " + node.value);
				traverseInOrder(node.right);
			}
		}
		/**
		 * Pre order traversal first goes to root print root  value
		 * the check left value and then right value
		 * @node node
		 */
		public void traversePreOrder(Node node) {
			if(node != null) {
				System.out.print(" "+ node.value);
				traversePreOrder(node.left);
				traversePreOrder(node.right);
			}
		}
		/**
		 * Post order traversal first goes to left print left  value
		 * the check right value and then root value
		 * @node node
		 */
		public void traversePostOrder(Node node) {
			if(node != null) {
				
				traversePreOrder(node.left);
				traversePreOrder(node.right);
				System.out.print(" "+ node.value);
			}
		}
		
		/**
		 * traversing with Breadth-first Search
		 */
		public void traverseLevelOrder() {
			if(root ==null) {
				return;
			}
			
			Queue<Node> nodes = new LinkedList<>();
			nodes.add(root);
			while(!nodes.isEmpty()) {
				Node node = nodes.remove();
				System.out.print(" "+ node.value);
				
				if(node.left != null) {
					nodes.add(node.left);
				}

				if(node.right != null) {
					nodes.add(node.right);
				}
			}
		}
		
		
		public static void main(String[] args) {
			
			
			

		}
	}
