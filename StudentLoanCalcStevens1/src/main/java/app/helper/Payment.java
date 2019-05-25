package app.helper;

public class Payment {
	private double pmt;		// this is the payment each month
	private double ppmt;	// this is the payment to the principle
	private double ipmt;	// this is the payment to the interest
	private double apmt;	// this is the additional payment each month
	
	// this will build the payment
	public Payment(double payment, double ppayment, double ipayment, double apayment) {
		this.pmt = payment;
		this.ppmt = ppayment;
		this.ipmt = ipayment;
		this.apmt = apayment;
	}
	public double getPmt() {
		return this.pmt;
	}
	public void setPmt(double ppt) {
		this.pmt = ppt;
	}
	public double getPpmt() {
		return this.ppmt;
	}
	public void setPpmt(double ppmt) {
		this.ppmt = ppmt;
	}
	public double getIpmt() {
		return this.ipmt;
	}
	public void setIpmt(double ipmt) {
		this.ipmt = ipmt;
	}
	public double getApmt()  {
		return this.apmt;
	}
	public double setApmt(double apmt) {
		return this.apmt = apmt;
	}
}
