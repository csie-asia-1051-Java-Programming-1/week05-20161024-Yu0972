package hw;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
 * Date: 2016/10/24
 * Author: 105021045 郭毓呈
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner( System.in ) ;
		System.out.print( "輸入一正整數 n =" ) ;
		int n = scn.nextInt() ;
		int m = 1 ;
		int sum = 0 ;
		while( sum <= n ) {
			sum = sum + m ;
			if( sum <= n ) {
			m ++ ;
			}
		}
		System.out.println( "輸出 1 + 2 + 3 + … + m <= n 的最大整數 m =" + ( m - 1 ) );
	}
}
