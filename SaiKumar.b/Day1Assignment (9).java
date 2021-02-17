// 10. Find the two large numbers in an array.
package com.sonata;

public class Assignment10 {

	public static void main(String[] args) {
		int a[]= {1,4,8,112,16,2,3,6,765};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-1]+" is the first highest ");
		System.out.println(a[a.length-2]+" is the second highest ");
	}
}
