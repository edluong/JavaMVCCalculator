
public class CalcModel {
	
	private int calcValue;
	
	
	public void addTwoValues(int firstNum, int secondNum){
		calcValue = firstNum + secondNum;
	}
	
	public int getValue(){
		return calcValue;
	}
}
