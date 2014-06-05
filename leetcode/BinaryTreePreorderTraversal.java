package leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 二叉树的先序遍历
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * Given binary tree {1,#,2,3},
 * return [1,2,3].
 * @author yonney
 *
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinaryTreePreorderTraversal {
	 public ArrayList<Integer> preorderTraversal(TreeNode root) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 if(root == null){
			 return list;
		 }
		 preorderTraversal1(root, list);
		 return list;
	 }
	 /**
	  * 二叉树递归调用
	  * 该方法不能写在上面，因为当递归调用时会重新new一个List对象，这样结果永远都只有一个节点的值
	  * @param root
	  * @param list
	  * @return
	  */
	 ArrayList<Integer> preorderTraversal(TreeNode root,ArrayList<Integer> list ){
		 list.add(root.val);
		 if(root.left != null){
			 preorderTraversal(root.left,list);
		 }
		 if(root.right != null){
			 preorderTraversal(root.right,list);
		 }
		 return list;
	 }
	 /**
	  * 二叉树的非递归调用
	  * @param root
	  * @param list
	  * @return
	  */
	 ArrayList<Integer> preorderTraversal1(TreeNode root,ArrayList<Integer> list ){
		 Stack<TreeNode> st = new Stack<TreeNode>();  
		 st.push(root);
		 while(!st.isEmpty()){
			 TreeNode currentNode = st.peek();
			 list.add(currentNode.val);
			 st.pop();
			 if(currentNode.right != null){
				 st.push(currentNode.right);
			 }
			 if(currentNode.left != null){
				 st.push(currentNode.left);
			 }
		 }
		 st = null;
		 return list;
	 }
	 
	 public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		root.right = root2;
		root2.left = root3;
		System.out.println(new BinaryTreePreorderTraversal().preorderTraversal(root));
		
	}
}	
