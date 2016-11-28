package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int n=sca.nextInt();
		int arr1[]=new int[1000];
		int arr2[]=new int[1000];
		int len1=1,len2=0;
		arr1[0]=1;
		for(int i=2;i<=n;i++){
			if(n%i==0)
			{
				arr1[len1++]=i;
				if(Judge(i))
					arr2[len2++]=i;
			}
		}
		System.out.println("因數");
		for(int i=0;i<len1;i++)
		{
			System.out.println(arr1[i]+"");
		}
		System.out.println("\n質數：");
		for(int i=0;i<len2;i++)
		{
			System.out.println(arr1[i]+"");
		}
	}

	private static boolean Judge(int x) {
	  int b=(int)Math.sqrt((double)x);
	  int i;
	  for(i=2;i<=b;i++)
	  {
		  if(x%i==0)
			  break;
	  }
	  if(i>=b+1)
		return true;
	  else
		  return false;
	}

	}