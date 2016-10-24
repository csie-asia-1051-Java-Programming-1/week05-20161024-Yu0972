package ex;
import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021045 郭毓呈
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.print("輸入一個正整數 n =");
		int n = scn.nextInt();
		int m = 0;
		for(int x = 1 ; x <= n ; x ++ ) {
			m = (int) (Math.pow( 2 , x ) + m) ;
			}
		System.out.println( "2^1+2^2+2^3+...+2^n=" + m );
	}

}
