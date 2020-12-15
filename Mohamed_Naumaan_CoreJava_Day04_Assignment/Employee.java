package Day04;

public class Employee extends EmpImp{
	int eid;
	String ename;
	double  salary;
	Employee(int a , String b , double c){
		 this.eid=a;
		 this.ename=b;
		 this.salary=c;
	 }
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	

}
