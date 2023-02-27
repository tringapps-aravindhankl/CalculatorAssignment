package basiccalculator;
class Addition extends Maths{          //extends the parent class....because abstract class cannot create object...
	Addition(double a,double b){       
		super(a,b);                    //pass the value in parent class...
	}
	
	public void perform() {          //override abstract method,implement the details...
		result=num1+num2;
	}
}
