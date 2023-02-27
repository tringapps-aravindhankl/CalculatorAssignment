package basiccalculator;

class Divison extends Maths{
	Divison(double a,double b){
		super(a,b);
	}

	@Override
	public void perform() {
		result=num1/num2;
	}
}
