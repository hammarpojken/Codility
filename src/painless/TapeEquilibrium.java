package painless;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int [] a = {-3,1};
		System.out.println(solution(a));

	}
	public static int solution(int [] A) {
		int right = 0;
		int left = 0;
		int lowest = Integer.MAX_VALUE;
		
		for( int i = 0; i < A.length; i++) {
			right += A[i];
		}
		
		for(int i = 0; i < A.length -1; i++) {
			left+= A[i];
			right -= A[i];
			
			if(Math.abs(left - right) < lowest) {
				lowest = Math.abs(left - right);
				
			}
		}
		
		return lowest;
			
	}
	// Bad performance(0% O(N*N)  but 100% correctness, total 50% 
	public static int solution2(int [] A) {
		int left,right,lowest;
		lowest = Integer.MAX_VALUE;
		
		for(int i = 1; i < A.length; i++) {
			left = 0;
			right= 0;
			
			for(int j = 0 ; j < A.length; j ++) {
				if(i > j)
					left += A[j];
				else
					right+= A[j];
			}
			if(Math.abs(left -right) < lowest)
				lowest = Math.abs(left - right);
		}
		
		
		return lowest;
	}

}
