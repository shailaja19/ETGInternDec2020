package Day05;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
	synchronized void read()
	{   
          try { 
			BufferedReader br = new BufferedReader(new FileReader
					 ("F:\\testout.txt"));
			System.out.println(br.readLine());	
		Thread.sleep(500);}
		catch(Exception e) {System.out.println(e);}
	     
	}
}
	


