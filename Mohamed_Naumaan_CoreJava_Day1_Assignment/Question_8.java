package com.sonata;

public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,9,8,7,5,4,1,10,8};   
        
        System.out.println("Duplicate values in the array are: ");
        for(int i = 0; i < array.length; i++) {  
            for(int j = i + 1; j < array.length; j++) {  
                if(array[i] == array[j])  
                    System.out.println(array[j]);  
            }  
        }  
    }  
	}
