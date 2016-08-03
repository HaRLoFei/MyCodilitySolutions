package Lesson3;

public class FrogJmpSolution {
	
	public static void main(String[] args) {

		new FrogJmpSolution().solution(10, 85, 30);
	}
	
    public int solution(int X, int Y, int D) {
    	
    	if(X==Y)
    	{
    		return 0;
    	}
    	else
    	{
    		return  (((Y - X) % D) == 0)? ((Y - X) / D) : ((Y - X) / D) + 1;
    	}
    }

}
