package leetcode;
/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * 方法1：二分插入    方法2：普通
 * @author yonney
 *
 */
public class SearchInsertPosition {
	/**
	 * 二分插入
	 * @param A
	 * @param target
	 * @return
	 */
	public int searchInsert(int[] A, int target) {
		if(A == null){
			return 0;
		}
		int  low = 0; 
		int high = A.length - 1;
		while(low <= high){
			int mid = low + (high - low)/2;
			if(A[mid] == target){
				return mid;
			}else if(A[mid] > target){
				high = mid -1;
			}else {
				low = mid +1;
			}
		}
        return low;
    }
	
	public int searchInsert2(int[] A, int target) {
		if(A == null){
			return 0;
		}
		int res = 0;
		if(target < A[0]){
			return 0;
		}
		if(target > A[A.length - 1]){
			res = A.length;
		}
		for (int i = 0; i < A.length; i++) {
			if(target == A[i]){
				res = i;
			}
			if(i != A.length -1){
				if((target > A[i])&&(target<A[i+1])){
					res = i+1;
				}
			}
		}
		return res;
    }
	
	
	public static void main(String[] args) {
		int[] A = {1,3,5,6};
		System.out.println(new SearchInsertPosition().searchInsert2(A, 5));
	}
}
