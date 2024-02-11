package com.reverseword.string;

public class ReverseStringWord {
	public static String WordReverse(String str)
	{
		//creating a new empty string
		String newstr ="";
		// converting string into string type array
		String [] arr =str.split(" ");
		//traverse to word
		for(String x:arr)
		
		{
			newstr="";
			//reversing the words
			for(int i=x.length()-1;i>=0;i--)
			{
				newstr=newstr+x.charAt(i);
			}
		}
		return str;
		
		
	}

}
