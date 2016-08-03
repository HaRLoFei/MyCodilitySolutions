package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class PassingCarsSolution {
	
	public static void main(String[] args)
	{
		int[] A = {0,1,0,1,1};
		new PassingCarsSolution().solution(A);
	}

	public int solution(int[] A) {

        Map <Integer,Integer> p = new HashMap<Integer,Integer>();
        Map <Integer,Integer> q = new HashMap<Integer,Integer>();
        Map <Integer,Integer> pq = new HashMap<Integer,Integer>();
        
        int countIndex = 0;
        for(int car : A)
        {
            if(car == 0)
            {   
                p.put(countIndex,car);
            }
            else if(car == 1)
            {
                q.put(countIndex,car);
            }
            countIndex++;
        }
        
        int countPQ = 0;
        for(Map.Entry<Integer,Integer> entryP : p.entrySet())
        {
            for(Map.Entry<Integer,Integer> entryQ : q.entrySet())
            {
                if(entryP.getKey() < entryQ.getKey())
                {
                    pq.put(entryP.getKey(),entryQ.getKey());
                    countPQ++;
                }
            }
            
            
        }
        
        return countPQ;
    }

}
