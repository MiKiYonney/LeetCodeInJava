package leetcode;
/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * @author yonney
 *
 */
public class ReverseInteger {
	  public int reverse(int x) {
		  int result = 0;
		  boolean flag = x < 0 ? true : false;
		  x = flag ? -x : x;
		  
		  while(x != 0){
			  result = result*10 + x % 10;
			  x /=10;
		  }
	      return flag ? -result : result;
	 }
	  
	  public static void main(String[] args) {
		  System.out.println(new ReverseInteger().reverse(-123));
	}
}
