package hw;

import java.util.Scanner;
import java.util.Scanner;

public class hw01 {

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
