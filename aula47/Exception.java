package aula47;

public class Exception {

	public static void main(String[] args) {
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Before the exception");
						
			vetor[4] = 5;
			
			System.out.println("Not print");
		
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException exception) {
			
			System.out.println("Exception when accessing an array index that doesnt exist");
		
		}
		
		System.out.println("After the exception");		

	}

}
