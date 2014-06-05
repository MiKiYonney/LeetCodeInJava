package leetcode;
/**
 * 用递归的做法，把当前root的左节点和它的所有深度下的右节点 与 右节点和它的所有深度下的左节点 连接。
	目的就是把因为当前root左右节点而分开的子节点全部连接起来。
	画个图就很容易发现，这样做就把需要连接的节点在他们的公共祖先root的递归层中一起处理。
 * @author yonney
 *
 */
public class PopulatingNextRightPointersinEachNode {
	 public void connect(TreeLinkNode root) {
		 if(root == null){
			 return;
		 }
		 if(root.left != null){
			 TreeLinkNode left = root.left;
			 TreeLinkNode right = root.right;
			 while(left != null){
				 left.next = right;
				 left = left.right;
				 right = right.left;
			 }
			 connect(root.left);
			 connect(root.right);
		 }
	  }
}

