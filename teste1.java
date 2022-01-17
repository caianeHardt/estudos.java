import java.util.*;
import java.lang.*;
import java.io.*;


class Teste1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		boolean result = isSubsequent(
		    new int[]{5, 1, 22, 25, 6, -1, 8, 10}, 
		    new int[]{1, 6, -1, 10});
	    System.out.println(result);
	    
	    result = isSubsequent(
	        new int[]{5, 1, 22, 25, 6, -1, 8, 10}, 
	        new int[]{6, 1, -1, 10});
        System.out.println(result);
	}

	
	public static boolean isSubsequent(int[] values, int[] sequence) {
	    int[] orders =  new int[sequence.length];
	    
	    for (int i = 0; i < sequence.length; i++) {
	        for (int j = 0; j < values.length; j++) {
	            orders[i] = -1;
	            if (sequence[i] == values[j]) {
	                orders[i] = j;
                    if ( i > 0 && j < orders[i-1] ) {
                        return false;
                    }
                    break;
	            }
            }
        }
        
        for (int i = 0; i < orders.length; i++){
            if ( orders[i] == -1 ) {
                return false;
            }
        }
        
        return true;
	}
}
