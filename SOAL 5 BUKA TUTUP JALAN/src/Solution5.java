/**
 * Program untuk membuka tutup jalan
 * @author Regi Purnama
 * @version 1
 * @since 19/02/2022
 */

import java.util.Scanner;	

public class Solution5 {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);	//Melakukan scan data inputan
		   long number = 0L;	/*Variable bertipe long yang akan menampung inputan platMobil
		   						setelah dihilangkan spasinya*/
		   String platMobil =  input.nextLine().replaceAll("\\s", "");	//Menghilangkan spasi pada inputan
		   number = Long.parseLong(platMobil);
		   input.close();	//Digunakan untuk menutup koneksi input stream
		   
		   int hasil;
		   hasil = (int) ((number - 999999)%5);	//Operasi untuk menentukan mobil jalan atau berhenti
		   
		   //Pengecekan kondisi apakah hasil = 0 atau bukan
		   if(hasil == 0) {
			   System.out.println("jalan");	//Akan ditampilkan ketika hasilnya 0
		   } else {
			   System.out.println("berhenti");		//Akan ditampilkan ketika hasilnya bukan nol
		   }
	}

}

