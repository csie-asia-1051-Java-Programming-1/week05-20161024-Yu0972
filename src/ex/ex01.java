package ex;
import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021045 郭毓呈
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner scn = new Scanner(System.in);
    	System.out.print("輸入一正整數=");
    	int n = scn.nextInt();
    	int x = n;
    	int m = 1;
        for (int i = x; i > 0; i -- ){ 
        m = m * i;
        }
        System.out.println(n+"!"+"="+m);

	}

}
