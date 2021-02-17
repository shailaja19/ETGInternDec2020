//	5) Write a java program to test if an array contains a specific value
package com.sonata;

public class Assignment5 {
public static void main(String[] args) {
	int a[]= {6,7,4,2,5,1,3};
	int target=3;
	int c=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==target)
		{
			System.out.println("element is present at location "+i);
			c++;
		}
		
	}
	if(c==0)
		System.out.println("element is not present");
} 
}
