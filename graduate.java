package java4;
public class graduate implements student,teacher{
	
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	
	
	public void setPay(double pay) {
		this.pay = pay * 12;
		System.out.println("你的年收入为：" + this.pay);
	}
	
	
	public void getPay(double pay) {
		this.pay = pay * 12;
		System.out.println("你的年收入为：" + this.pay);
	}
	
	
	@Override
	public void setFee(double fee) {
		this.fee = fee;
		System.out.println("你的学费设置为：" + this.fee);
	}
	
	
	public void getFee(double fee) {
		this.fee = fee;
		System.out.println("你的学费为：" + this.fee);
	}
	
	public boolean taxes(){
		if ((this.pay - this.fee) < 5000) {
			System.out.println("你的年收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
			return true;
		}
		System.out.println("你的年收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
		return false;
	}	

}
