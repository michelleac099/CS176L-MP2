import java.util.Scanner;

public class Class1 {

	Scanner in = new Scanner(System.in);
	int howMany = 0;
	String input;
	String max = "";
	String min = "";
	boolean out = false;
	
	String [] stringArray;

	public Class1(int size)
	{
		stringArray = new String[size];
	}

	public void load()
	{

		System.out.print("Enter strings to add to the array or 'END' to stop: ");

		while(out == false) {
			input = in.next();
			if(input.equals("END")) {
				out = true;
				howMany--; }
			else {
				stringArray[howMany] = input;
				howMany++; }
		}//while loop
	}//load

	public boolean search(String array) 
	{
		boolean exists = false;
		for (int i = 0; i <= howMany; i++) {
			if (stringArray[i].contentEquals(array))
				exists = true;
		}//for
		return exists;
	}


	public String findMin()
	{

		for(int i = 0; i <= howMany; i++) {
			if(i == 0)
				min = stringArray[i];
			else {
				if(stringArray[i].compareTo(min) < 0) {
					min = stringArray[i]; }
			}
		}//for
		return min;
	}

	public String findMax()
	{
		for(int i = 0; i <= howMany; i++) {
			if(i == 0)
				max = stringArray[i];
			else{
				if(stringArray[i].compareTo(max) > 0) {
					max = stringArray[i]; }
			}
		}//for
		return max;
	}

	public String findLongest()
	{
		String longest = stringArray[0];
		for(int i = 1; i <= howMany; i++) {
			if(stringArray[i].length() > longest.length())
				longest = stringArray[i];
		}//for
		return longest;
	}

	public String findShortest()
	{
		String shortest = stringArray[0];
		for(int i = 1; i <= howMany; i++) {
			if(stringArray[i].length() < shortest.length())
				shortest = stringArray[i];
		}//for
		return shortest;
	}

}//Class1