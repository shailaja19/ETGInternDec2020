//	8) Write a program to identify duplicate values in an array
package com.sonata;

public class Assignment8 {

	public static void main(String[] args) {
		int a[]= {1,2,5,4,3,4,5,6,6};
		System.out.println("Duplicate Elements are :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}
