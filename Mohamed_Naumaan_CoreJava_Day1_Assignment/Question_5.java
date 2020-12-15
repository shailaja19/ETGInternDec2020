package com.sonata;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {5,10,15,20,22,25,28,30};
        int value = 25;
        boolean found = false;

        for (int n : num) {
            if (n == value) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("This Array Contains" + value);
        else
            System.out.println("This Array Does Not Contain" + value);
	}

}
