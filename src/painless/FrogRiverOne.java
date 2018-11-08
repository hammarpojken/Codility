package painless;


import java.util.HashSet;

public class FrogRiverOne {

	public static void main(String[] args) {
		
		int [] a = {1,3,1,4,2,3,4};
		int x = 4;
		System.out.println(solution(x, a));



	}
	public static int solution(int X, int [] A) {
		HashSet<Integer> leafs = new HashSet<Integer>(A.length/2);
		int counter = 0;
		
		for(int i= 0; i < A.length; i++) {
			
			if(A[i] <= X) {
				
				if(leafs.add(A[i]))
					counter++;
			}
			
			if(counter == X)
				return i;
		
		}
		return -1;
	}
				
				

}
