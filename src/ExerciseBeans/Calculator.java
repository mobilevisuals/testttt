package ExerciseBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Calculator {
	
	private int firstNumber;
	private int secondNumber;
	private int result;

	public Calculator(){
		
		firstNumber = 1;
		secondNumber = 2;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public int getResult() {
		return (firstNumber + secondNumber);
	}
}
