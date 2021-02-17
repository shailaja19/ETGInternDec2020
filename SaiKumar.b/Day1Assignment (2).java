/*3) Write a java program to display the cube of the given number for ex:
if given number is 2 then cube of it is 8*/
package com.sonata;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int cube=1;
		for(int i=0;i<3;i++)
		{
			cube=cube*num;
		}
		System.out.println(cube+" is the cube of "+num);
	}

}
