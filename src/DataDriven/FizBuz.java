package DataDriven;

public class FizBuz {
	
	/*write the program that print the numbers from 1 to 100. but for multiples fo three 
	print "Fizz" Instead of the number and for the multiples of five print "Buzz" , for 
	number which are multiples of both three and five print "FizzBuzz"*/

	public static void main(String[] args) {
		
		
		for (int i=1; i<100; i++){
			
		if (i%15==0)
				System.out.println("FizzBuzz");
		else if(i%3==0)
				System.out.println("Fizz");
		else if (i%5==0)
				System.out.println("Buzz");
		else
			System.out.println(i);
	
		// FizzBuzz -7
		// Fizz -27
		// Buzz - 13
		// Number - 1 2 4 7 8 11 13 14 16 17 19 22 23 26 28 29 31 32 34 37 38 41 43 44 46 47 
		//49 52 53 56 58 59 61 62 64 67 68 71 73 74 76 77 79 82 83 86 88 89 91 92 94 97 98
		
			}
		}
	}


