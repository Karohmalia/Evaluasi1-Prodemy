package evaluasi1;

import java.util.Scanner;

public class SoalNo1 {
	public Scanner sc = new Scanner(System.in);
	public int getN() {
		System.out.print("\nMasukkan nilai n : ");
		int n = sc.nextInt();
		return n;
	}

	public void deret() {
		int panjang = getN();
		System.out.println("Deret :");
		for (int i = 0; i < panjang; i++) {
			System.out.print(i * 2 + 1 + " ");
		}
		System.out.println();
		for (int i = panjang - 1; i >= 0; i--) {
			System.out.print(i * 2 + 1 + " ");
		}
	}

	public void loop() {
		Boolean y = true;
		do {
			deret();
			System.out.print("\n\nApakah ingin mencoba kembali? (Y/N) : ");
			String coba = sc.next();
			if (coba.equalsIgnoreCase("y")) {
				y = true;
			} else {
				y = false;
			}
		} while (y);
		System.out.println("\nTerima kasih telah menjalankan program :)");
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("  ==== PROGRAM BILANGAN GANJIL ====");
		SoalNo1 run = new SoalNo1();
		run.loop();
	}
}
