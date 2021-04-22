package Exceptions;

public class MyException {

	public static void main(String[] args) {

		int[] numbers = {4, 8, 5, 16, 32, 21, 64, 128};
		int[] denom = {2, 0, 4, 8, 0, 2, 4};
		
		for(int i = 0;i < numbers.length; i++) {
			try {
				if(numbers[i] % 2 != 0) {
					throw new NotExactDivision(numbers[i], denom[i]);
				}
				System.out.println(numbers[i] + "/" + denom[i] + " = " + (numbers[i] / denom[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException | NotExactDivision e) {
				System.out.println("Aconteceu um erro");
				e.printStackTrace();
			}
		}
	}

}
