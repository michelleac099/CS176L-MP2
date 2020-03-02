public class Tester1 {

	public static void main(String[] args) {
		
		Class1 strings = new Class1(100);
		strings.load();
		System.out.println("String \"Hello\" is in array:  " + strings.search("Hello"));

		System.out.println("The max string is: " + strings.findMax());

		System.out.println("The min string is: " + strings.findMin());

		System.out.println("The longest string is: " + strings.findLongest());
		
		System.out.println("The shortest string is: " + strings.findShortest());
		
	}//main

}//Tester1