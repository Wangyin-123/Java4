package java4;
public class graduate implements student,teacher{
	
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	
	
	public void setPay(double pay) {
		this.pay = pay * 12;
		System.out.println("���������Ϊ��" + this.pay);
	}
	
	
	public void getPay(double pay) {
		this.pay = pay * 12;
		System.out.println("���������Ϊ��" + this.pay);
	}
	
	
	@Override
	public void setFee(double fee) {
		this.fee = fee;
		System.out.println("���ѧ������Ϊ��" + this.fee);
	}
	
	
	public void getFee(double fee) {
		this.fee = fee;
		System.out.println("���ѧ��Ϊ��" + this.fee);
	}
	
	public boolean taxes(){
		if ((this.pay - this.fee) < 5000) {
			System.out.println("���������" + this.pay + ",��ȥѧ��" + this.fee + "����" + (this.pay - this.fee));
			return true;
		}
		System.out.println("���������" + this.pay + ",��ȥѧ��" + this.fee + "����" + (this.pay - this.fee));
		return false;
	}	

}
