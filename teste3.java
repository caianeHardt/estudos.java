import java.util.*;
import java.lang.*;
import java.io.*;


class Teste3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		boolean[] result = verifyPalindromes(
		    new String[]{"arara", "jabuticaba", "asa", "caminhao"});
		    
	    System.out.println(Arrays.toString(result));
	    
	}

	
	public static boolean[] verifyPalindromes(String[] list) {
	    boolean[] returnList =  new boolean[list.length];
	    
	    for (int i = 0; i < list.length; i++) {
	        StringBuffer buffer = new StringBuffer(list[i]);
	        
	        if (list[i].equals(buffer.reverse().toString())) {
	            returnList[i] = true;
	            continue;
	        }
	        returnList[i] = false;
        }
        return returnList;
	}
}