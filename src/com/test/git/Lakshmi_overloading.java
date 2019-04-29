package com.test.git;



public class Lakshmi_overloading {
	public void phno(long ph) {
System.out.println(ph);
	}
	public void phno(long ph, String name) {
		System.out.println(ph+","+name);

	}	
	
	public void phno(long ph, String name,String email) {
		System.out.println(ph+","+name+","+email);

	}
	public static void main(String[] args) {
		Lakshmi_overloading lo=new Lakshmi_overloading();
		lo.phno(7418569828l);
	lo.phno(7457578475l, "Lakshmi");
	lo.phno(74185668985l, "lakshmi", "lakshmi@gmail.com");
		
	
	}
}
