package leetcode;

import java.util.ArrayList;

public class BinaryTreeInorderTraversal {
	  public ArrayList<Integer> inorderTraversal(TreeNode root) {
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  if(root == null){
			  return list;
		  }
		  inorderTraversal(root, list);
		  return list;
	  }
	  
	  public ArrayList<Integer> inorderTraversal(TreeNode root,ArrayList<Integer> list) {
		  if(root.left != null){
			  inorderTraversal(root.left,list);
		  }
		  list.add(root.val);
		  if(root.right != null){
			  inorderTraversal(root.right,list);
		  }
		  return list;
	  }
	  
	  public static void main(String[] args) {
	    TreeNode root = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		root.right = root2;
		root2.left = root3;
		System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(root));
	}
}
