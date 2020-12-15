package Day04;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
	@SuppressWarnings("rawtypes")
	public static List<Student>getStudent(){
		 @SuppressWarnings("unchecked")
		List<Student> s=new ArrayList();
		 s.add(new Student( 1, "MN",20));
		 s.add(new Student( 2 , "Mohamed",65));
		 s.add(new Student( 3 , "Naumaan",32));
		 s.add(new Student( 4 , "Mohamed Naumaan",88));
		 s.add(new Student( 5 , "Mysore",98));
		 return s;
	}

}
