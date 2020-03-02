public class Tester2 {

	public static void main(String[] args) {
		
		Class2 numbers = new Class2(100);
		numbers.load();
		System.out.println("Is 5 in the array: " + numbers.search(5));

		System.out.println("Max value: " + numbers.findMax());

		System.out.println("Min value: " + numbers.findMin());

		System.out.println("Max value position: " + numbers.findMaxPos());

		System.out.print("Min value position: " + numbers.findMinPos());
		
	}//main

}//Tester2