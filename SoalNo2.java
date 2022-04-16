package evaluasi1;

import java.util.Scanner;


// HASIL UJIAN DAN TEST GIT
public class SoalNo2 {
	public Scanner sc = new Scanner(System.in);

	public int getUang() {
		System.out.print("\nMasukkan uang Andi : ");
		int uang = sc.nextInt();
		return uang;
	}

	public int[] getKacamata() {
		System.out.print("Masukkan harga kacamata : \n");
		int[] kcmt = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("Harga kacamata " + (i + 1) + ": ");
			kcmt[i] = sc.nextInt();
		}
		return kcmt;
	}

	public int[] getBaju() {
		System.out.print("Masukkan harga baju : \n");
		int[] baju = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("Harga baju " + (i + 1) + ": ");
			baju[i] = sc.nextInt();
		}
		return baju;
	}

	public void pilihBarang(int uang, int[] kcmt, int[] baju) {
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum = kcmt[i] + baju[j];
				if (sum > temp && sum <= uang) {
					temp = sum;
				}
			}
		}
		if (temp == 0) {
			System.out.println("\nDana tidak mencukupi");
		}
		else {
			System.out.print("\nHasil : " + temp);
		}
	}

	public void loop() {
		Boolean y = true;
		do {
			int jumlah = getUang();
			int[] hrg1 = getKacamata();
			int[] hrg2 = getBaju();
			pilihBarang(jumlah, hrg1, hrg2);
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
		System.out.println(" ==== PROGRAM UANG ANDI ==== ");
		SoalNo2 run = new SoalNo2();
		run.loop();
	}
}
