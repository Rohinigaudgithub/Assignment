package com.array.real;

public class Connection {
	private int connid;
	private int customerid;
	private String email;
	private double balance;
	//0 param cotriuctor 
	public Connection() {
		super();
	}
	public Connection(int connid, int customerid, String email, double balance) {
		super();
		this.connid = connid;
		this.customerid = customerid;
		this.email = email;
		this.balance = balance;
	}
	public int getConnid() {
		return connid;
	}
	public void setConnid(int connid) {
		this.connid = connid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Connection [connid=" + connid + ", customerid=" + customerid + ", email=" + email + ", balance="
				+ balance + "]";
	}
	

	
	
	
}
