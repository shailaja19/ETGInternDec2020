package com.sonata;

public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int a[]= {1,2,5,11,25,60,90,150,89};
			int largest1,largest2,temp;
			
			largest1=a[0];
			largest2=a[1];
			
			if(largest1<largest2)
			{
				temp=largest1;
				largest1=largest2;
				largest2=temp;
			}
			for(int i=2; i < a.length; i++)
			{
				if (a[i] > largest1)
				{
					largest2 = largest1;
					largest1 = a[i];
				}
				else if (a[i] > largest2 && a[i] != largest1)
				{
					largest2 = a[i];
				}
			}
			System.out.println ("The First largest is " + largest1);
			System.out.println ("The Second largest is " + largest2);
		}
	}

}
