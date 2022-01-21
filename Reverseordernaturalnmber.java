package selfassesment;

import java.util.Scanner;

public class Reverseordernaturalnmber {

	public static void main(String[] args) {
		{
			int number, i;
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" Please Enter the Maximum integer Value : ");
			number = sc.nextInt();	
			
			for(i = number; i >= 1; i--)
			{
				System.out.print(i +"\t"); 
			}	
		}
	}

	}


