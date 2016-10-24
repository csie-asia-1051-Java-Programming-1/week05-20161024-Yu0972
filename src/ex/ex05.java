package ex;
import java.util.Random;

/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 105021045 郭毓呈
 */

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Random randnum = new Random();
		randnum.setSeed(001);
		int data [] []= new int [10] [10] ;
		for ( int a = 0 ; a < 10 ; a ++ ){
		for ( int b = 0 ; b < 10 ; b ++ ){
			  data[a][b] =rnd.nextInt(10);
		System.out.print( data[a][b] + "\t" );
	    }
		System.out.println();
		}
		System.out.println();
		System.out.println("行列轉換後=");
		for ( int a = 0 ; a < 10 ; a++ ){
		for ( int b = 0 ; b < 10 ; b++ ){				
		System.out.print( data[b][a] + "\t" );
		}
		System.out.println();
		}
	}
}
