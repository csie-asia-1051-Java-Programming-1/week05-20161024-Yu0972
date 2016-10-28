package hw;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數n，計算1/(1*2)+
 * 1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果
 * Date: 2016/10/24
 * Author: 105021045 郭毓呈
 */
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		System.out.print("輸入一個正整數 n = ") ;
		float n = scn.nextInt () ;
		float sum = 0 ;
		for ( double i = 1 ; i < ( n + 1 ) ; i += 2 ){
			sum = (float) ( ( sum + 1 ) / ( i * ( i + 1 ) ) );
		}
		System.out.print( "計算結果" + sum );
	}
}
