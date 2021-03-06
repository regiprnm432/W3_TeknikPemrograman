/**
 * Program untuk mengerjakan lima operator matematika
 * @author Regi Purnama
 * @version 1
 * @since 19/02/2022
 */

import java.util.Scanner;	

public class Solution3 {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)){	//Melakukan scan data inputan
			int hasil = 0;		//variable hasil akan menampunng hasil operator
			int A = input.nextInt();	//Angka pertama
			String operator = input.next();		//Operator matematika
			int B = input.nextInt();	//Angka kedua
			
			//Percabangan untuk menentukan operator
			switch (operator) {
			case("+"):	//Operator penjumlahan
				hasil = A+B;
				break;
			case("-"):	//Operator pengurangan
				hasil = A-B;
				break;
			case("*"):	//Operator perkalian
				hasil = A*B;
				break;
			case("/"):	//Operator pembagian
				hasil = A/B;
				break;
			case("%"):	//Operator sisa hasil bagi
				hasil = A%B;
				break;
			}
			System.out.printf("%d", hasil);	//Menampilkan output hasil
		}catch (Exception e) {
			System.out.println("Error!!! Silahkan coba lagi!!!"); 
		}
	}
}