package Day05;
public class SavingAcc  extends Bank implements BankInterface{
	 SavingAcc(){}
	 public SavingAcc( int a , String b,double c, double d) {
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
			
			SavingAcc s1 = new SavingAcc(01 , "Mohamed Naumaan" , 4000,3000);
			s1.display();
			
	 }
}
	 
 


