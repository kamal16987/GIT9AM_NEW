package com.test.git;

public class Lakshmi_overriding extends Lakshmi_overrideOne{
	   @Override
	public void phno(int i) {
		System.out.println("name of the user is lakshmi over ride the phno 0446575555");
	
	}
	
public static void main(String[] args) {
	Lakshmi_overriding li=new Lakshmi_overriding();
	li.phno(10);
	li.email("lakshmi@gmail.com");
}
}
