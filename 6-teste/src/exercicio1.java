
public class exercicio1 {

	public static void printFizzBuzz(String[] args) {
		
		for(double num = 0; num < 100; num++) {
			
			if(num % 3 == 0 && num % 5 == 0) {
				System.out.println("FizzBuzz");
			}else if (num % 3 == 0) {
				System.out.println("Frizz");
			
			}else if(num % 5 == 0) {
				System.out.println("Buzz");
			}
		}
	
	}

}
