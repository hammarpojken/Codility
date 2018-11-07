package painless;

public class FrogJmp {

	public static void main(String[] args) {
		int X,Y,D;
		X = 10;
		Y = 90;
		D = 30;
		
		System.out.println(solution(X, Y, D));
	}
	public static int solution(int X, int Y, int D) {
		
		if((Y - X) % D == 0)
			return ((Y-X) / D);
		else
			return ((Y-X) / D + 1);
		
		
	}

}
