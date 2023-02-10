package basiccalculator;
import java.util.*;
import java.util.logging.*;
abstract class Maths{
	protected double num1;       //protected --->Using child class only
	protected double num2;
	Maths(double num1,double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public abstract double perform();  //only declaration not definition ,hiding implementation details...
}
class Addition extends Maths{          //extends the parent class....because abstract class cannot create object...
	Addition(double a,double b){       
		super(a,b);                    //pass the value in parent class...
	}
	
	public double perform() {          //override abstract method,implement the details...
		double result=num1+num2;
		return result;
	}
}
class Subtraction extends Maths{
	Subtraction(double a,double b){
		super(a,b);
	}

	@Override
	public double perform() {
		double result=num1-num2;
		return result;  
	}
}

class Multiplication extends Maths{
	Multiplication(double a,double b){
		super(a,b);
	}

	@Override
	public double perform() {
		double result=num1*num2;
		return result;
	}
}

class Divison extends Maths{
	Divison(double a,double b){
		super(a,b);
	}

	@Override
	public double perform() {
		double result=num1/num2;
		if(num2 == 0) {
			String s="Divisble by zero problem ";
			System.out.println(s);
		}
		return result;
	}
}

public class Calculator
{
    public static void main( String[] args )
    {
    double num1,num2;
    char option;
    int choose;
    Scanner scan;
    scan=new Scanner(System.in);
    Logger l=Logger.getLogger("hi");
    try {
	do {
    l.info("Enter The First Element:");
    num1=scan.nextDouble();
    l.info("Choose the operation (+)   (-)   (*)    (/)");
    option=scan.next().charAt(0);
    l.info("Enter Second Element");
    num2=scan.nextDouble();
    switch(option) 
    {
    case '0':
    	break;
    case '+':
    	Addition obj=new Addition(num1,num2);   //creating object and call the constructor,passing the values...
    	l.log(Level.INFO ,() -> " " + obj.perform());
    	break;
    case '-':
    	Subtraction sub=new Subtraction(num1,num2);
    	l.log(Level.INFO,() -> " " + sub.perform());
    	break;
    case '*':
    	Multiplication mul=new Multiplication(num1,num2);
    	l.log(Level.INFO,() -> " " + mul.perform());
    	break;
    case '/':
    	Divison div=new Divison(num1,num2);
    	l.log(Level.INFO, ()-> " "+div.perform());
    default:
    	break;
    }
    l.info("0.Close or  1.ReUse");
    choose=scan.nextInt();
    }while(choose==1);
    }
    catch(Exception e) {
    	String s=" "+e;
    	l.info(s);
    	
    }
}
}
    
