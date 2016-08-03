package Lesson10;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MinPerimeterRectangleSolution {
	
	public static void main()
	{
		int N=30;
		new MinPerimeterRectangleSolution().solution(N);
	}
	
	public int solution(int N)
	 {
		 Map<Integer,Integer> result = new TreeMap<Integer,Integer>();
		 int divideResult=0;
		 
		 for(int loop=1;loop<=N;++loop)
		 {
			 if(loop == divideResult)
			 {
				 break;
			 }
			 else if(N%loop==0)
			 {
				 divideResult = N/loop;
				 result.put(loop, divideResult);
			 }
		 }
		 
		 int minPerimeterRectangle=0;
		 for(Entry<Integer,Integer> entry : result.entrySet())
		 {
			 int perimeter = 2 * (entry.getKey() + entry.getValue());
			 
			 if(minPerimeterRectangle !=0 )
			 {
				 if(minPerimeterRectangle > perimeter)
				 {
					 minPerimeterRectangle = perimeter;
				 }
			 }
			 else
			 {
				 minPerimeterRectangle = perimeter;
			 }
		 }
		 
		 return minPerimeterRectangle;
	 }

}
