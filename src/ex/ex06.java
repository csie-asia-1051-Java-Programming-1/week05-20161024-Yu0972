package ex;
import java.util.Scanner;

/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021045 郭毓呈
 */

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in) ;
		System.out.print ("學生數量=") ;
		int n = scn.nextInt();
		int [] data = new int [n] ;
		System.out.println ( "輸入學號=" ) ;
		for ( int b = 0 ; b < data.length ; b ++ ){
			 data [b] = scn.nextInt() ;
		}
		int a =0;
		for ( int b = 0 ; b < data.length ; b ++ ) {
		for ( int c = 0 ; c < data.length - 1 ; c++){
		if ( data [ b ] < data [c] ){
			a = data [b] ;
				data [b] = data[c] ;
				data [c] = a ;
				}
			}
		}
		for ( int b = 0 ; b < data.length ; b ++ ) {
			System.out.print ( data[b] + "\t" ) ;
		}
	}
}
