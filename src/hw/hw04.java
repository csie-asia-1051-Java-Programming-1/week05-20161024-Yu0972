package hw;
import java.util.Scanner;
/*
 * Topic: ���ϥΪ̿�J�@�����n�A�p��1/(1*2)+
 * 1/(3*4)+1/(5*6)+�K+1/[(2n-1)*(2n)]�ÿ�X���G
 * Date: 2016/10/24
 * Author: 105021045 �����e
 */
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		System.out.print("��J�@�ӥ���� n = ") ;
		float n = scn.nextInt () ;
		float sum = 0 ;
		for ( double i = 1 ; i < ( n + 1 ) ; i += 2 ){
			sum = (float) ( ( sum + 1 ) / ( i * ( i + 1 ) ) );
		}
		System.out.print( "�p�⵲�G" + sum );
	}
}
