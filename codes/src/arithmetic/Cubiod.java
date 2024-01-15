package arithmetic;

import java.util.Scanner;

public class Cubiod {
	public static void main(String[] args) {
		int length, breadth, height;
		int totalArea, volumn;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length breadth and height");
		length = sc.nextInt();
		breadth = sc.nextInt();
		height = sc.nextInt();
		
		sc.close();
		
		totalArea = 2 * (length * breadth + length * height + breadth * height);
		volumn = length * breadth * height;
		
		System.out.println("Total area " + totalArea);
		System.out.println("Column " + volumn);
	}
}
