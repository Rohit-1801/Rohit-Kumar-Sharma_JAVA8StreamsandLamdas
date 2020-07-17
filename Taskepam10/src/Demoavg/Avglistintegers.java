package Demoavg;
import java.util.*;

public class Avglistintegers {

	public static void main(String[] args) 
	{
		
		      List<Integer> list = Arrays.asList(11, 29, 50, 101, 131, 159, 209, 250, 500);
		      System.out.println("Average of a List = "+getAverage(list));
	}
	
	static double getAverage(List<Integer> list)
	{
		
		IntSummaryStatistics summaryStats = list.stream().mapToInt((a) -> a).summaryStatistics();
		return summaryStats.getAverage();
		
	}
		
}


