
public class CalcModel {
	
	private int calcValue;
	
	/**
	 * Add two numbers
	 * @param firstNum
	 * @param secondNum
	 */
	
	public void addTwoValues(int firstNum, int secondNum){
		calcValue = firstNum + secondNum;
	}
	
	/**
	 * Subtract two numbers
	 * @param firstNum
	 * @param secondNum
	 */
	public void subTwoValues (int firstNum, int secondNum){
		calcValue = firstNum + secondNum;
	}
	
	public int getValue(){
		return calcValue;
	}
	
}
