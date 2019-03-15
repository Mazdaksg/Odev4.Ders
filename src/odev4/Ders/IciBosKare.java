package odev4.Ders;

import java.util.Scanner;

public class IciBosKare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int satir, sutun;
		System.out.println("satir sayisini giriniz");
		satir = input.nextInt();
		System.out.println("sutun sayisini giriniz");
		sutun = input.nextInt();
		for (int x = 1; x <= satir; x++) {
			for (int y = 1; y <= sutun; y++) {
				if (x == 1 || x == satir || y == 1 || y == sutun)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
