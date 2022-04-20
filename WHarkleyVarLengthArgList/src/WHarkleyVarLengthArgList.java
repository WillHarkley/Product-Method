//Variable Length Argument List
//Author: William Harkley
//Class: CSIS 212-D02
/* Assignment: (Variable-Length Argument List) Write an application that calculates the 
	product of a series of integers that are passed to method product using a variable-length 
	argument list. Test your method with several calls, each with a different number of arguments.
*/
//Last Updated: 4/19/2022

public class WHarkleyVarLengthArgList {
	
	public static int product(int... numbers)
	{
		int total = 1;
		
		//calculation
		for (int x : numbers)
			total *= x;
			
		return total;
	}

	public static void main(String[] args) {
		
		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		int a4 = 4;
		
		System.out.printf("a1 = %d%na2 = %d%na3 = %d%na4 = %d%n%n", 
				a1, a2, a3, a4);
		
		System.out.printf("The product of a1 and a2 is: %d%n", product(a1, a2));
		
		System.out.printf("The product of a3 and a4 is: %d%n", product(a3, a4));
		
		System.out.printf("The product of a2, a3, and a4 is: %d%n", product(a2, a3, a4));
		
		System.out.printf("The product of a3 * a3 * a3 is: %d%n", product(a3, a3, a3));
	}

}
