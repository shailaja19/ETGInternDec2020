package com.sonata;

public class Student {

	int stdId;
	String stdName;
	int stdClass;
	
	Student() {}
	Student(int Id,String name,int cls) {
		this.stdId=Id;
		this.stdName=name;
		this.stdClass=cls;
	}
	
	public static void main(String[] args) {
		Student s1=new Student(01,"Mohamed",10);
		s1.display();
		System.out.println();
		Student s2=new Student(02,"Naumaan",11);
		s2.display();
	}
	
	void display() {
		System.out.println(stdId);
		System.out.println(stdName);
		System.out.println(stdClass);
	}

}
