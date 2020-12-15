package com.sonata;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,20,30,40};
		System.out.println("The Array of Numbers to be reversed are");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + "  " );
		}
		System.out.println();
		System.out.println("The Reversed Array is");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i] + "  ");
		}
	}

}
