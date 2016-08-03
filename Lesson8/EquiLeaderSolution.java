package Lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EquiLeaderSolution {
	
	public static void main(String[] args)
	{
		int[] A = {4,3,4,4,4,2};
		
		new EquiLeaderSolution().solution(A);
	}
	
	public int solution(int[] A)
	{
		int[] copyA = Arrays.copyOf(A, A.length);		
		Arrays.sort(copyA);	
		
		int leaderVal = A[0];
		int leaderValCount = 1;
		for(int indexA=1;indexA<copyA.length;++indexA)
		{
			if(leaderVal == copyA[indexA])
			{
				++leaderValCount;
				
				if(leaderValCount>copyA.length/2)
					break;

			}
			else
			{
				leaderVal = copyA[indexA];
				leaderValCount = 1;
			}
		}
				
		int numLeader = 0;
		List<Integer> posList = new ArrayList<Integer>();
		
		for(int index=0;index<A.length;++index)
		{
			if(A[index]==leaderVal)
			{
				posList.add(index);
			}
		}
		
		for(int index=0;index<A.length;++index)
		{	
			int sequence1Count=0;
			int sequence2Count=0;
			
			for(int innerIndex=0;innerIndex<posList.size();++innerIndex)
			{
				if(posList.get(innerIndex)<= index)
				{
					++sequence1Count;
				}
				else
				{
					++sequence2Count;
				}
			}
			
			if(sequence1Count > ((index+1)/2) &&
					sequence2Count > (A.length - (index+1))/2)
			{
				++numLeader;
			}
		}
		return numLeader;
	}

}
