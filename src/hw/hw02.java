package hw;
import java.util.Scanner;
/*
 * Topic: ���ϥΪ̿�J�@�����n�A��X1+2+3+�K+m<=n���̤j���m=?
 * Date: 2016/10/24
 * Author: 105021045 �����e
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner( System.in ) ;
		System.out.print( "��J�@����� n =" ) ;
		int n = scn.nextInt() ;
		int m = 1 ;
		int sum = 0 ;
		while( sum <= n ) {
			sum = sum + m ;
			if( sum <= n ) {
			m ++ ;
			}
		}
		System.out.println( "��X 1 + 2 + 3 + �K + m <= n ���̤j��� m =" + ( m - 1 ) );
	}
}
