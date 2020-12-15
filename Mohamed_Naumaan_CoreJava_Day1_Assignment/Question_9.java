package com.sonata;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,4,4,5,6,7,1,1,1,1,1,5,8,10,10};
		int maxCount = 0;
        int num=0;
        for (int i = 0; i < a.length ; i++) 
        {
            int count = 1;
            for (int j = i+1; j < a.length ; j++)
            {
                if(a[i] == a[j])
                {
                    count++;
                }
            }
            if(maxCount < count)
            {
                maxCount = count;
                num = a[i];
            }
        }
        System.out.println("Number " + num + " has Highest Count of Duplicates with Count: " + maxCount);

	}
}
	
