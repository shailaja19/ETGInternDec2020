package Day05;

public class SynMain {

	public static void main(String[] args) {
		ReadFile obj = new ReadFile();
		ReadFile2 s1= new ReadFile2(obj);
		ReadFile2 s2= new ReadFile2(obj);
		s1.start();
		s2.start();
		}

}
