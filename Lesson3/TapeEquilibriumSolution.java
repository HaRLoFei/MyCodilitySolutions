package Lesson3;

public class TapeEquilibriumSolution {
	
	public static void main(String[] args) {
		
		int [] A = {3,1,2,4,3};
		new TapeEquilibriumSolution().solution(A);
	}

	public int solution(int[] A) {

		int result=0;
		for(int p =1;p<A.length;++p)
		{
			int sum1stPart=0;
			int sum2ndPart=0;
			for(int p1=0;p1<p;++p1)
			{
				sum1stPart+=A[p1];
			}
			
			for(int p2=p;p2<A.length;++p2)
			{
				sum2ndPart+=A[p2];
			}
			
			if(p>1)
			{
				if(result > Math.abs(sum1stPart-sum2ndPart))
				{
					result = Math.abs(sum1stPart-sum2ndPart);
				}
			}
			else
			{
				result = Math.abs(sum1stPart-sum2ndPart);
			}
			
		}
		
		return result;
    }

}
