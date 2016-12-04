package hw;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數，利用函式呼叫找出一連續整數數列讓該數列的和為此一正整數，有些正整數並不能找出連續整數，若找不到時，請印出「No」。
 例如: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		fun(n);
	}
	private static void fun(int n){
		if(n<=0)
			return;
		int start=1;
		int end=2;
		int count=(n+1)/2;
		int sum=start+end;
		System.out.print(n);
		while(start<count){
			if(sum==n)
				print(start, end);
			while(sum>n){
				sum-=start;
				start++;
				if(sum==n)
					print(start, end);
			}
			end++;
			sum+=end;
		}
	}
	private static void print(int start,int end){
		System.out.print("=");
		for(int i=start;i<=end;i++){
			System.out.print(i);
			if(i<end){
				System.out.print("+");
			}
		}
		//System.out.println();
	}

	
}
