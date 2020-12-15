package Day05;

public class Product {
	int pid;
	String pname;
    double price;
   Product(int a,String b,double c){
	   this.pid=a;
	   this.pname=b;
	   this.price=c;
   }
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
}
}
   

