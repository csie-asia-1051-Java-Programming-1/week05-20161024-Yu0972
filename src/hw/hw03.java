package hw;
import java.util.Scanner;
/*
 * Topic: �]�p�@�ӵ{���A���ϥΪ̿�J�@�ӥ����n�A�P�_�ÿ�Xn���h�֦���~�|�j��10000
 * Date: 2016/10/24
 * Author: 105021045 �����e
 */
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner( System.in ) ;
		System.out.print("��J�@�ӥ���� n = ") ;
		int n = scn.nextInt() ;
		int m = 1 ;
		int sum = 0 ;
		while( sum <= 10000 ) {
			sum = ( int ) Math.pow (n,m) ;
			if ( sum <= 10000 ) {
				m += 1 ;
			}
		}
			System.out.println( "n���h�֦���~�|�j��10000 = " + m + " ����" );
	}
}
