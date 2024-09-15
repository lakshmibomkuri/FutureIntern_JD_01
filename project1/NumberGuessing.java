package project1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		
		
		int min=1;
		int max=100;
		int findNumber=ran.nextInt(max-min +1)+min;
		
		System.out.println("welcome to the number guessing game");
		System.out.println("computer choosen number between 1 to 100 please guess it?");
		int guess;
		int attempt=0;
		Boolean Hasguessed=false;
		while(!Hasguessed) {
			System.out.println("enter your guess number");
			guess=sc.nextInt();
			attempt++;
			
			if(guess<findNumber) {
				System.out.println("number is less ! try again");
			}
			else if(guess>findNumber) {
				System.out.println("number is high ! try again");
			}
			else {
				Hasguessed=true;
				System.out.println("congratulations you have guess the number"+findNumber+" in"+ attempt +"attempts");
			}
		}
		

	}

}
