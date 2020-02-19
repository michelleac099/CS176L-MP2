import java.util.Scanner;

public class Class1 {

	Scanner in = new Scanner(System.in);
	private String[] stringArray;
	private int howMany;
	
	public Class1(int capacity)
	{
		stringArray = new String[capacity];
		howMany = 0;
	}
	
	public void load()
	{
		String input;
		System.out.println("Enter strings to be added to the array, type 'END' to exit: ");
		while(in.hasNext())
		{
			input = in.next();
			if (input.contentEquals("END"))
				break;
			stringArray[howMany] = input;
			howMany++;
		}//while
		
	}
	
	public boolean search(String inWord)
	{
		boolean exists = false;
		for (int i = 0; i <= howMany; i++) {
			if (stringArray[i].contentEquals(inWord))

				exists = true;
		}
		return exists;
	}
	
	public String findMax()
	{
		int result;
		String max = stringArray[0];
		for(String element : stringArray) {
			result = max.compareToIgnoreCase(element);
			if (result > 0)
				max = element;
		}//for
		
		return max;
	}
	
	public String findMin()
	{
		int result;
		String min = stringArray[0];
		for(String element : stringArray) {
			result = min.compareToIgnoreCase(element);
			if (result < 0)
				min = element;
		}//for
		
		return min;
		 
	}
	
	public String findLongest()
	{
		String longest = " ";
		int longestLength = 0;
		
		for(String element : stringArray) {
			if (element.length() > longestLength)
				longestLength = element.length();
				longest = element;
		}//for
		return longest;
	}
	
	public String findShortest()
	{
		String shortest = " ";
		int shortestLength = 999;
		
		for(String element : stringArray) {
			if (element.length() < shortestLength)
				shortestLength = element.length();
				shortest = element;
		}//for
				
		return shortest;
	}
	
}//Class1
