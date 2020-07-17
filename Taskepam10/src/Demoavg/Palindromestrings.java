package Demoavg;

import java.util.*;
import java.util.stream.Collectors;

public class Palindromestrings {

	public static void main(String[] args) 
	{
		List<String> list2 = Arrays.asList("bbbb","aaa","afg","abcd","aad","dssdvs","bab","cdc","efe");
		
		System.out.println(getPallindromeStrings(list2));

	}
	
	static List<String> getPallindromeStrings(List<String> list)
	{
		
		return list.stream().filter(s -> s.equals(new StringBuffer(s).reverse().toString())).collect(Collectors.toList());
		
		
	}


}
