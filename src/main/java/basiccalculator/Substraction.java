package basiccalculator;

class Subtraction extends Maths{
	Subtraction(double a,double b){
		super(a,b);
	}

	@Override
	public void perform() {
		result=num1-num2;  
	}
}
