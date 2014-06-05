package leetcode;
/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * @author yonney
 *
 */
public class UniqueBinarySearchTrees {
	 public int numTrees(int n) {
		return numTrees(1,n);
	 }
	 private int numTrees(int start, int end) {
		 if(start >= end){
	         return 1;
	     }
		 int res = 0;
		 for(int i = start; i <= end ;i++ ){
			 res += numTrees(start,i-1)*numTrees(i+1,end);
		 }
		 return res;
	 }
	 public static void main(String[] args) {
		System.out.println(new UniqueBinarySearchTrees().numTrees(3));
	}
}
