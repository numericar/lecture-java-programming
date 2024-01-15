package arithmetic;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base: ");
		float base = sc.nextFloat();
		
		System.out.print("Enter the height: ");
		float height = sc.nextFloat();
		
		sc.close();
		
		float area = (1.0F / 2.0F) * (base * height);
		System.out.println("Area of triangle is " + area);
	}
}

