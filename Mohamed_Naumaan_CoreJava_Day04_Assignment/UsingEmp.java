package Day04;

import java.util.LinkedList;
import java.util.List;
public class UsingEmp   {

	public static void main(String[] args) {
		
        List<Employee> p1 = new LinkedList<Employee>();
		p1.add(new Employee( 121 , "mohamed" , 35000));
		p1.add(new Employee( 122 , "naumaan" , 3000));
		p1.add(new Employee( 123 , "mohamed naumaan" , 8000));
		p1.add(new Employee( 124 , "mysore" , 15000));
		for(Employee p2:p1) {
        	System.out.println("The employee id is " + p2.eid + " The employee  name is "+ p2.ename + " The employee  salary is "+ p2.salary);
        };
        for(Employee p2:p1) {
        	System.out.println( " The  yearly employee  salary is "+ p2.yearlysalary(p2.salary));
        };
        for(Employee p2:p1) {
        	if(p2.salary<10000) {
        		 double sal=p2.salary;
        		 double sal1=sal+5000;
        		System.out.println("The increased salary of employee whose salary is less than 10k is " + sal1);
        	}
        }
        
        

}}

