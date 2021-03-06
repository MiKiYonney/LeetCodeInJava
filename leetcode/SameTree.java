package leetcode;
/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * @author yonney
 * 根节点相同，再递归的看左子树和右子树是否相同     
 *
 */
public class SameTree {
	 public boolean isSameTree(TreeNode p, TreeNode q) {
		 	if(p !=null && q !=null){
		 		if(p.val == q.val){
			 		return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
			 	}else{
			 		return false;
			 	}
		 	}else if(p ==null && q == null){
			 	return true;
		 	}else{
		 		return false;
		 	}
	 	}
}
