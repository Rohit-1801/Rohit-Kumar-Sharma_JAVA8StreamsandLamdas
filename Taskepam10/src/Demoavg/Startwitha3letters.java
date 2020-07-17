package Demoavg;
import java.util.*;
import java.util.stream.Collectors;

public class Startwitha3letters {

	public static void main(String[] args) 
	{
		
		List<String> list1 = Arrays.asList("bbbb","aaa","afg","abcd","aad","dssdvs");
		
		System.out.println(getStrings(list1));
	}
	
	static List<String> getStrings(List<String> list)
	{
		return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
	}

}
