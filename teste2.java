import java.util.*;
import java.lang.*;
import java.io.*;


class Teste2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String[] result = removeDuplicates(
		    new String[]{"g", "g", "y", "c", "c", "c", "q", "c", "y", "y"});
		    
	    System.out.println(Arrays.toString(result));
	    
	}

	
	public static String[] removeDuplicates(String[] list) {
	    String[] newList =  new String[list.length];
	    newList[0] = list[0];
	    
	    int j = 1;
	    for (int i = 1; i < list.length; i++) {
	        if (list[i] != newList[j-1]) {
	            newList[j] = list[i];
	            j++;
	        }
        }
        return Arrays.copyOfRange(newList, 0, j);
	}
}
