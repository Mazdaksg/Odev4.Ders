package odev4.Ders;

import java.util.Scanner;

public class CaroimTablosu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int rakam = input.nextInt();
		for (int i = 1; i < 10; i++) {
			int carpim;
			carpim = i * rakam;
			System.out.println(i + "x" + rakam + "=" + carpim);
		}

	}

}
