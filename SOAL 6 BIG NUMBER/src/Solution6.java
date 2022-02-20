/**
 * Program untuk melakukan penjumlahan dan perkalian dua bilangan yang diinput pengguna
 * @author Regi Purnama
 * @version 1
 * @since 19/02/2022
 */

import java.math.*;
import java.util.Scanner;	

public class Solution6 {
   public static void main(String []args){
       Scanner input = new Scanner(System.in);	//Melakukan scan data inputan
       String a, b;
       a = input.nextLine();	//Angka pertama
       b =input.nextLine();		//Angka kedua
       input.close();	//Digunakan untuk menutup koneksi input stream
       
       System.out.println(new BigInteger(a).add(new BigInteger(b)));	//Menampilkan penjumlahan bilangan a dan b
       System.out.println(new BigInteger(a).multiply(new BigInteger(b)));	//Menampilkan perkalian bilangan a dan b
   }
}