package sandbox;

import java.util.Scanner;

public class HelloWorldProgram {

	/**
	 * Main fv
	 * @param args els� param�ter
	 * beolvas egy sz�mot �s annyiszor ki�rja a sz�veget
	 * az�rt m�dos�tom a kommentet, hogy ne sz�rjak el semmit
	 * de ha nem olvasod nem is veszed �szre
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�rj egy sz�mot 1-t�l 5-ig!");
		int num = sc.nextInt();
		for (int i=1; i<=num; i++) {
			System.out.println("Hello Kitty!");
		}
	}

}
