package leetcode;
/**
 	经典最大子串和问题，要求用两种方法实现：1、Kadane算法，复杂度O(n)； 2、分治法，复杂度O(nlogn)。
	1、Kadane算法：代码比较简单，但是理解需要时间。初始化ans为0， 每次用ans加上A[i]的值，并更新最大值，如果遇到ans<0，更新ans的值为0。
	2、分治法：最大子串和的区间有以下三种情况（low，high分别为左右边界，mid为(low+high)/2）：
	(1) 区间完全在 A[low,mid-1]
	(2) 区间完全在 A[mid+1,high]
	(3) 区间包含有 A[mid]
	按照这三种情况一直递归下去即可。
 *
 */
public class MaximumSubarray {
	 public int maxSubArray(int[] A) {
		 int sum = 0;
		 int maxSum = Integer.MIN_VALUE;
		 for (int i = 0; i < A.length; i++) {
			sum += A[i];
			maxSum = Math.max(sum, maxSum);
			if(sum < 0 ){
				sum = 0;
			}
		}
		 return maxSum;
	  }

	 public int maxSubArray1(int[] A) {
			int max = A[0];
			int[] sum = new int[A.length];
			sum[0] = A[0];
	 
			for (int i = 1; i < A.length; i++) {
				sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
				max = Math.max(max, sum[i]);
			}
	 
			return max;
		}

	 
	 public static void main(String[] args) {
		int[] A = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new MaximumSubarray().maxSubArray(A));
	}
}
