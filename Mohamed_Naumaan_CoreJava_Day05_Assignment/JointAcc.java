package Day05;

public class JointAcc  extends Bank implements BankInterface{
	 JointAcc(){}
	 public JointAcc( int a , String b,double c, double d) {
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
			
			JointAcc s1 = new JointAcc(01 , "Mohamed Naumaan" , 4000,3000);
			JointAcc s2 = new JointAcc(01 , "Abc" , 10000,6500);

			s1.display();
			s2.display();
			
	 }
}
	 