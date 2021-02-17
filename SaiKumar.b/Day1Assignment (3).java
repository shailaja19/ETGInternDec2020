/*4) Write a java program to sum values of an array. For example a[5]
={1,2,3,4,5,6} the sum of the values is 21.*/
package com.sonata;

public class Assignment4 {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
		}
		System.out.println(sum+" is the sum of array elements");
	}
}