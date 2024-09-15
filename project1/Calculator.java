package project1;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char operator;
		double num1,num2;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the operator(+, -, *, /)");
        operator=sc.next().charAt(0);
        System.out.println("enter the two numbers one by one");
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        sc.close();
        
        switch(operator) {
        case '+':
        	System.out.printf("%.2f + %.2f = %.2f",num1,num2,(num1+num2));
        	break;
        	
        case '-':
        	System.out.printf("%.2f - %.2f = %.2f",num1,num2,(num1+num2));
        	break;
        	
        case '*':
        	System.out.printf("%.2f * %.2f = %.2f",num1,num2,(num1*num2));
        	break;
        	
        case '/':
        	if(num2 != 0)
        		System.out.printf("%.2f / %.2f = %.2f",num1,num2,(num1/num2));
        	else
        		System.out.println("divide by zero situation");
        	break;
        	default:
        		System.out.printf("%c is an invalid operator",operator);
        		
        }
	}

}
