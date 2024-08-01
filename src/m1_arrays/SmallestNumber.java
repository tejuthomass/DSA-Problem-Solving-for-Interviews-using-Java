package m1_arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		System.out.print(solution(19));		
	}
	
	public static int solution(int n) {
		String ans = "";
		
		for (int divisor = 9; divisor >= 2; divisor--) {
			while (n % divisor == 0) {
				n /= divisor;
				ans = divisor + ans;
			}
		}
		
		if (n != 1) {
			return -1;
		}	
		return Integer.parseInt(ans);
	}
}
