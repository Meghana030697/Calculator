package com.epsilon.training.sb.calculator.bo;

public class Calculator {

	private int ip1, ip2;

	public int getIp1() {
		return ip1;
	}

	public void setIp1(int ip1) {
		this.ip1 = ip1;
	}

	public int getIp2() {
		return ip2;
	}

	public void setIp2(int ip2) {
		this.ip2 = ip2;
	}

	public Calculator() {
		//super();
		System.out.println("Calculator instance is created");
		// TODO Auto-generated constructor stub
	}
	public int add(int i, int j)
	{
		return i+j;
	}
	public int sub(int i, int j)
	{
		return i-j;
	}
	public int mul(int i, int j)
	{
		return i*j;
	}
	public int div(int i, int j)
	{
		return i/j;
	}
	public int modulo(int i, int j)
	{
		return i%j;
	}
}
