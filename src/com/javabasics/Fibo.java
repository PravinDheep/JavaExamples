package com.javabasics;
import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		int a = 0, b = 1, c, input = 0;
		Scanner scan = new Scanner(System.in);
		try {
			input = scan.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		if (input > 2) {
			System.out.println("0 \n1 ");
			for (int i = 2; i < input; i++) {
				c = a + b;
				a = b;
				b = c;

				System.out.println(c);
			}
		} else {
			for (int i = 0; i < input; i++)
				System.out.println(i);
		}
		
		System.out.println(NumberStatusEnum.ONE);
		scan.close();
		
	}
}
