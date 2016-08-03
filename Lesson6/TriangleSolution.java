package Lesson6;

import java.util.Arrays;

public class TriangleSolution {
	
	public static void main(String[] args) {

		int[] a = {10,2,5,1,8,20};
		
		new TriangleSolution().solution(a);
	}
	
	public int solution(int[] A) {

		Arrays.sort(A);

        int p =0;
        int q =1;
        int r =2;
        int n = A.length;
        int valReturn=0;

        for(int loop=0;r<n;loop++)
        {

           int valP = A[p];
           int valQ = A[q];
           int valR = A[r];
                
           if(valP + valQ > valR || (valP == Integer.MAX_VALUE && valQ == Integer.MAX_VALUE &&  valR == Integer.MAX_VALUE))
           {
              if(valQ + valR > valP || (valP == Integer.MAX_VALUE && valQ == Integer.MAX_VALUE &&  valR == Integer.MAX_VALUE))
              {
                 if(valR + valP > valQ || (valP == Integer.MAX_VALUE && valQ == Integer.MAX_VALUE &&  valR == Integer.MAX_VALUE))
                 {
                     return ++valReturn;
                 }
               }
            }
           else
           {
               p++;
               q++;
               r++;
           }
            
        }

        return valReturn;
    }

}
