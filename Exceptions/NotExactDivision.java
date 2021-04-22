package Exceptions;

public class NotExactDivision extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;
	private int dem;
	
	public NotExactDivision(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
	}

	@Override
	public String toString() {
		return "Result: " + num + "/" + dem + " isn't not a integer";
	}
	
	

}
