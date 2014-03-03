package sandbox;

import java.util.Scanner;

public class HelloWorldProgram {

	/**
	 * Main fv
	 * @param args elsõ paraméter
	 * beolvas egy számot és annyiszor kiírja a szöveget
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Írj egy számot 1-tõl 5-ig!");
		int num = sc.nextInt();
		for (int i=1; i<=num; i++) {
			System.out.println("Hello World!");
		}
	}

}
