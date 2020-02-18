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
		boolean answer = false;
		for(int element : integerArray) {
			if (integerArray[element]==inNum)
				answer = true;
		}//for
		return answer;
	}
	
	public int findMax()
	{
		int position = 0;
		int largest = integerArray[0];
		for (int element : integerArray) {
			
			if (element > largest)
				largest = element;
				maxElementPos = position;
		position++;
		}//for
		
		return largest;
	}
	
	public int findMin()
	{
		int position = 0;
		int smallest = integerArray[0];
		for (int element : integerArray) {
			
			if(element < smallest)
				smallest = element;
				minElementPos = position;
		position++;
		}//for
		
		return smallest;
	}
	
	public int findMaxPos()
	{
		return maxElementPos;
	}
	
	public int findMinPos()
	{
		return minElementPos;
	}
	
	
	
}//Class2
