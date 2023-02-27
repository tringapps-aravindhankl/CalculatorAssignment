package basiccalculator;

abstract class Maths{
	double result;
	protected double num1;       //protected --->Using child class only
	protected double num2;
	Maths(double num1,double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public abstract void perform();  //only declaration not definition ,hiding implementation details...
}
