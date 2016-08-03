package Lesson10;

public class CountFactorsSolution {
	
	public static void main(String args[])
	{
		int N = 24;
		new CountFactorsSolution().solution(N);
	}
	
	public int solution(int N)
	{
		int countFactor=0;
		for(int loop=1;loop<=N;++loop)
		{
			if(N%loop==0)
			{
				++countFactor;
			}
		}
		return countFactor;
	}

}
