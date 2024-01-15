package arithmetic;

import java.util.Scanner;

public class Formula {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the A: ");
		float a = sc.nextFloat();
		
		System.out.print("Enter the b: ");
		float b = sc.nextFloat();
		
		System.out.print("Enter the c: ");
		float c = sc.nextFloat();
	
		sc.close();
		
		float s = (1.0F / 2.0F) * (a + b + c);
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area of formula is " + area);
	}
}

