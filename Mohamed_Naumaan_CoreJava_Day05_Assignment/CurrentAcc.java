package Day05;
public class CurrentAcc  extends Bank implements BankInterface{
	 CurrentAcc(){}
	 public CurrentAcc( int a , String b,double c, double d) {
			super(a,b,c,d);
		}
	 
	 @Override
	 public double withDraw(double amount) {
	 	return amount;
	 }
	 @Override
	 public double deposit(double amount) {
	 	return amount;
	 }
	
	 public double totalbalance(double amount1, double amount2) {
	 	return  amount1-amount2;
	 }
	 public static void main(String[] args) {
			
			CurrentAcc s1 = new CurrentAcc(01 , "Mohamed Naumaan" , 4000,3000);
			CurrentAcc s2 = new CurrentAcc(01 , "Abc" , 43000,23000);

			s1.display();
			s2.display();
			
	 }
}
	 
