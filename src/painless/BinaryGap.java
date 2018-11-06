package painless;

public class BinaryGap {

	public static void main(String[] args) {
		
		int ans = solution(561892);
		System.out.print(ans);
	}
	public static int solution(int N) {
		
		String binary = Integer.toBinaryString(N);
		int longest = 0;
		
		for(int i = 0; i < binary.length(); i++) {
			
			if(binary.charAt(i) == '1' && (i+1) != binary.length()) {
				int count = 0;
				for(int j = i + 1; j < binary.length(); j++) {
					if(binary.charAt(j) == '0') {
						count++;
					}
					else if (binary.charAt(j) == '1'){
						if(count > longest) {
							longest = count;	
						}
						i=j - 1;
						break;
						
					}
				}
			}
		}
		
		return longest;
	}

}
