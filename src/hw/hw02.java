package hw;

import java.util.Scanner;

/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int last=1,next=2,i=1;
		System.out.println("数列 1 :");
		while(n>=last){
			next=last+i;
			System.out.print(last+" ");
			last=next;
			i++;
		}
		
		System.out.println("数列 2 ：");
		i=1;
		while(i<=n){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			i++;
		}
	}

}
