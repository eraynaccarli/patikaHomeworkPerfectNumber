package patikaOdevMukemmelSayiBul;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		
		// 1'den baslayarak girilen sayiya kadar girilen sayiyi tam bolen butun sayilari topladik.
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				total += i;
			}
			
		}
		// eger toplamlari girilen sayi cikiyorsa mukemmel bir sayi oldugunu belirttik.
		if(number == total) {
			System.out.println(number + " is a perfect number.");
		}
		// 1 girilmesi durumunda mukemmel sayi olmadigini belirttik.
		else if(number == 1) {
			System.out.println("1 is a not perfect number.");
		}
		else {
			System.out.println(number + " is a not perfect number.");
		}

	}

}
