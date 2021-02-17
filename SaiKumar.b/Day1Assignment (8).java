//	9) Read the highest count of duplicates from array of integers
package com.sonata;

public class Assignment9 {
public static void main(String[] args) {
	int a[]={1,2,3,4,5,1,2,1,3,1,4,1};
	int max = 0,ele=0;
	for (int i=0;i<a.length;i++)
	{
	       int count = 0;
	       for (int j=0;j<a.length;j++)
	       {
	         if (a[i]==a[j])
	             count++;
	       }
	  if (count >= max)
	  {
	      max = count;
	      ele=a[i];
	  }
	}
	System.out.println(max+" is the count of" +ele);
	}
}
