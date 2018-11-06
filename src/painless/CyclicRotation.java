package painless;

public class CyclicRotation {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] my = solution(a, 2);
		for(int i = 0; i < my.length; i++) {
			System.out.println(my[i]);
		}
	}
	public static int [] solution(int [] A, int K) {
		if(A.length == 0)
			return A;
		
		int [] result = A.clone();
		
		for(int i = 0; i< K; i++) {
			result = rotate(result);
		}
		return result;
	}
	
	public static int [] rotate (int [] arrr) {
		
		int [] result = new int[arrr.length]; 
		
		for(int i = 0; i < result.length -1; i++) {
			result[i+1] = arrr[i];
		}
		
		result[0] = arrr[arrr.length-1];
		return result;
	}
	
	

}
