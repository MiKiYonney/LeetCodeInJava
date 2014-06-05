package leetcode;
/**
 * Given a binary tree, find its maximum depth.
	The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *	 解决方法：二叉树的深度遍历
 */
public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		if(root == null){
			return 0;
		}
		if(root.left == null && root.right == null){//无子树
			return 1;
		}
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		int max = leftDepth > rightDepth ? leftDepth : rightDepth;
		return max +1;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode left1 = new TreeNode(2);
		root.left = left;
		left.left = left1;
		System.out.println(new MaximumDepthofBinaryTree().maxDepth(root));
	}
}
