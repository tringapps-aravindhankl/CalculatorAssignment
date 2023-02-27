package basiccalculator;

class Multiplication extends Maths{
	Multiplication(double a,double b){
		super(a,b);
	}

	@Override
	public void perform() {
		result=num1*num2;
	}
}
