import java.util.Scanner;

public class Class2 {

	Scanner in = new Scanner(System.in);
	private int[] integerArray;
	private int howMany;
	private int maxElementPos;
	private int minElementPos;
	
	public Class2(int capacity) 
	{
		integerArray = new int[capacity];
		howMany = 0;
	}
	
	public void load()
	{
		int input;
		System.out.println("Enter integers to add to the array, press Q to quit: ");
		
		while(in.hasNextInt()) {
			input = in.nextInt();
			integerArray[howMany] = input;
			howMany++;
		}//while
	}
	
	public boolean search(int inNum)
	{
		boolean exists = false;
		for(int i = 0; i<howMany;i++) {
			if (integerArray[i]==inNum)
				exists = true;
		}//for
		return exists;
	}
	
	public int findMax()
	{
		int largest = integerArray[0];

		for (int i = 0; i < howMany; i++) {
			if (integerArray[i] > largest) 
				largest = integerArray[i];
		}//for
		
		return largest;
	}
	
	public int findMin()
	{
		int smallest = integerArray[0];

		for (int i = 0; i < howMany; i++) {
			if (integerArray[i] < smallest) 
				smallest = integerArray[i];
		}//for
		
		return smallest;
	}
	
	public int findMaxPos()
	{
		int largest = integerArray[0];
		maxElementPos = 0;
		for (int i = 0; i < howMany; i++) {
			if (integerArray[i] > largest) {
				largest = integerArray[i];
				maxElementPos = i;}
		}//for
		
		return maxElementPos;
	}
	
	public int findMinPos()
	{
		int smallest = integerArray[0];
		minElementPos = 0;
		for (int i = 0; i < howMany; i++) {
			if (integerArray[i] < smallest) {
				smallest = integerArray[i];
				minElementPos = i;}
		}//for
		
		return minElementPos;
	}
	
}//Class2
