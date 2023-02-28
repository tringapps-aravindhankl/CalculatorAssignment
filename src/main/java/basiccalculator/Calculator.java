package basiccalculator;
import java.util.*;
import java.util.logging.*;

public class Calculator
{
    public static void main( String[] args )
    {
    double num1;
    double num2;
    double result;
    char option;
    int choose;
    Scanner scan;
    scan=new Scanner(System.in);
    
    Logger l=Logger.getLogger("hi");
    try {
    l.info("Enter The First Element:");
    num1=scan.nextDouble();
    result=num1;
    do {
    l.info("Choose the operation (+)   (-)   (*)    (/)");
    option=scan.next().charAt(0);
    l.info("Enter Second Element");
    num2=scan.nextDouble();
    switch(option) 
    {
    case '+':
    	Addition obj=new Addition(result,num2);//creating object and call the constructor,passing the values...
    	obj.perform();
    	result=obj.result;
    	break;
    	
    case '-':
    	Subtraction sub=new Subtraction(result,num2);
    	sub.perform();
    	result=sub.result;
    	break;
    	
    case '*':
    	Multiplication mul=new Multiplication(result,num2);
    	mul.perform();
    	result=mul.result;
    	break;
    
    case '/':
    	Divison div=new Divison(result,num2);
    	div.perform();
    	result=div.result;
        break;
    	
    default:
    	break;
    }
    l.info(result);
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
    
