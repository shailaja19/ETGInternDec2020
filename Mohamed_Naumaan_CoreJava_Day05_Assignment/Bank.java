package Day05;
public class Bank implements BankInterface{
		int AccId;
		String AccName;
		double deposit;
		double withdraw;
		
		public Bank () {}
		public Bank( int a , String b,double c , double d ) {
			AccId = a;
			AccName = b;
			deposit =c;
			withdraw=d;
			
		}

	@Override
	public double withDraw(double amount) {
		return 0;
	}
	@Override
	public double deposit(double amount) {
		return 0;
	}

	public double totalbalance(double amount1, double amount2) {
	   return 0;
	}
	public void display() {
		System.out.println("ID of account holder" +AccId);
		System.out.println("The name of account holder "+AccName);
		System.out.println("The withdraw amount is "+withDraw(withdraw));
		System.out.println("The totalbalance of account holder is " +totalbalance(deposit,withdraw));
	}



}
