package Day05;

public class ReadFile2  extends Thread{
	ReadFile line; 
	  
    ReadFile2(ReadFile line) 
    { 
        this.line = line; 
    } 
  
    @Override
    public void run() 
    { 
        line.read(); 
    } 
} 

