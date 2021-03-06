/**
 * Program untuk menghitung jumlah kata dalam kalimat yang diinput pengguna
 * @author Regi Purnama
 * @version 1
 * @since 19/02/2022
 */

import java.util.*;	

public class Solution1 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in); //Melakukan scan data inputan
		String sentence = input.nextLine();  
		
		String[] word  = sentence.trim().split("[!,?._'@\\ ]"); //Memecah kata dan simbol
		int count = word.length; //Variable count berisi jumlah kata
		
		System.out.println(count); //menampilkan nilai variable count
		for(int i = 0; i < count ; i++) { //Looping untuk menampilkan kata per kata
			System.out.println(word[i]); 
		}
		input.close();	//Digunakan untuk menutup koneksi input stream
    }
}
