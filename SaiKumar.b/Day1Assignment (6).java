// 	7) Read the String and replace Ovals with dollar symbol program
package com.sonata;

public class Assignment7 {
public static void main(String[] args) {
	
	String s="sonata software,banglore";
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)== 'a' || s.charAt(i)== 'e'||s.charAt(i)== 'i'||s.charAt(i)== 'o'||s.charAt(i)== 'u')
		{
			ch[i]='$';
		}
	}
	for(int i=0;i<s.length();i++)
	{
		System.out.print(ch[i]);
	}
	
	}
}
