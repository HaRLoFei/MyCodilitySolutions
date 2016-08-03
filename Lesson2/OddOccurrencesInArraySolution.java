package Lesson2;

import java.util.Arrays;

public class OddOccurrencesInArraySolution {
	
	public static void main(String[] args) {
		int[] A = {9,3,9,3,9,7,9};
		new OddOccurrencesInArraySolution().solution(A);
	}
    public int solution(int[] A) {

    	Arrays.sort(A);
		int oddOccurance=0;
		int previousInt=0;
		int lastInt = A[A.length-1];
		for(int outerLoop = 0;outerLoop<A.length;++outerLoop)
		{
			int occurance=0;
			
			if(A[outerLoop] != previousInt)
			{
				for(int innerLoop = outerLoop;innerLoop<A.length;++innerLoop)
				{
					if(A[outerLoop]== A[innerLoop])
					{
						++occurance;
					}
					else
					{
						break;
					}
					
				}
				
				previousInt = A[outerLoop];
				
				if(occurance%2 !=0)
				{
					oddOccurance = A[outerLoop];
					break;
				}	
			}
			else if(A[outerLoop] == lastInt)
			{
				break;
			}
		
		}
		
		return oddOccurance;
    	
    }
}
