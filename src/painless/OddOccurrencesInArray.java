package painless;


import java.util.Arrays;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int [] a = {9,9,2,3,3,2,1,9,9,7,7,7,1,7,3,8,3};
		
		System.out.print(solution(a));
		

	}
	public static int solution(int [] A) {
		 Arrays.sort(A);
		 int i,j, count;
		 
		 for(i = 0; i < A.length; i++) {
			 if(A.length == 1)
				 return A[0];
			 count = 1;
			 
			 for(j = i +1; j < A.length; j++) {
				 if(A[i] == A[j]) {
					 count++;
					 continue;
				 } else {
					 i = j -1;
					 break;
				 }
				 
			 }
			 if(count % 2 != 0)
				 return A[i];
		 }
		return 0;
	}

	
	// med använding av "XOR"
	public static int solution2(int [] A) {
		int elem = 0;

		for (int i = 0; i < A.length; i++) {
			elem ^= A[i];
		}
		return elem;
		
	}

}
