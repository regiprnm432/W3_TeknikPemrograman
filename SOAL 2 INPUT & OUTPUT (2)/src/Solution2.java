/**
 * Program untuk mengkonversi inputan menjadi tiga digit
 * @author Regi Purnama
 * @version 1
 * @since 19/02/2022
 */

import java.util.Scanner;	

    public class Solution2 {

        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);	//Melakukan scan data inputan
                System.out.println("================================");	//Menampilkan garis ke layar
                for(int i=0;i<3;i++)	//Looping untuk proses pemindaian
                {
                    String s1=sc.next();	//Untuk melakukan scan kata
                    int x=sc.nextInt();		//Untuk melakukan scan angka
                    System.out.printf( "%-15s%03d %n", s1, x);	//Menampilkan output program
                }
                System.out.println("================================");	//Menampilkan garis ke layar
                sc.close();		//Digunakan untuk menutup koneksi input stream
        }
    }