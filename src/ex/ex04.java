package ex;
import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/24
 * Author: 105021045 郭毓呈
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入一正整數 n =");
		int n = scn.nextInt();
		for( int a = 1 ; a <= n ; a ++ ){
		for( int b = 1 ; b <= n ; b ++ ){
		    System.out.print("*");
		    }
		    System.out.println("");
	    }
	}
}
