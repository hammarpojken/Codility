package painless;

import java.util.Arrays;

public class PerMissingElem {

	public static void main(String[] args) {
		int [] a = {2,3,4,5};
		System.out.println(ans(a));
		
	}
	public static int ans(int [] A) {
		int i;
		Arrays.sort(A);
		if(A.length == 1) {
			if(A[0] == 1)
				return 2;
			return 1;
			
		}
		
		for(i = 0; i < A.length-1; i++) {
			int temp = A[i];
			if(temp + 1 < A[i +1]) {
				return temp +1;
			}			
		}
		
		if(i == A.length -1 && A[0] != 2)
			return A[A.length -1] + 1;
		
		return 1;
	}

}
