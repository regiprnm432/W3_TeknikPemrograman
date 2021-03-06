/**
 * Program untuk menghitung gaji agent
 * @author Regi Purnama
 * @version 1
 * @since 19/02/2022
 */

import java.util.*; 

public class Solution4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	//Melakukan can data inputan
		int jumlahBarang=input.nextInt();
		final int gajiPokok=500000;		//gajiPokok berperan sebagai konstanta
		final int hargaBarang=50000;	//hargaBarang berperan sebagai konstanta
		int totalGaji = 0;	//Variable totalGaji akan menampung output program
		
		if(jumlahBarang >= 40) {	//Bonus 25% untuk penjualan >= 40
			totalGaji = (int) (gajiPokok + ((jumlahBarang*hargaBarang)*0.25));
		} else if(jumlahBarang > 80) {	//Bonus 35% untuk penjualan > 80
			totalGaji = (int) (gajiPokok + ((jumlahBarang*hargaBarang)*0.35));
		} else if(jumlahBarang < 15) {	//Gaji akan dikurangi 15% ketika penjualan < 15
			totalGaji =(int) (gajiPokok - (((15 - jumlahBarang)*hargaBarang)*0.15));
		} else {	//Bonus 10% setiap Barangnya
			totalGaji = (int) (gajiPokok + ((jumlahBarang*hargaBarang)*0.10));
		}
		System.out.println(totalGaji);		//Menampilkan total gaji Agent
		input.close();	//Digunakan untuk menutup koneksi input stream
	}
}