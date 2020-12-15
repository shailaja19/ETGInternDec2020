package Day04;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Student>{

@Override
public int compare(Student o1, Student o2) {
	return (int)(o2.getMarks() - o1.getMarks());
   }
}


public class SortStudent {
	public static void main(String[]args) {
		 List<Student> P = StudentData.getStudent();
		 //WITH LAMBDA
		 Collections.sort (P , (o1,o2) ->(int)(o2.getMarks() - o1.getMarks()));
		 System.out.println(P);
		 
		
	 }

}
