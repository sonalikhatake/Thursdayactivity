//author :sonali

package com.question1;
import java.util.Scanner;
public class Sumof extends  ReverseNO  
{
public void sumIs()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number to find the sum");
	int num=sc.nextInt();
	int sum=0,digit;

	while(num>0)
	{
		digit=num % 10;
		sum=sum + digit;
		num=num / 10;

	}
	System.out.println("the sum is "+sum);

}

}
 